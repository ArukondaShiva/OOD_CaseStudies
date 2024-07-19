package org.example.wicketruncommentaryimpl;

import org.example.enumerationimpl.WicketType;
import org.example.playerrecordplayerteamtournmnetimpl.Player;

public class Wicket {

    private WicketType wicketType;
    private Player batsman;
    private Player by;


    public WicketType getWicketType(){
        return wicketType;
    }

    public void setWicketType(WicketType wicketType){
        this.wicketType = wicketType;
    }

    public Player getBatsman(){
        return batsman;
    }

    public void setBatsman(){
        this.batsman = batsman;
    }

    public Player getBy(){
        return by;
    }

    public void setBy(Player by){
        this.by = by;
    }

}
