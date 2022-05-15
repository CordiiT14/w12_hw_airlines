public class Plane {

    private PlaneType planetype;

    public Plane(PlaneType planetype) {
        this.planetype = planetype;
    }

    public PlaneType getPlanetype() {
        return planetype;
    }

    public void setPlanetype(PlaneType planetype) {
        this.planetype = planetype;
    }
}
