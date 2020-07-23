package JAVAProject.JAVAPro;

import java_project.Main.leaveRowMapper;
import net.minidev.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
public class JavaProApplication {
	@Autowired
	JdbcTemplate jdbc;
	public static void main(String[] args) {
		SpringApplication.run(JavaProApplication.class, args);
	}

	@PostMapping(value = "/leave")
	public String hello(@RequestBody leave l) {
		System.out.println("insert into java.leave()  values("+l.getId()+",'"+l.getReason()+"','"+l.getStartDate()+"','"+l.getEndDate()+"',"+l.getIsHalfDay()+",'"+l.getLeaveType()+"','"+l.getStatus()+"','"+l.getAppliedDate()+"','"+l.getUpdatedDate()+"')");
		jdbc.execute("insert into java.leave()  values("+l.getId()+",'"+l.getReason()+"','"+l.getStartDate()+"','"+l.getEndDate()+"',"+l.getIsHalfDay()+",'"+l.getLeaveType()+"','"+l.getStatus()+"','"+l.getAppliedDate()+"',"+l.getUpdatedDate()+")");
		System.out.println("data inserted Successfully");
		return"data inserted Successfully";
	}
	@PutMapping(value = "/leave/{leaveid}")
	public String update(@RequestBody leave l,@PathVariable int leaveid)
	{
		String sql="update java.leave set status=? where leave_id=?";
		jdbc.update(sql,l.getStatus(),leaveid);
		return "String updated";
	}
@GetMapping(value = "/leave")
	public String view()
{String sql="Select * from java.leave";
List<leave> select=jdbc.query(sql,new leaveRowMapper());
String st= JSONArray.toJSONString(select);
return st;

}
@GetMapping(value = "/leave/{status}")
	public String selectedquer(@PathVariable String status)
{
	String sql="select * from java.leave where status=?";
	System.out.println(status);
	List<leave> querie=jdbc.query(sql,new Object[]{status},new leaveRowMapper());
	return JSONArray.toJSONString(querie);
}
@DeleteMapping(value = "/leave/{leaveid}")
	public String delete(@PathVariable int leaveid)
{
	String sql="select * from java.leave where leave_id=?";
	List<leave> querie=jdbc.query(sql,new Object[]{leaveid},new leaveRowMapper());
	String deleteqr="delete from java.leave where leave_id=?";
	jdbc.update(deleteqr,leaveid);
	return JSONArray.toJSONString(querie);
}
	
}
