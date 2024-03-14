package ems.example.ems.models;

import jakarta.persistence.*;


@Entity
@Table(name = "tasks_table")
public class Tasks {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "task_id")
    private long taskid;

   @Column(name = "task_name")
   private String taskname;

   @Column(name = "task_count")
    private long taskcount;

   @Column(name = "Employee_id")
   private long Employeeid;

    public long getTaskid() {
        return taskid;
    }

    public void setTaskid(long taskid) {
        this.taskid = taskid;
    }

    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname;
    }

    public long getTaskcount() {
        return taskcount;
    }

    public void setTaskcount(long taskcount) {
        this.taskcount = taskcount;
    }

    public long getEmployeeid() {
        return Employeeid;
    }

    public void setEmployeeid(long employeeid) {
        Employeeid = employeeid;
    }
}
