public class Main {
    public static void main(String[] args) {
        System.out.println(suma(15, 20, 115));
        Coche miCoche = new Coche();
        miCoche.PonerPuertas();
        System.out.println(miCoche.puertas);
    }
    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}

class Coche {
    public int puertas = 3;
    public void PonerPuertas() {
        this.puertas++;
    }
}