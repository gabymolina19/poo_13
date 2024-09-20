package baseempleados;

public class Personas {
    String nombre;
    String apellido;
    int edad;
    double estatura;

    public Personas(String nombre, String apellido, int edad, double estatura){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.estatura = estatura;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    //Metodo para mostrar datos persona
    public void mostrarDatosPersona(){
        System.out.println("Nombre:"+nombre);
        System.out.println("Apellido:"+apellido);
        System.out.println("Edad:"+edad);
        System.out.println("Estatura:"+estatura);
    }


}
