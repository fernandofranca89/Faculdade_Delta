import java.util.Scanner;

public class MyClass {

    public static void main(String args[]) {

        int A;
        int B;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o produto 1 :");
        A = sc.nextInt();

        System.out.println("Digite o produto 2 :");
        B = sc.nextInt();

        System.out.println("Resultado = "+ Soma(A,B));
    }
    public static int Soma(int A,int B){
        int Soma = A + B;
        return Soma = Soma * 3;
    }
    



    }
