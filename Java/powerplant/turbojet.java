package powerplant;

public class turbojet extends powerplant {
    boolean reheat;
    String nozzletype;

    public void displayStatus(){
        System.out.println("Engine Type: "+ getType());
    }
}