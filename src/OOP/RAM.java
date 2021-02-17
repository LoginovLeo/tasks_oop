package OOP;

public class RAM extends Motherboard {


    public RAM(int id, String producer, String model, String serialNumber, ConnectionType connectionType) {
        super(id, producer, model, serialNumber, connectionType);

    }




    @Override
    public String toString() {
        return "RAM connected : " +
                "id=" + id +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' ;
    }
}