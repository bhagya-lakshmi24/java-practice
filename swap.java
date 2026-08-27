import java.util.Scanner;

class swap {
    public static void main(String a[]) {
        int a, b, temp = 0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }
}