public class MyClass {
    public static void main(String args[]) {
    int[] numeros = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30}; 
    
    int soma = 0;

    for(int i=0; i< numeros.length ; i++){
        soma = soma +  numeros[i];
    }
    
    System.out.println("O resultado da soma dos numeros de 1 a 30 é:" + soma);
    }
}
