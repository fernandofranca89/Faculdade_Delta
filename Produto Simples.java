import java.util.Scanner;

public class MyClass {

    public static void main(String args[]) {

        int produto1;
        int produto2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o produto 1 :");
        produto1 = sc.nextInt();

        System.out.println("Digite o produto 2 :");
        produto2 = sc.nextInt();

        System.out.println("PROD = " + (produto1 * produto2));



    }
}
