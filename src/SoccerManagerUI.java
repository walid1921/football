public class SoccerManagerUI {
    public static void main(String[] args) {

        Player player = new Player("Müller", 25, 8, 9, 7);
        Goalkeeper keeper = new Goalkeeper("Neuer", 36, 7, 5, 8, 9);

        System.out.println(player);
        System.out.println(keeper);

        int shot = player.shootAtGoal();
        System.out.println("\nShot power: " + shot);

        if (keeper.ballHold(shot)) {
            System.out.println("Goalkeeper saved the shot!");
        } else {
            System.out.println("GOAL!");
            player.addGoal();
        }
    }
}
