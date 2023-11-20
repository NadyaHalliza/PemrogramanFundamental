package Tugas3;

public class no3 {

    public static void main(String[] args) {

        int a = 3, b = 4, c = 5;

        if (a + b > c && a + c > b && b + c > a) {
            int keliling = a + b + c;
            System.out.println("Keliling = " + keliling + " cm.");
        } else {
            System.out.println("Ini bukan bangun datar segitiga.");
        }
    }

    public static int calculateTrianglekeliling(int a, int b, int c) {
        return a + b + c;
    }
}