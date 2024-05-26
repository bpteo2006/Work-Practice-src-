public class Car02 {
    public static void main(String[] args) {
        Door02 dd = new Door02();
        dd.setName("Driver");
        dd.open();
        String name;
        dd.getName();
        //dd.printStatus();
        

        Door02 pd = new Door02();
        pd.setName("Passenger");
        pd.open();
        //pd.printStatus();

        void printStatus(String n) {
            getName(n);

            //if (isOpen) {
                System.out.println(name + " door is open");
            //}
            //else {
            //    System.out.println(name +" door is close");
            //}
        }
    }
    
}
