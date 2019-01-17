package didastudy.entity;

import java.util.Date;

public class NucDidaStudent {
    private Long id;

    private String number;

    private String classes;

    private Long livenessId;

    private Date gmtCreate;

    private Date gmtModified;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public String getClasses() {
        return classes;
    }

    public void setClass(String classes) {
        this.classes = classes == null ? null : classes.trim();
    }

    public Long getLivenessId() {
        return livenessId;
    }

    public void setLivenessId(Long livenessId) {
        this.livenessId = livenessId;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}