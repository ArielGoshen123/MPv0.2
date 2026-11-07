package com.example.mpv01;

import java.util.List;

public abstract class User {
    String name;
    int id;
    List<Movie> movies;
    String username;
    String password;



    public void addMovie(Movie movie) {
        this.movies.add(movie);
    }

    public void removeMovie(Movie movie) {
        this.movies.remove(movie);
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }
}
