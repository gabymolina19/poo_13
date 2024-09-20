package baseempleados;

public class AdminPersonas {

    public static void main(String[] args) {

        Personas personaUno = new Personas("Fredy","Pico",18,1.68);
        Personas personaDos = new Personas("Alex","Vargas",20,1.70);
        Personas personaTres = new Personas("Diana","Macias",18,1.68);

        System.out.println("Datos de la persona 1:");
        personaUno.mostrarDatosPersona();
    }

}
