package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.AfishaRepository;
import ru.netology.manager.AfishaManager;

public class ManagerTest {
    AfishaManager manager = new AfishaManager(3);
    AfishaRepository afishaRepository1 = new AfishaRepository(1, "Bloodshort", "Action");
    AfishaRepository afishaRepository2 = new AfishaRepository(2, "Forward", "Cartoon");
    AfishaRepository afishaRepository3 = new AfishaRepository(3, "Belgrad Hotel", "Comedy");
    AfishaRepository afishaRepository4 = new AfishaRepository(4, "Gentlemens", "Action");
    AfishaRepository afishaRepository5 = new AfishaRepository(5, "Invisible Man", "Thriller");
    AfishaRepository afishaRepository6 = new AfishaRepository(6, "Trolls world tour", "Cartoon");
    AfishaRepository afishaRepository7 = new AfishaRepository(7, "Number One", "Comedy");

    @Test
    void shouldAdd() {
        AfishaRepository[] expected = new AfishaRepository[]{afishaRepository1};
        manager.add( afishaRepository1 );
        Assertions.assertArrayEquals(expected, manager.getMovie());
    }
    @Test
    void shouldReturnLessThenMax () {
        AfishaRepository[] expected = new AfishaRepository[] {afishaRepository7, afishaRepository6, afishaRepository5};
        manager.add ( afishaRepository1 );
        manager.add ( afishaRepository2 );
        manager.add ( afishaRepository3 );
        manager.add ( afishaRepository4 );
        manager.add ( afishaRepository5 );
        manager.add ( afishaRepository6 );
        manager.add ( afishaRepository7 );
        Assertions.assertArrayEquals(expected, manager.getMovie());
    }

}
