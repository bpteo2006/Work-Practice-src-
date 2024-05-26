public class Rectangle {
    private int height = 1;
    private int width = 1;

    public Rectangle(int h, int w) {
        setHeight(h);
        setWidth(w);
    }

    void setHeight(int h) {
        height = h;
    }

    int getHeight() {
        return height;
    }
    void setWidth(int w) {
        width = w;
    }

    int getWidth() {
        return width;
    }

    int getPerimeter() {
        return (2 * height + 2 * width);
    }
    void printArea() {
        System.out.println(height * width);
    }
}
