package JAVAProject.JAVAPro;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class leave {
    @Id
    @GeneratedValue
    private int id;
    private String reason;
    private String startDate;
    private String endDate;
    private int isHalfDay;
    private String leaveType;
    private String status;
    private String appliedDate;
    private String updatedDate;

    public leave() {
        super();
    }

    public leave(String status) {
        this.status = status;
    }

    public leave(int id, String reason, String startDate, String endDate, int isHalfDay, String leaveType, String status, String appliedDate, String updatedDate) {
        this.id = id;
        this.reason = reason;
        this.startDate = startDate;
        this.endDate = endDate;
        this.isHalfDay = isHalfDay;
        this.leaveType = leaveType;
        this.status = status;
        this.appliedDate = appliedDate;
        this.updatedDate = updatedDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getIsHalfDay() {
        return isHalfDay;
    }

    public void setIsHalfDay(int isHalfDay) {
        this.isHalfDay = isHalfDay;
    }

    public String getLeaveType() {
        return leaveType;
    }

    public void setLeaveType(String leaveType) {
        this.leaveType = leaveType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAppliedDate() {
        return appliedDate;
    }

    public void setAppliedDate(String appliedDate) {
        this.appliedDate = appliedDate;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }
}