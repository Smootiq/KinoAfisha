package ru.netology;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;
import ru.netology.manager.AfishaRepository;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AfishaRepositoryTest {
    AfishaRepository repository = new AfishaRepository();
    @Test
    void shouIdFindAll() {
        Movie[] expected = {new Movie( 1, "Bloodshort", "Action" ),
                new Movie( 2, "Forward", "Cartoon" ),
                new Movie( 3, "Belgrad Hotel", "Comedy" ),
                new Movie( 4, "Gentlemens", "Action" ),
                new Movie( 5, "Invisible Man", "Thriller" ),
                new Movie( 6, "Trolls world tour", "Cartoon" ),
                new Movie( 7, "Number One", "Comedy" )};

        Movie[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }
    @Test
    void shouIdSave() {
        repository.save(repository.movie);
        Movie[] expected = {new Movie( 1, "Bloodshort", "Action" ),
                new Movie( 2, "Forward", "Cartoon" ),
                new Movie( 3, "Belgrad Hotel", "Comedy" ),
                new Movie( 4, "Gentlemens", "Action" ),
                new Movie( 5, "Invisible Man", "Thriller" ),
                new Movie( 6, "Trolls world tour", "Cartoon" ),
                new Movie( 7, "Number One", "Comedy" )};

        Movie[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }
    @Test
    void shouldFindByID() {
        Movie expected = new Movie(6, "Trolls world tour", "Cartoon");
        Movie actual = repository.findById(6);
        assertEquals(expected, actual);
    }
    @Test
    void shouldRemoveById() {
        repository.removeById(3);
        Movie[] expected = {new Movie( 1, "Bloodshort", "Action" ),
                new Movie( 2, "Forward", "Cartoon" ),
                new Movie( 3, "Belgrad Hotel", "Comedy" ),
                new Movie( 4, "Gentlemens", "Action" ),
                new Movie( 5, "Invisible Man", "Thriller" ),
                new Movie( 6, "Trolls world tour", "Cartoon" ),
                new Movie( 7, "Number One", "Comedy" )};
        Movie[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }
    @Test
    void shouldRemoveAll() {
        repository.removeAll();
        Movie[] expected = {};
        Movie[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }
}
