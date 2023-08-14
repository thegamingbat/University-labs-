public class CricketPlayer {
    String playerName;
    int score;
    int ballsPlayed , numFours , numSixes;
    public CricketPlayer(String playerName , int score , int ballsPlayed , int numFours , int numSixes){
        this.playerName = playerName;
        this.score = score;
        this.ballsPlayed = ballsPlayed;
        this.numFours = numFours;
        this.numSixes = numSixes;

    }

    public String getPlayerName() {
        return playerName;
    }

    public int getScore() {
        return score;
    }

    public int getBallsPlayed() {
        return ballsPlayed;
    }

    public int getNumFours() {
        return numFours;
    }

    public int getNumSixes() {
        return numSixes;
    }
    private double StrikeRate(){
        return ((double) score /ballsPlayed)*100;
    }
    private double boundryPercentage(){
        return ((double) (numFours + numSixes) / ballsPlayed) * 100;
    }
    public void display(){
        System.out.println("Player Name " + getPlayerName());
        System.out.println("Total score " + getScore());
        System.out.println("Balls Played " + getBallsPlayed());
        System.out.println("Number of fours " + getNumFours());
        System.out.println("Number of sixes " + getNumSixes());
        System.out.println("Strike Rate " + StrikeRate());
        System.out.println("Boundry Percentage "+ boundryPercentage());
    }

}
