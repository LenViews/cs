package train;
public class highSpeed extends passenger {
    private int capacity;
    public highSpeed(int seats, int door){
        super(seats, door);
    }
    public void calculateCapacity(){
        capacity = getSeats();
        System.out.println("Capacity is " + capacity + " passengers");
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}