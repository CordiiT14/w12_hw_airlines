public class Pilot extends CabinCrew{

    private String pilotLicense;

    public Pilot(String name, RankType rank, String pilotLicense) {
        super(name, rank);
        this.pilotLicense = pilotLicense;
    }

    public String getPilotLicense() {
        return pilotLicense;
    }

    public void setPilotLicense(String pilotLicense) {
        this.pilotLicense = pilotLicense;
    }
}
