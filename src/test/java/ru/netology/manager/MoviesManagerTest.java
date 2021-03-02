package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.PosterMovies;


import static org.junit.jupiter.api.Assertions.*;

class MoviesManagerTest {
    private MoviesManager manager = new MoviesManager();
     PosterMovies first = new PosterMovies(1,"Вий", "Ужасы");
     PosterMovies second = new PosterMovies(2, "Храброе сердце", "Драмма");
     PosterMovies third = new PosterMovies(3, "Душа", "Мультфильм");
     PosterMovies fourth = new PosterMovies(4,  "Фантаны", "Фантастика");
     PosterMovies fifth = new PosterMovies(5,  "Рокки", "Боевик");

    public void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);

    }

    @Test
    public void addMoviesToEmpty() {
        manager.add(first);
        assertArrayEquals(new PosterMovies[]{first}, manager.getAllMovies());
    }

    @Test
    public void addMoviesToExisted() {
        manager.add(first);
        PosterMovies[] expected = new PosterMovies[]{first};
        PosterMovies[] actual = manager.getAllMovies();
        assertArrayEquals(new PosterMovies[]{first}, manager.getAllMovies());

        manager.add(second);
        PosterMovies[] expectedAdded = new PosterMovies[]{second, first};
        PosterMovies[] actualAdded = manager.getAllMovies();
        assertArrayEquals(expectedAdded, actualAdded);
    }

    @Test
    void moviesForFeed() {
        setUp();
        PosterMovies[] expected = new PosterMovies[]{fifth, fourth, third, second, first};
        PosterMovies[] actual = manager.getTenMovies();
        assertArrayEquals(expected, actual);
    }

    @Test
    void MoviesMinFeed() {
        manager = new MoviesManager(3);
        setUp();
        PosterMovies[] expected = new PosterMovies[]{fifth, fourth, third};
        PosterMovies[] actual = manager.getTenMovies();
        assertArrayEquals(expected, actual);
    }

}
