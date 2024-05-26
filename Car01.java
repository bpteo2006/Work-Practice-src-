public class Car01 {

    public static void main(String[] args) {

    Door01 dd = new Door01();
    dd.name ="Driver";
    dd.open();
    dd.printStatus();

    Door01 pd = new Door01();
    pd.name = "Passenger";
    pd.open();
    pd.printStatus();
    pd.close();
    pd.printStatus();

    }

}
