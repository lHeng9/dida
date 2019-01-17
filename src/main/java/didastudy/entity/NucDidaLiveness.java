package didastudy.entity;

public class NucDidaLiveness {
    private Long id;

    private Integer postNum;

    private Integer replyNum;

    private Integer signinNum;

    private Integer continuousNum;

    private Integer number;

    private Long integralId;

    private String gmtCreate;

    private String gmtModified;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPostNum() {
        return postNum;
    }

    public void setPostNum(Integer postNum) {
        this.postNum = postNum;
    }

    public Integer getReplyNum() {
        return replyNum;
    }

    public void setReplyNum(Integer replyNum) {
        this.replyNum = replyNum;
    }

    public Integer getSigninNum() {
        return signinNum;
    }

    public void setSigninNum(Integer signinNum) {
        this.signinNum = signinNum;
    }

    public Integer getContinuousNum() {
        return continuousNum;
    }

    public void setContinuousNum(Integer continuousNum) {
        this.continuousNum = continuousNum;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Long getIntegralId() {
        return integralId;
    }

    public void setIntegralId(Long integralId) {
        this.integralId = integralId;
    }

    public String getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate == null ? null : gmtCreate.trim();
    }

    public String getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified == null ? null : gmtModified.trim();
    }
}