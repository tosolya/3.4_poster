package ru.netology.manager;

import ru.netology.domain.PosterMovies;


public class MoviesManager {
    public PosterMovies[] movies = new PosterMovies[0];
    private int feedCount = 10;

    public MoviesManager() {

    }

    //Метод для добавления фильмов
    public void add(PosterMovies movie) {
        int lenght = movies.length + 1;
        PosterMovies[] tmp = new PosterMovies[lenght];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;

    }

    //Метод получения всего списка элементов
    public PosterMovies[] getAllMovies() {
        PosterMovies[] result = new PosterMovies[movies.length];
        // перебираем массив в прямом порядке, кладем в обратном
        for (int i = 0; i < result.length; i++) {
            int index = movies.length - i -1;
            result[i] = movies[index];
        }
        return result;
    }
    //Метод, которотый выводит 10 фильфом
    public PosterMovies[] getTenMovies() {
        int feed = this.feedCount;
        if (feed > movies.length)
            feed = movies.length;
        PosterMovies[] result = new PosterMovies[feed];
        for (int i = 0; i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }

    public MoviesManager(int feedCount) {
        this.feedCount = feedCount;
    }
}