public class Main {
    public static void main(String[ ] args) {
        Catalogo catalogoDePeliculas = new Catalogo();

        Pelicula pelicula1 = new Pelicula("Good Will Hunting", "Gus Van Sant", "Romance/Drama", 126, 1997);
        Pelicula pelicula2 = new Pelicula("Batman: El Caballero de la Noche", "Christopher Nolan", "Acción/Crimen", 156, 2008);
        Pelicula pelicula3 = new Pelicula("Capitán América y el Soldado del Invierno", "Hermanos Russo", "Acción/Aventura", 136, 2014);

        catalogoDePeliculas.agregarPelicula(pelicula1);
        catalogoDePeliculas.agregarPelicula(pelicula2);
        catalogoDePeliculas.agregarPelicula(pelicula3);

        System.out.println("\nCatalogo de peliculas: \n" + catalogoDePeliculas.getPeliculas());

        System.out.println("Busqueda de pelicula por titulo (Good Will Hunting)");
        catalogoDePeliculas.buscarPeliculaPorTitulo("Good Will Hunting");
    }
}
