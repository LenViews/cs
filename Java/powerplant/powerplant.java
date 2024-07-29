package powerplant;

public abstract class powerplant {
    public String type, engineId, status;
    public int output, rpm, temp;

    public String getType(){
        return type;
    }

    public String getStatus(){
        return status;
    }

    public int getRpm(){
        return rpm;
    }

    public void start(){
        System.out.println("Starting Engine!");
    }

    public abstract void displayStatus();
}