package com.test.serializable;

import java.io.Serializable;
import java.util.Date;

public class Article implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -2156061390870693724L;

    private Integer id;

    private String title;

    private String content;

    private String faceIcon;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFaceIcon() {
        return faceIcon;
    }

    public void setFaceIcon(String faceIcon) {
        this.faceIcon = faceIcon;
    }

    public Date getPostTime() {
        return postTime;
    }

    public void setPostTime(Date postTime) {
        this.postTime = postTime;
    }

    public String getIpAddr() {
        return ipAddr;
    }

    public void setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    private Date postTime;

    private String ipAddr;

}
