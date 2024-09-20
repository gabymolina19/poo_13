package baselibro;

public class Libros {
    String titulo;
    String autor;
    int numeropaginas;
    int anopublicacion;

    public Libros(String titulo, String autor, int numeropaginas, int anopublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeropaginas = numeropaginas;
        this.anopublicacion = anopublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeropaginas() {
        return numeropaginas;
    }

    public void setNumeropaginas(int numeropaginas) {
        this.numeropaginas = numeropaginas;
    }

    public int getAnopublicacion() {
        return anopublicacion;
    }

    public void setAnopublicacion(int anopublicacion) {
        this.anopublicacion = anopublicacion;
    }

    public void mostrarDatosLibro(){
        System.out.println("Título:"+titulo);
        System.out.println("Autor:"+autor);
        System.out.println("Número de páginas:"+numeropaginas);
        System.out.println("Año de publicación:"+anopublicacion);
    }

}
