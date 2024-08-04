package train;
public class freight extends train {
    private int length;
    private double weight;
    private String cargoType;
    public freight(String locomotive){
        super(locomotive);
    }
    public int calculateLength(){
        length = getCars() * 20;
        System.out.println("Length: " + length + " meters");
        return length;
    }
    public void displaySpeed(){
        System.out.println("Freight train moving at " + getSpeed() + " km/h");
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String getCargoType() {
        return cargoType;
    }
    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }
}