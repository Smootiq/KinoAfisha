package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;
import ru.netology.manager.AfishaManager;


public class AfishaManagerTest {
    AfishaManager afishaManager = new AfishaManager(3);
    Movie movie1 = new Movie(1, "Bloodshort", "Action");
    Movie movie2 = new Movie(2, "Forward", "Cartoon");
    Movie movie3 = new Movie(3, "Belgrad Hotel", "Comedy");
    Movie movie4 = new Movie(4, "Gentlemens", "Action");
    Movie movie5 = new Movie(5, "Invisible Man", "Thriller");
    Movie movie6 = new Movie(6, "Trolls world tour", "Cartoon");
    Movie movie7 = new Movie(7, "Number One", "Comedy");

    @Test
    void shouldAdd() {
        Movie[] expected = new Movie[]{movie1};
        afishaManager.add(movie1);
        Assertions.assertArrayEquals(expected, afishaManager.getMovie());
    }
    @Test
    void shouldReturnLessThenMax () {
        Movie[] expected = new Movie[] {movie7, movie6, movie5};
        afishaManager.add (movie1);
        afishaManager.add (movie2);
        afishaManager.add (movie3);
        afishaManager.add (movie4);
        afishaManager.add (movie5);
        afishaManager.add (movie6);
        afishaManager.add (movie7);
        Assertions.assertArrayEquals(expected, afishaManager.getMovie());
    }

}