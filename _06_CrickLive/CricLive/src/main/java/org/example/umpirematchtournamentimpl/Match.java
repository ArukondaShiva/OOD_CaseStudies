package org.example.umpirematchtournamentimpl;

import org.example.enumerationimpl.MatchType;
import org.example.playerrecordplayerteamtournmnetimpl.PlayingEleven;
import org.example.wicketruncommentaryimpl.Inning;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Match {

    private PlayingEleven team1;
    private PlayingEleven team2;
    private String venue;
    private LocalDateTime dateTime;
    private ArrayList<Inning> innings;
    private String resultSummary;
    private MatchType type;


    public Match(PlayingEleven team1, PlayingEleven team2,String venue, LocalDateTime dateTime, MatchType type){
        this.team1 = team1;
        this.team2 = team2;
        this.venue = venue;
        this.dateTime = dateTime;
        this.type = type;
        this.innings = new ArrayList<>();
    }

    public PlayingEleven getTeam1(){
        return team1;
    }

    public void setTeam1(PlayingEleven team1){
        this.team1 = team1;
    }

    public PlayingEleven getTeam2(){
        return team2;
    }

    public void setTeam2(PlayingEleven team2){
        this.team2 = team2;
    }

    public String getVenue(){
        return venue;
    }

    public void setVenue(String venue){
        this.venue = venue;
    }

    public LocalDateTime getDateTime(){
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime){
        this.dateTime = dateTime;
    }

    public ArrayList<Inning> getInnings(){
        return innings;
    }

    public void setInnings(ArrayList<Inning> innings){
        this.innings = innings;
    }

    public String getResultSummary(){
        return resultSummary;
    }

    public void setResultSummary(String resultSummary){
        this.resultSummary = resultSummary;
    }

    public MatchType getType(){
        return type;
    }

    public void setType(MatchType type){
        this.type = type;
    }

}
