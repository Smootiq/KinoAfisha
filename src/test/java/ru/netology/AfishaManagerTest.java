package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.repository.AfishaRepository;
import ru.netology.manager.AfishaManager;

public class AfishaManagerTest {
    AfishaManager afishaManager = new AfishaManager(3);
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
        afishaManager.add( afishaRepository1 );
        Assertions.assertArrayEquals(expected, afishaManager.getMovie());
    }
    @Test
    void shouldReturnLessThenMax () {
        AfishaRepository[] expected = new AfishaRepository[] {afishaRepository7, afishaRepository6, afishaRepository5};
        afishaManager.add ( afishaRepository1 );
        afishaManager.add ( afishaRepository2 );
        afishaManager.add ( afishaRepository3 );
        afishaManager.add ( afishaRepository4 );
        afishaManager.add ( afishaRepository5 );
        afishaManager.add ( afishaRepository6 );
        afishaManager.add ( afishaRepository7 );
        Assertions.assertArrayEquals(expected, afishaManager.getMovie());
    }

}