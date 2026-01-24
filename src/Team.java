import java.util.ArrayList;

public class Team {

    private String name;
    private Coach coach;
    private Goalkeeper goalkeeper;
    private ArrayList<Player> squad; // list of field players, we use ArrayList for dynamic sizing (more flexible than array)

    public Team(String name, Coach coach, Goalkeeper goalkeeper) {
        this.name = name;
        this.coach = coach;
        this.goalkeeper = goalkeeper;
        this.squad = new ArrayList<Player>();
    }

    public String getName() {
        return name;
    }

    public Coach getCoach() {
        return coach;
    }

    public Goalkeeper getGoalkeeper() {
        return goalkeeper;
    }


    public void addPlayer(Player player) {
        this.squad.add(player);
    }

    // average motivation of all players + goalkeeper, rounded to nearest int
    public int getTotalMotivation(){
        int sum = goalkeeper.getMotivation();

        for (Player player : squad) {
            sum += player.getMotivation();
        }

        int total = Math.round((float) sum / (squad.size() + 1));

        return total;

    }

    // Only goalkeeper + first 10 field players (if you added more)
    public int getTotalForce(){
        int sum = goalkeeper.getStrength();
        int countPlayers = Math.min(10, squad.size());

        for (int i = 0; i < countPlayers; i++) {
            sum += squad.get(i).getStrength();
        }

        int total = Math.round((float) sum / (countPlayers + 1));

        return total;
    }

    @Override
    public String toString(){

        String result = "***Team***\n";
        result = result + "Team name: " + this.name + "\n";
        result = result + "Coach: " + this.coach.getName() + "\n";
        result = result + "Goalkeeper: " + this.goalkeeper.getName() + "\n";

        for (Player player : squad) {
            result = result + "Player: " + player.getName() + "\n";
        }

        return result;
    }


}
