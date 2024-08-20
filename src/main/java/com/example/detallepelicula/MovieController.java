package com.example.detallepelicula;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MovieController {
    private List<Movie> movies = new ArrayList<>();
    
    public MovieController(){
        // Inicializar la lista
        movies.add(new Movie(1, "Inception", 2010, "Christopher Nolan", "Sci-Fi", "Un ladrón que roba secretos corporativos a través del uso de la tecnología de sueño compartido se le ofrece la oportunidad de borrar su historial criminal como pago por la implantación de una idea en la mente de un director ejecutivo."));
        movies.add(new Movie(2, "Interstellar", 2014, "Christopher Nolan", "Sci-Fi", "Un equipo de exploradores viaja a través de un agujero de gusano en el espacio en un intento de asegurar la supervivencia de la humanidad."));
        movies.add(new Movie(3, "The Matrix", 1999, "The Wachowskis", "Sci-Fi", "Un hacker descubre que lo que percibe como realidad es en realidad una simulación controlada por una inteligencia artificial."));
        movies.add(new Movie(4, "Gladiator", 2000, "Ridley Scott", "Action", "Un ex general romano busca venganza contra el corrupto emperador que asesinó a su familia y lo condenó a la esclavitud."));
        movies.add(new Movie(5, "The Dark Knight", 2008, "Christopher Nolan", "Superhero", "Batman lucha contra el crimen organizado en Gotham City, enfrentándose a un nuevo villano, el Joker, que busca sumir a la ciudad en el caos."));
        movies.add(new Movie(6, "Forrest Gump", 1994, "Robert Zemeckis", "Drama", "La historia de Forrest Gump, un hombre con un bajo coeficiente intelectual, y sus increíbles experiencias a lo largo de la historia estadounidense."));
        movies.add(new Movie(7, "Jurassic Park", 1993, "Steven Spielberg", "Adventure", "Un grupo de personas lucha por sobrevivir en un parque temático donde los dinosaurios han sido traídos a la vida mediante la ingeniería genética."));
    }
    
    // a. GET /peliculas/{id}: Para obtener información detallada sobre una película en función de su ID
    @GetMapping("/{id}")
    public Movie getMovieById(@PathVariable int id) {
        return movies.stream()
                     .filter(movie -> movie.getId() == id)
                     .findFirst()
                     .orElse(null); // Devuelve null si no se encuentra la película
    }
    
    // b. GET/películas: Para obtener toda la información detallada sobre las películas que se encuentren registradas
    @GetMapping
    public List<Movie> getAllMovies() {
        return movies;
    }    

}
