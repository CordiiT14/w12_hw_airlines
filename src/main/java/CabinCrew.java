public class CabinCrew extends Person{

    private RankType rank;

    public CabinCrew(String name, RankType rank) {
        super(name);
        this.rank = rank;
    }

    public RankType getRank() {
        return rank;
    }

    public void setRank(RankType rank) {
        this.rank = rank;
    }

    public String relayMessage(String message){
        return "Listen up nerds, " + message;
    }
}
