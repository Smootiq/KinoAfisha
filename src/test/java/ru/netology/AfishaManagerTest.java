package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.exceptions.base.MockitoException;
import ru.netology.domain.Movie;
import ru.netology.manager.AfishaManager;
import ru.netology.manager.AfishaRepository;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoException.class)
class AfishaManagerTest {
    @Mock
    private AfishaRepository repository;
    @InjectMocks
    private AfishaManager manager;
    Movie firstTest = new Movie( 2, "Forward", "Cartoon" );
    Movie secondTest = new Movie(3, "Belgrad Hotel", "Comedy");
    Movie thirdTest = new Movie(4, "Gentlemens", "Action");

    @Test
    void addFilm() {
        Movie[] returned = new Movie[]{firstTest, secondTest};
        doReturn(returned).when(repository).findAll();
        doNothing().when(repository).save(thirdTest);
        manager.addFilm(thirdTest);
        manager.setQuantityOfFilms(2);
        Movie[] expected = new Movie[]{secondTest, firstTest};
        Movie[] actual = manager.showFilms();
        assertArrayEquals(expected, actual);
    }
    @Test
    void showAll() {
        Movie[] returned = new Movie[]{firstTest, secondTest};
        doReturn(returned).when(repository).findAll();
        Movie[] expected = new Movie[]{firstTest, secondTest};
        Movie[] actual = manager.showAll();
        assertArrayEquals(expected, actual);
    }

}