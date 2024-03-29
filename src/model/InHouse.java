package model;

public class InHouse extends Part {

    private int machineID;

    /**
     * creates the InHouse class
     */
    public InHouse(int id, String name, double price, int stock, int min, int max, int machineID) {
        super(id,name,price,stock,min,max);
        this.machineID = machineID;
    }

    /**
     * @return the machineID
     */
    public int getMachineID() {
        return machineID;
    }

    /**
     * @param machineID sets the machineID
     */
    public void setMachineID(int machineID) {
        this.machineID = machineID;
    }
}
