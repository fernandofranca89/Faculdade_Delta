import java.util.Scanner;
class MyClass {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

         System.out.println("digite seu pesso ");
         double pesso = input.nextDouble();

         System.out.println("digite sua altura");
         double altura = input.nextDouble();
         double alturab;
         alturab = altura * altura;

      double imc = pesso / alturab;

      System.out.printf("%.2f", imc);


    }
