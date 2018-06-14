public class Main {

    public static void main(String[] args) {

        FootballPlayer ronaldo = new FootballPlayer("Ronaldo", 7, "Real Madrid", "Portugal", 777);
        FootballPlayer messi = new FootballPlayer("Messi", 10, "Barcelona", "Argentina", 776);
        FootballPlayer neymar = new FootballPlayer("Neymar", 10, "Paris St. Germain", "Brazil", 775);

        System.out.println(ronaldo.getName());
        System.out.println(ronaldo.getNumber());
        System.out.println(ronaldo.getClub());
        System.out.println(ronaldo.getCountry());
        System.out.println(ronaldo.getGoalsScored());

        ronaldo.changeClub("Manchester United");
        ronaldo.scoreGoal();

        System.out.println();

        System.out.println(ronaldo.getName());
        System.out.println(ronaldo.getNumber());
        System.out.println(ronaldo.getClub());
        System.out.println(ronaldo.getCountry());
        System.out.println(ronaldo.getGoalsScored());
    }
}
