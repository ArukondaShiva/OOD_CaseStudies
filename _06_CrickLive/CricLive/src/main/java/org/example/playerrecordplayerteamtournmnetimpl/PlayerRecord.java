package org.example.playerrecordplayerteamtournmnetimpl;

public class PlayerRecord {

    private int matchesPlayed;
    private int totalRuns;
    private double battingAverage;
    private int centuries;
    private int highestScore;
    private int highestWickets;
    private int economy;

    public PlayerRecord(){

    }


    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public int getTotalRuns() {
        return totalRuns;
    }

    public void setTotalRuns(int totalRuns) {
        this.totalRuns = totalRuns;
    }

    public double getBattingAverage() {
        return battingAverage;
    }

    public void setBattingAverage(double battingAverage) {
        this.battingAverage = battingAverage;
    }

    public int getCenturies() {
        return centuries;
    }

    public void setCenturies(int centuries) {
        this.centuries = centuries;
    }

    public int getHighestScore() {
        return highestScore;
    }

    public void setHighestScore(int highestScore) {
        this.highestScore = highestScore;
    }

    public int getHighestWickets() {
        return highestWickets;
    }

    public void setHighestWickets(int highestWickets) {
        this.highestWickets = highestWickets;
    }

    public int getEconomy() {
        return economy;
    }

    public void setEconomy(int economy) {
        this.economy = economy;
    }
}
