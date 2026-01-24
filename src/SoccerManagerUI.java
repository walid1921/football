//public class SoccerManagerUI {
//    public static void main(String[] args) {

//        Player player = new Player("Müller", 25, 8, 9, 7);
//        Goalkeeper keeper = new Goalkeeper("Neuer", 36, 7, 5, 8, 9);
//
//
//        System.out.println(player);
//        System.out.println(keeper);
//
//        int shot = player.shootAtGoal();
//        System.out.println("\nShot power: " + shot);
//
//        if (keeper.ballHold(shot)) {
//            System.out.println("Goalkeeper saved the shot!");
//        } else {
//            System.out.println("GOAL!");
//            player.addGoal();
//        }

 //   }
// }


public class SoccerManagerUI {
    public static void main(String[] args) {

        // --- Team 1 ---
        Coach coach1 = new Coach("Terzic", 38, 5);
        Goalkeeper keeper1 = new Goalkeeper("Bürki", 30, 7, 2, 10, 7);
        Team dortmund = new Team("Borussia Dortmund", coach1, keeper1);

        dortmund.addPlayer(new Player("Meunier", 29, 7, 5, 8, 0));
        dortmund.addPlayer(new Player("Akanji", 25, 8, 6, 8, 0));
        dortmund.addPlayer(new Player("Hummels", 31, 9, 5, 8, 0));
        dortmund.addPlayer(new Player("Guerreiro", 26, 8, 9, 8, 0));
        dortmund.addPlayer(new Player("Witsel", 31, 9, 6, 8, 0));
        dortmund.addPlayer(new Player("Brandt", 24, 9, 8, 8, 0));
        dortmund.addPlayer(new Player("Sancho", 20, 10, 8, 8, 0));
        dortmund.addPlayer(new Player("Bellingham", 17, 7, 7, 7, 0));
        dortmund.addPlayer(new Player("Reus", 31, 10, 8, 8, 0));
        dortmund.addPlayer(new Player("Haaland", 20, 9, 9, 8, 0));

        // --- Team 2 ---
        Coach coach2 = new Coach("Kohfeldt", 38, 9);
        Goalkeeper keeper2 = new Goalkeeper("Pavlenka", 28, 6, 2, 10, 6);
        Team bremen = new Team("Werder Bremen", coach2, keeper2);

        bremen.addPlayer(new Player("Gebre Selassie", 34, 7, 6, 8, 0));
        bremen.addPlayer(new Player("Friedl", 22, 6, 8, 8, 0));
        bremen.addPlayer(new Player("Veljkovic", 24, 6, 5, 8, 0));
        bremen.addPlayer(new Player("Augustinsson", 26, 7, 5, 7, 0));
        bremen.addPlayer(new Player("Mbom", 20, 6, 8, 8, 0));
        bremen.addPlayer(new Player("Eggestein", 24, 8, 6, 8, 0));
        bremen.addPlayer(new Player("Füllkrug", 27, 8, 9, 8, 0));
        bremen.addPlayer(new Player("Osako", 30, 7, 8, 8, 0));
        bremen.addPlayer(new Player("Rashica", 24, 8, 8, 8, 0));
        bremen.addPlayer(new Player("Bittencourt", 27, 7, 7, 8, 0));

        // --- Game ---
        Game game = new Game(dortmund, bremen);
        System.out.println(game); // "Borussia Dortmund - Werder Bremen"

        // simple goal simulation (just to prove Game works)
        game.increaseHomeGoals();
        game.increaseAwayGoals();
        game.increaseHomeGoals();

        System.out.println("Score: " + game.getScore()); // "2 : 1"
    }
}
