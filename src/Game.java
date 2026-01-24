public class Game {

    private Team home;
    private Team away;
    private int goalsHome;
    private int goalsAway;

    public Game(Team home, Team away) {
        this.home = home;
        this.away = away;
        this.goalsHome = 0;
        this.goalsAway = 0;
    }

    public void increaseHomeGoals() {
        goalsHome++;
    }

    public void increaseAwayGoals() {
        goalsAway++;
    }

    public Team getHome() {
        return this.home; // you can write without "this.", it is just for clarity, that it tells me that it is an instance variable
    }

    public Team getAway() {
        return this.away;
    }


    public String getScore() {
        return goalsHome + " : " + goalsAway;
    }

    @Override
    public String toString() {
        return home.getName() + " - " + away.getName();
    }
}
