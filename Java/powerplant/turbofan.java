package powerplant;

public class turbofan extends powerplant {
    double bypassRatio;
    int fanSize;

    public void displayStatus(){
        System.out.println("Revolutions per minute: "+ getRpm());
    }
}