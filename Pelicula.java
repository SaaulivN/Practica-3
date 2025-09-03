import java.sql.SQLOutput;

public class Pelicula {
    private String titulo;
    private String director;
    private String genero;
    private int duracion;
    private int añoEstreno;

    public Pelicula(String titulo, String director, String genero, int duracion, int añoEstreno) {
        this.titulo = titulo;
        this.director = director;
        this.genero = genero;
        this.duracion = duracion;
        this.añoEstreno = añoEstreno;
    }

    public void getInformacion(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Director: " + this.director);
        System.out.println("Genero: " + this.genero);
        System.out.println("Duracion: " + this.duracion);
        System.out.println("Año de estreno: " + this.añoEstreno);
    }

    public boolean esClasica(){
        if (añoEstreno < 2000){
            return true;
        } else {
            return false;
        }
    }

    public String toString(){
        return "Titulo: " + titulo + ", Director: " + director + ", Genero: " + genero + ", Duración(min): " + duracion + ", Año de estreno: " + añoEstreno;
    }
}
