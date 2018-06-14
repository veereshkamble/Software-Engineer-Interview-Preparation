public class FootballPlayer {

    private String name;
    private int number;
    private String club;
    private String country;
    private int goalsScored;

    public FootballPlayer(String name, int number, String club, String country, int goalsScored) {
        this.name = name;
        this.number = number;
        this.club = club;
        this.country = country;
        this.goalsScored = goalsScored;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    public String changeClub(String club) {
        return this.club = club;
    }

    public int scoreGoal() {
        return this.goalsScored++;
    }
}
