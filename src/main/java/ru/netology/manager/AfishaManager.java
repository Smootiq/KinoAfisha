package ru.netology.manager;

import lombok.NoArgsConstructor;
import ru.netology.domain.AfishaRepository;

@NoArgsConstructor

public class AfishaManager {
    private AfishaRepository[] afishaRepositories = new AfishaRepository[0];
    private int moviesToReturn = 10;

    public AfishaManager(int moviesToReturn) {
        this.moviesToReturn = moviesToReturn;
    }

    public void add(AfishaRepository afishaRepository) {
        AfishaRepository[] tmp = new AfishaRepository[afishaRepositories.length + 1];

        System.arraycopy( afishaRepositories, 0, tmp, 0, afishaRepositories.length);

        tmp[tmp.length - 1] = afishaRepository;

        afishaRepositories = tmp;
    }

    public AfishaRepository[] getMovie() {
        int arrayLength = moviesToReturn;
        if (afishaRepositories.length < arrayLength) {
            arrayLength = afishaRepositories.length;
        }
        AfishaRepository[] result = new AfishaRepository[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            int index = afishaRepositories.length - i - 1;
            result[i] = afishaRepositories[index];
        }
        return result;
    }
}
