public class Shape {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(-1,8);

        //r1.height = 5;
        //r1.setHeight(5);
        //r1.width = 9;
        //r1.setWidth(9);
        System.out.println("r1 height : "+r1.getHeight());
        System.out.println("r1 weidth : "+r1.getWidth());
        r1.printArea();
        System.out.println("r1 perimeter : "+r1.getPerimeter());

        Rectangle r2 = new Rectangle(8,4);

        //r2.height = 8;
        //r2.setHeight(8);
        //r2.width = 4;
        //r2.setWidth(4);
        r2.printArea();
    }
}
