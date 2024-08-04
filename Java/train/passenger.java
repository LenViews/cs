package train;
public class passenger extends train {
    private int seats;
    private int door;
    private String classType;

    public passenger(String locomotive){
        super(locomotive);
    }
    public passenger(int seats, int door){
        super(null);
        this.seats = seats;
        this.door = door;
    }
    //Override
    public void displaySpeed(){
        System.out.println("Passenger train moving at " + getSpeed() + " km/h");
    }
    public void safety(){
        System.out.println("Checks complete.");
    }
    public int getSeats() {
        return seats;
    }
    public void setSeats(int seats) {
        this.seats = seats;
    }
    public int getDoor() {
        return door;
    }
    public void setDoor(int door) {
        this.door = door;
    }
    public String getClassType() {
        return classType;
    }
    public void setClassType(String classType) {
        this.classType = classType;
    }
}