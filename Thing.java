public class Thing {
    private int num;
    String word;

    int getNum() {
        return num;
    }

    void setNum(int n) {
        this.num = n;
    }

    void foo() {
        System.out.println(num * 3);
    }   
}
