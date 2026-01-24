import java.util.Random;

public class Gameplay {

    private static final int PLAYING_TIME = 90;
    private static final int MAX_ADDITIONAL_TIME = 5;
    private static final int MAX_DURATION_UNTIL_NEXT_ACTION = 15;

//    static = shared by all objects (class variable)
//    final = constant (cannot change)

    private Game game;
    private Random random = new Random();

    public Gameplay(Game game) {
        this.game = game;
    }

    private int calculateForceOfTheTeam(Team team) {
        // Team value = (team strength * team motivation * coach experience) + random(-3..+3)
        int baseValue = team.getTotalForce() * team.getTotalMotivation() * team.getCoach().getExperience();

        Random random = new Random();
        int luck = random.nextInt(7) - 3; // -3 to +3
        int result = baseValue + luck;

        // must be at least 1
        if (result < 1) {
            result = 1;
        }
        return result;
    }

    private void doGameAction(Player player, Goalkeeper goalkeeper, int minute, Team team) {

        System.out.println(minute + ". Minute:");
        System.out.println("Chance for " + team.getName() + " ...");
        System.out.println(player.getName() + " shoots!");

        int powerAtGoalKick = player.shootAtGoal();

        if (!goalkeeper.ballHold(powerAtGoalKick)) {
            // GOAL
            if (team == game.getHome()) {
                game.increaseHomeGoals();
            } else if (team == game.getAway()) {
                game.increaseAwayGoals();
            }

            player.addGoal();
            System.out.println("  GOAL!!!  " + game.getScore() + "  " + player.getName() + "(" + player.getGoals() + ")");
        } else {
            // SAVED
            System.out.println("  " + goalkeeper.getName() + " saves brilliantly.");
        }
    }

    private void delay (){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void play() {
        System.out.println(game.toString());
        System.out.println();

        int matchDuration = PLAYING_TIME + random.nextInt(MAX_ADDITIONAL_TIME + 1);

        int minute = 0;

        // 3) loop until minute reaches matchDuration
        while (minute < matchDuration) {

            // 4) time until next action: 1..MAX_DURATION_UNTIL_NEXT_ACTION
            int minutesUntilNextAction = 1 + random.nextInt(MAX_DURATION_UNTIL_NEXT_ACTION);
            minute += minutesUntilNextAction;

            if (minute > matchDuration) {
                break;
            }

            // 5) decide which team is attacking
            Team home = game.getHome();
            Team away = game.getAway();

            int forceHome = calculateForceOfTheTeam(home);
            int forceAway = calculateForceOfTheTeam(away);

            int randomForce = random.nextInt(forceHome + forceAway);


        }


    }
}
