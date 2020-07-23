package java_project.Main;



import JAVAProject.JAVAPro.leave;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class leaveRowMapper implements RowMapper<leave> {

    @Override
    public leave mapRow(ResultSet rs, int rowNum) throws SQLException {

        leave customer = new leave();
        customer.setId(rs.getInt("leave_id"));
        customer.setReason(rs.getString("reason"));
        customer.setStartDate(rs.getString("startDate"));
        customer.setEndDate(rs.getString("endDate"));
        customer.setIsHalfDay(rs.getInt("isHalfDay"));
        customer.setLeaveType(rs.getString("leaveType"));
        customer.setStatus(rs.getString("status"));
        customer.setAppliedDate(rs.getString("appliedDate"));
        customer.setUpdatedDate(rs.getString("updatedDate"));

        return customer;

    }
}