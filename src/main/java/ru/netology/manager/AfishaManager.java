package ru.netology.manager;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netology.domain.Movie;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class AfishaManager {
    private AfishaRepository repository = new AfishaRepository();
    private int quantityOfFilms = 3;
    public AfishaManager(AfishaRepository repository) {
        this.repository = repository;
    }
    public void addFilm(Movie movie) {
        repository.save(movie);
    }
    public Movie[] showFilms(){
        int c = 0;
        Movie[] listNew = new Movie[quantityOfFilms];
        Movie[] all = repository.findAll();
        for (int i = all.length - 1; i > all.length - (quantityOfFilms + 1) & i >= 0; i--) {
            listNew[c] = all[i];
            System.out.print(all[i]);
            c++;
        }
        return listNew;
    }
    public Movie[] showAll() {
        Movie[] all = repository.findAll();
        return all;
    }
}