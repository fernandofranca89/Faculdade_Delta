public class Triangulo {
    private float lado1;
    private float lado2;
    private float lado3;

    public Triangulo(float lado1, float lado2, float lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public float getLado1() {
        return lado1;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    public float getLado3() {
        return lado3;
    }

    public void setLado3(float lado3) {
        this.lado3 = lado3;
    }
    public void tipodeTriangulo(){
         String tipo = "";
           if (getLado1() == getLado2() && getLado1() == getLado3()){
               tipo = "Equilatero";
           }else if (getLado1() == getLado2() || getLado1() == getLado3() || getLado2() == getLado3()){
               tipo = "Esóciles";
           }else{
                tipo = "Escaleno";
           }
         System.out.println("O Tipo do Triangulo é "+ tipo );
    }
}



ublic class Main {
    public static void main(String[] args) {

        Triangulo triangulo = new Triangulo(10,10,10);
        triangulo.tipodeTriangulo();

        Triangulo triangulo1 = new Triangulo(10,10,11);
        triangulo1.tipodeTriangulo();

        Triangulo triangulo2 = new Triangulo(10,11,12);
        triangulo2.tipodeTriangulo();

    }
}
