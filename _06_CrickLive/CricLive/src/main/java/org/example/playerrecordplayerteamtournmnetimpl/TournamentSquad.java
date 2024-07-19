package org.example.playerrecordplayerteamtournmnetimpl;

import java.util.ArrayList;

public class TournamentSquad {

    private ArrayList<Player> players;

    public TournamentSquad(){
        this.players = new ArrayList<>();
    }

    public PlayingEleven selectPlayingEleven(){

        boolean conditionForSelection = true;

        PlayingEleven selectedPlayers = new PlayingEleven();

        for(Player p : this.players){
            if(conditionForSelection){
                selectedPlayers.getPlayers().add(p);
            }
        }

        return selectedPlayers;
    }

    public ArrayList<Player> getPlayers(){
        return players;
    }

    public void setPlayers(ArrayList<Player> players){
        this.players = players;
    }

}
