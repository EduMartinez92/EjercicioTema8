public class Main {


    public static void main(String[] args) {
        Persona persona = new Persona();

       persona.setEdad(19);
       persona.setNombre("Eduardo");
       persona.setTelefono(333777555);

       System.out.println("Edad: "+ persona.getEdad()+ ", Nombre: "+ persona.getNombre()+
               ", Teléfono: "+ persona.getTelefono());



    }
}
class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}