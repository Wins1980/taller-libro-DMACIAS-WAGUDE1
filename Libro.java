//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Libro {
    String titulo;
    String autor;
    int numeroPaginas;
    int anoPublicacion;
    public Libro (String titulo, String autor, int numeroPaginas, int anoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.anoPublicacion = anoPublicacion;
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

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    //Mostrar Datos Libro

    public void mostrarDatosLibro() {

        System.out.println("titulo: " + titulo);
        System.out.println("autor: " + autor);
        System.out.println("numero de paginas: " + numeroPaginas);
        System.out.println("año de publicacion: " + anoPublicacion);
    }

    }
