public class Main {
    public static void main(String[] args) {
        Cliente rodrigo = new Cliente();
        Trabajador charly = new Trabajador();
        rodrigo.edad = 21;
        rodrigo.nombre = "Rodrigo";
        rodrigo.telefono = 1132417239;
        rodrigo.credito = 2000;
        charly.edad = 43;
        charly.nombre = "Carlos";
        charly.telefono = 1132415697;
        charly.salario = 150000;
        System.out.println(
                "1:" + rodrigo.nombre + " " + rodrigo.edad + " " +
                        rodrigo.telefono + " " + rodrigo.credito
                + " " + "2:" + charly.nombre + " " + charly.edad + " "
                        + charly.telefono + " " + charly.salario
        );
    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona {
    int credito;
}

class Trabajador extends Persona {
    int salario;
}
