public class Administracionlibros {

public static void main (String[] args){

    Libro librouno=new Libro("Odisea","Homero", 300, 1900);
    Libro librodos=new Libro("El Perfume","Patrik", 123, 1985);

    System.out.println("Datos de libro 1: ");
    librouno.mostrarDatosLibro();
    System.out.println("______________________________________________________________");
    System.out.println("Datos de libro 2: ");
    librodos.mostrarDatosLibro();
    System.out.println("______________________________________________________________");
    System.out.println("______________________________________________________________");
    System.out.println("Paginas de Libro 1: " + librouno.getNumeroPaginas());
    librouno.setNumeroPaginas(1434);
    System.out.println("numero de paginas libro 1 modificado: " + librouno.getNumeroPaginas());
    System.out.println("______________________________________________________________");
}

}
