package com.yorkyu.newsvision.bean;

public class Imgextra {
    private static final long serialVersionUID = 3L;
    private String imgsrc = "";

    public void setImgsrc(String imgsrc) {
        this.imgsrc = imgsrc;
    }

    public String getImgsrc() {
        return this.imgsrc;
    }

    @Override
    public String toString() {
        return "imgextra{" +
                "imgsrc='" + imgsrc + '\'' +
                '}';
    }
}
