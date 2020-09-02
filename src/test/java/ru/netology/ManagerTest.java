package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;
import ru.netology.manager.Manager;

public class ManagerTest {
    Manager manager = new Manager(3);
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
        manager.add(movie1);
        Assertions.assertArrayEquals(expected, manager.getMovie());
    }
    @Test
    void shouldReturnLessThenMax () {
        Movie[] expected = new Movie[] {movie7, movie6, movie5};
        manager.add (movie1);
        manager.add (movie2);
        manager.add (movie3);
        manager.add (movie4);
        manager.add (movie5);
        manager.add (movie6);
        manager.add (movie7);
        Assertions.assertArrayEquals(expected, manager.getMovie());
    }

}