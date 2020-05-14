import java.util.Scanner;

public class MyClass {

    public static void main(String args[]) {

        int A;
        int B;
        int operacao;

        Scanner sc = new Scanner(System.in);
         System.out.println("Qual opercação  deseja realizar? 1-divisao, 2-multiplicação, 3-adição, 4-subtração :");
         operacao = sc.nextInt();

        System.out.println("Digite o primeiro numero :");
        A = sc.nextInt();

        System.out.println("Digite o segundo numero :");
        B = sc.nextInt();
        
        if(operacao == 1){
          System.out.println("A divisão é= "+ divisao(A,B));  
        }else if(operacao == 2){
            System.out.println("A multiplicação é = "+ multiplicacao(A,B));
        }else if(operacao == 3){
            System.out.println("A soma é = "+ adicao(A,B));
        }else if(operacao == 4){
            System.out.println("A subtração é = "+ subtracao(A,B));
        }

       
    }
    public static int adicao(int A,int B){
                return A + B;
    }
     public static int subtracao(int A,int B){
                return A - B;
    }
     public static int divisao(int A,int B){
                return A / B;
    } public static int multiplicacao(int A,int B){
                return A * B;
    }
    
    



    }
