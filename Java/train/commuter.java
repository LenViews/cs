package train;
public class commuter extends passenger {
    private String station, route;
    public commuter(int speed, int seats, int door){
        super(seats, door);
    }
    public void announceStop(){
        System.out.println("Train stopping at the next station: " + station);
    }
    public String getStation() {
        return station;
    }
    public void setStation(String station) {
        this.station = station;
    }
    public String getRoute() {
        return route;
    }
    public void setRoute(String route) {
        this.route = route;
    }
}