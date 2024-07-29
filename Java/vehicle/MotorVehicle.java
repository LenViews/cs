package vehicle;

public abstract class MotorVehicle {
    public String color, mvID, make, model, owner;
    int engine_capacity, mileage;

    public void start(){

    }
    public abstract void repair();

    void accelerate (double acc, int speed, int time){
        acc = speed/time;
    }

    public static void main (String[] args){
        
    }
}