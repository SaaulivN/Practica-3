import java.util.ArrayList;

public class Catalogo {
    private ArrayList<Pelicula> peliculas;

    public Catalogo() {
        peliculas = new ArrayList<>();
    }

    public void agregarPelicula(Pelicula nuevaPelicula) {
        peliculas.add(nuevaPelicula);
    }

    public String getPeliculas(){
        if (peliculas.size() == 0){
            return "No hay peliculas agregadas al catalogo";
        }

        String peliculasString = "";
        for (int i = 0; i < peliculas.size(); i++) {
            peliculasString = peliculasString + peliculas.get(i).toString() + "\n";
        }
        return peliculasString;
    }

    public void buscarPeliculaPorTitulo(String titulo) {
        boolean peliculaEncontrada = false;

        for (int i = 0; i < peliculas.size(); i++) {
            Pelicula peliculaAEncontrar = peliculas.get(i);
            if (peliculaAEncontrar.toString().contains(titulo)) {
                System.out.println("Pelicula encontrada: " + peliculaAEncontrar.toString());
                peliculaEncontrada = true;
            }
        }

        if (peliculaEncontrada == false) {
            System.out.println("No se encontró la película.");
        }
    }
}
