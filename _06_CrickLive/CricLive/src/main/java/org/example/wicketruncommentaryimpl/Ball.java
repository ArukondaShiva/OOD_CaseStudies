package org.example.wicketruncommentaryimpl;

import org.example.enumerationimpl.DeliveryType;
import org.example.playerrecordplayerteamtournmnetimpl.Player;

public class Ball {

    private Player bowler;
    private Player batsman;
    private DeliveryType type;
    private Run run;
    private Wicket wicket;
    private Commentary commentary;


    public Ball(Player bowler,Player batsman){
        this.batsman = batsman;
        this.bowler = bowler;
    }


    public Player getBowler() {
        return bowler;
    }

    public void setBowler(Player bowler) {
        this.bowler = bowler;
    }

    public Player getBatsman() {
        return batsman;
    }

    public void setBatsman(Player batsman) {
        this.batsman = batsman;
    }

    public DeliveryType getType() {
        return type;
    }

    public void setType(DeliveryType type) {
        this.type = type;
    }

    public Run getRun() {
        return run;
    }

    public void setRun(Run run) {
        this.run = run;
    }

    public Wicket getWicket() {
        return wicket;
    }

    public void setWicket(Wicket wicket) {
        this.wicket = wicket;
    }

    public Commentary getCommentary() {
        return commentary;
    }

    public void setCommentary(Commentary commentary) {
        this.commentary = commentary;
    }
}
