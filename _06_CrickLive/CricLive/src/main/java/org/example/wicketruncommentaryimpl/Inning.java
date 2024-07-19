package org.example.wicketruncommentaryimpl;

import java.util.ArrayList;

public class Inning{

    private int number;
    private ArrayList<Over> overs;


    public Inning(int number){
        this.number = number;
        this.overs = new ArrayList<>();
    }

    public void addOver(Over over){
        this.overs.add(over);
    }

    public int getTotalScore(){
        int totalScore = 0;
        for(Over o : overs){
            totalScore += o.getTotalRuns();
        }
        return totalScore;
    }

    public int getNumber(){
        return number;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public ArrayList<Over> getOvers(){
        return overs;
    }

    public void setOvers(ArrayList<Over> overs){
        this.overs = overs;
    }

}
