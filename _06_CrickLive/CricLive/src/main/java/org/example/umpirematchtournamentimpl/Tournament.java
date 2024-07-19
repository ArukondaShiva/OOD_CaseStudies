package org.example.umpirematchtournamentimpl;

import org.example.enumerationimpl.TournamentType;
import org.example.playerrecordplayerteamtournmnetimpl.Team;
import org.example.wicketruncommentaryimpl.Inning;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Tournament {

    private TournamentType type = TournamentType.UPCOMING;
    private ArrayList<Match> matches;
    private String title;
    private String host;
    private String year;
    private Team team;
    private HashMap<String,Match> schedule;
    private HashMap<String, Integer> teamPoints;



    public Tournament(String title,String host,String year){
        this.title = title;
        this.host = host;
        this.year = year;
        this.matches = new ArrayList<>();
        this.schedule = new HashMap<>();
        this.teamPoints = new HashMap<>();
    }

    public void addMatch(Match match){
        matches.add(match);
        LocalDateTime dateTime = match.getDateTime();
        String dateTimeString = dateTime.toString();
        schedule.put(dateTimeString,match);
    }


    public void updateTeamPoints(String teamName, int newPoints){
        teamPoints.put(teamName, teamPoints.get(teamName)+newPoints);
    }


    public Map<String,Match> getTeamSchedule(String teamName){

        Map<String,Match> result = schedule.entrySet()
                .stream()
                .filter(map -> (map.getValue().toString().indexOf(teamName)>0))
                .collect(Collectors.toMap(map -> map.getKey(), map->map.getValue()));

        return result;
    }


    public Integer getTeamPoints(String teamName){
        return this.teamPoints.get(teamName);
    }

}
