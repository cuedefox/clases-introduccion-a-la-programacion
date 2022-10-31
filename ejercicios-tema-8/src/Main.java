public class Main {
    public static void main(String[] args) {
        Persona rodrigo = new Persona();
        rodrigo.setNombre("Rodrigo");
        rodrigo.setFono(1132417239);
        rodrigo.setEdad(21);
        System.out.println(rodrigo.getNombre());
        System.out.println(rodrigo.getEdad());
        System.out.println(rodrigo.getFono());
    }
}
class Persona {
    private int edad;
    private String nombre;
    private int fono;

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setFono(int fono) {
        this.fono = fono;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public int getFono() {
        return fono;
    }
    public String getNombre() {
        return nombre;
    }
}