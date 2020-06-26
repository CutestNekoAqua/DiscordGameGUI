package me.waterdev.dgg.RPC;

import net.arikia.dev.drpc.DiscordEventHandlers;
import net.arikia.dev.drpc.DiscordRPC;
import net.arikia.dev.drpc.DiscordRichPresence;

import static me.waterdev.dgg.DGG.stringshandler;

public class Manager {

    //Default Values boooiiis

    private String appid = "686232754198806650";
    private String state = "but forever alone";
    private String details = "He is really cute :3";

    private int partyMax = 1;

    private String BigImg = "firstbig";
    private String BigTxt = "";

    private String SmallImg = "smol";

    private boolean countdown = false;
    private long timer = 0;

    public void init() {

        try {

            DiscordEventHandlers handlers = new DiscordEventHandlers.Builder().setReadyEventHandler((user) -> System.out.println("Welcome " + user.username + "#" + user.discriminator + "!")).build();

            DiscordRPC.discordInitialize(appid, handlers, true);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

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

    public boolean set() {

        try {

            DiscordRichPresence rich;

            if(countdown) {

                rich = new DiscordRichPresence.Builder(state).setDetails(details).setEndTimestamp(timer).setParty(stringshandler.getParty(), 1, partyMax).setBigImage(BigImg, BigTxt).setSmallImage(SmallImg, "Custom Rich Presence made by Waterdev").setSecrets(stringshandler.getJoin(), stringshandler.getSpec()).build();

            } else {

                rich = new DiscordRichPresence.Builder(state).setDetails(details).setStartTimestamps(System.currentTimeMillis()).setParty(stringshandler.getParty(), 1, partyMax).setBigImage(BigImg, BigTxt).setSmallImage(SmallImg, "Custom Rich Presence made by Waterdev").setSecrets(stringshandler.getJoin(), stringshandler.getSpec()).build();

            }

            DiscordRPC.discordUpdatePresence(rich);

            return true;

        } catch (Exception e) {
            System.out.println("Oooops! Error occured: " + e.getMessage());
            return false;
        }

    }

    public void shutdown() {

        DiscordRPC.discordShutdown();

    }

}
