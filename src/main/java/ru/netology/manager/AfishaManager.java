package ru.netology.manager;

import lombok.NoArgsConstructor;
import ru.netology.domain.Movie;


@NoArgsConstructor

public class AfishaManager {
    private Movie[] movies = new Movie[0];
    private int moviesToReturn = 10;

    public AfishaManager(int moviesToReturn) {
        this.moviesToReturn = moviesToReturn;
    }

    public void add(Movie movie) {
        Movie[] tmp = new Movie[movies.length + 1];

        System.arraycopy(movies, 0, tmp, 0, movies.length);

        tmp[tmp.length - 1] = movie;

        movies = tmp;
    }

    public Movie[] getMovie() {
        int arrayLength = moviesToReturn;
        if (movies.length < arrayLength) {
            arrayLength = movies.length;
        }
        Movie[] result = new Movie[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }
}