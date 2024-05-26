public class Challenge5_2 {
    public static void main(String[] args){
        int[] a = new int[20];

        for (int i = 0; i < 20; i++) {
            a[i] = i+1;
           // System.out.println(a[i]);
        }

        for (int j = 19; j >= 0; j--) {
            System.out.println(a[j]);
        }
    }
}
