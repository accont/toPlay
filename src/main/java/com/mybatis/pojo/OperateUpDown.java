package com.mybatis.pojo;

/**
 * Created by admin on 2016/4/20.
 */
public class OperateUpDown {
    private int id;

    private String upIp;

    private String downIp;

    private int uId;

    private int blogId;

    private int thumb;

    private int step;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUpIp() {
        return upIp;
    }

    public void setUpIp(String upIp) {
        this.upIp = upIp;
    }

    public String getDownIp() {
        return downIp;
    }

    public void setDownIp(String downIp) {
        this.downIp = downIp;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public int getBlogId() {
        return blogId;
    }

    public void setBlogId(int blogId) {
        this.blogId = blogId;
    }

    public int getThumb() {
        return thumb;
    }

    public void setThumb(int thumb) {
        this.thumb = thumb;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }
}
