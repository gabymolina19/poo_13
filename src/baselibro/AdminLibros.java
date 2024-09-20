package baselibro;

public class AdminLibros {

    public static void main(String[] args) {

        Libros libroUno = new Libros("El principito","Antoine de Saint-Exupéry",96,1943);
        Libros libroDos = new Libros("Cien años de soledad", "Gabriel Garcia Marquez",417,1967);

        System.out.println("Datos libro 1:");
        //libroUno.mostrarDatosLibro();
        System.out.println("Número página libro 1"+libroUno.getNumeropaginas());
        libroUno.setNumeropaginas(100);
        System.out.println("Número de páginas libro 1 modificado:"+libroUno.getNumeropaginas());

        libroUno.mostrarDatosLibro();
        libroDos.mostrarDatosLibro();


    }





}
