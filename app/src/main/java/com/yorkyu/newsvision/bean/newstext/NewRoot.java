package com.yorkyu.newsvision.bean.newstext;

public class NewRoot {
    private com.hhxplaying.neteasedemo.netease.bean.newstext.NewsID newsID;

    public void setNewsID(NewsID newsID){
        this.newsID = newsID;
    }
    public NewsID getNewsID(){
        return this.newsID;
    }

    @Override
    public String toString() {
        return "NewRoot{" +
                "newsID=" + newsID +
                '}';
    }
}