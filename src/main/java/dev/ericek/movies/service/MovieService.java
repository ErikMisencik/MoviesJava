package dev.ericek.movies.service;

import dev.ericek.movies.MovieRepository;
import dev.ericek.movies.model.Movie;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository moviesRepository;

    public List<Movie> allMovies() {
        return moviesRepository.findAll();
    }
    public Optional<Movie> singleMovie(String imdbId) {
        return moviesRepository.findMovieByImdbId(imdbId);
    }

}
