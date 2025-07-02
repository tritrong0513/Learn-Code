import java.util.Scanner;

public class Bai2 {
    public static int Sum2(int n ){
        if (n == 0 ){
            return 0;
        }
        return (n * n) + Sum2(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n = sc.nextInt();
        System.out.println(Sum2(n));
        sc.close();
    }
}
