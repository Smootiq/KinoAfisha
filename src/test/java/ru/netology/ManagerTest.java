package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.manager.Manager;
import ru.netology.domain.Movie;


public class MovieTest {
    Movie movie = new Movie( 3 );
    Manager manager1 = new Manager( 1, "Bloodshort", "Action" );
    Manager manager2 = new Manager( 2, "Forward", "Cartoon" );
    Manager manager3 = new Manager( 3, "Belgrad Hotel", "Comedy" );
    Manager manager4 = new Manager( 4, "Gentlemens", "Action" );
    Manager manager5 = new Manager( 5, "Invisible Man", "Thriller" );
    Manager manager6 = new Manager( 6, "Trolls world tour", "Cartoon" );
    Manager manager7 = new Manager( 7, "Number One", "Comedy" );

    @Test
    void shouldAdd() {
        Manager[] expected = new Manager[]{manager1};
        movie.add( manager1 );
        Assertions.assertArrayEquals( expected, movie.getMovie() );
    }

    @Test
    void shouldReturnLessThenMax() {
        Manager[] expected = new Manager[]{manager7, manager6, manager5};
        movie.add( manager1 );
        movie.add( manager2 );
        movie.add( manager3 );
        movie.add( manager4 );
        movie.add( manager5 );
        movie.add( manager6 );
        movie.add( manager7 );
        Assertions.assertArrayEquals( expected, movie.getMovie() );
    }
}