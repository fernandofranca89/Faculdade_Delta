import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

            int x;
            double c;
            double f;
            double k;

            System.out.println("digite a opereção desejada");
            System.out.println("digite 1 para converter a temperatura em ºc, 2 para ºF e 3 para Kelvin");
             x = sc.nextInt();{
                if(x==1);{
                    System.out.println("digite a temperatura em ºC");
                    c = sc.nextDouble();
                    f = ((c*9/5)+31);
                    k =(c+273.15);
                    System.out.println("ºF " + f);
                    System.out.println("Kelvin " + k);
                }else if (x==2);{
                    System.out.println("digite a temperatura em ºF");
                    f = sc.nextDouble();
                    c = ((f-32)*5/9);
                    k = ((f-32)*5/9+273.15);
                    System.out.println("ºC "+ c);
                    System.out.println("Kelvin "+ k);
                }else if (x==3);{
                    System.out.println("digite a temperatura em Kelvin");
                    k = sc.nextDouble();
                    c = (k-273.15);
                    f = ((k-273.15)*9/5+35);
                    System.out.println("ºC "+ c );
                    System.out.println("ºF "+ f);
                }
             }
    }
}
