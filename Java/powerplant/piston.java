package powerplant;

public class piston extends powerplant {
    int capacity, cylinder;
    String configuration;

    public void displayStatus(){
        System.out.println("Status: "+ getStatus());
    }
}