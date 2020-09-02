package ru.netology.manager;

import lombok.NoArgsConstructor;
import ru.netology.repository.Manager;

@NoArgsConstructor

public class Movie {
    private Manager[] afishaRepositories = new Manager[0];
    private int moviesToReturn = 10;

    public Movie(int moviesToReturn) {
        this.moviesToReturn = moviesToReturn;
    }

    public void add(Manager manager) {
        Manager[] tmp = new Manager[afishaRepositories.length + 1];

        System.arraycopy( afishaRepositories, 0, tmp, 0, afishaRepositories.length);

        tmp[tmp.length - 1] = manager;

        afishaRepositories = tmp;
    }

    public Manager[] getMovie() {
        int arrayLength = moviesToReturn;
        if (afishaRepositories.length < arrayLength) {
            arrayLength = afishaRepositories.length;
        }
        Manager[] result = new Manager[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            int index = afishaRepositories.length - i - 1;
            result[i] = afishaRepositories[index];
        }
        return result;
    }
}