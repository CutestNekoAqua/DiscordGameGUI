package me.waterdev.dgg.Yaml;

public class YamlObject {

    private String appid = "686232754198806650";
    private String state = "but forever alone";
    private String details = "He is really cute :3";

    private int partyMax = 1;

    private String BigImg = "firstbig";
    private String BigTxt = "";

    private String SmallImg = "smol";

    private boolean countdown = false;
    private long timer = 0;

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setPartyMax(int partyMax) {
        this.partyMax = partyMax;
    }

    public void setBigImg(String bigImg) {
        BigImg = bigImg;
    }

    public void setBigTxt(String bigTxt) {
        BigTxt = bigTxt;
    }

    public void setSmallImg(String smallImg) {
        SmallImg = smallImg;
    }

    public void setCountdown(boolean countdown) {
        this.countdown = countdown;
    }

    public void setTimer(long timer) {
        this.timer = timer;
    }

    public String getAppid() {
        return appid;
    }

    public String getState() {
        return state;
    }

    public String getDetails() {
        return details;
    }

    public int getPartyMax() {
        return partyMax;
    }

    public String getBigImg() {
        return BigImg;
    }

    public String getBigTxt() {
        return BigTxt;
    }

    public String getSmallImg() {
        return SmallImg;
    }

    public boolean isCountdown() {
        return countdown;
    }

    public long getTimer() {
        return timer;
    }

}
