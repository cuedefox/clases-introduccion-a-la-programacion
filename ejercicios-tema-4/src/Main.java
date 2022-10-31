public class Main {
    public static void main(String[] args) {
        int numeroIf = 5;
        int numeroWhile = -4;
        int numeroFor = 0;
        String estacion = "VERANO";

        if (numeroIf > 0) {
            System.out.println("es positivo");
        } else if (numeroIf == 0) {
            System.out.println("es 0");
        } else {
            System.out.println("es negativo");
        }

        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("El numero del While es " + numeroWhile);
        }

        do {
            numeroWhile++;
            System.out.println("El numero del While es " + numeroWhile);
        } while (numeroWhile < 3);

        for (; numeroFor <= 3; numeroFor++) {
            System.out.println("El numero del for es " + numeroFor);
        }

        switch (estacion) {
            case "VERANO":
                System.out.println("Es verano!");
                break;
            case "INVIERNO":
                System.out.println("Es invierno!");
                break;
            case "PRIMAVERA":
                System.out.println("Es primavera!");
                break;
            case "OTOÑO":
                System.out.println("Es otoño!");
                break;
            default:
                System.out.println("No hay estacion ingresada");
        }
    }
}