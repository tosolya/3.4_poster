package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor

@Data
public class PosterMovies {
    private int id;
    private String movieName;
    private String genre;

    public PosterMovies(int id, String movieName, String genre) {
        this.id = id;
        this.movieName = movieName;
        this.genre = genre;
    }
}