package train;

public abstract class train {
    protected int cars;
    private int gauge, speed;
    private String locomotive;
    public train(String locomotive){
        this.locomotive = locomotive;
    }
    public train(int speed, int cars){
        this.speed = speed;
        this.cars = cars;
    }
    public int getCars(){
        return cars;
    }
    public int getSpeed(){
        return speed;
    }
    public int getGauge(){
        return gauge;
    }
    public String getLocomotive(){
        return locomotive;
    }
    public void start(){
        System.out.println("Starting " + locomotive);
    }
    public abstract void displaySpeed();
}