package ru.netology.manager;

import ru.netology.domain.Movie;

public class AfishaRepository {
    private Movie[] list = {new Movie(1, "Bloodshort", "Action"),
            new Movie(2, "Forward", "Cartoon"),
            new Movie(3, "Belgrad Hotel", "Comedy"),
            new Movie(4, "Gentlemens", "Action"),
            new Movie(5, "Invisible Man", "Thriller"),
            new Movie(6, "Trolls world tour", "Cartoon"),
            new Movie(7, "Number One", "Comedy")};

    Movie movie = new Movie(8, "Happy Land", "Comedy");
    Movie[] findAll() {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
        return list;
    }
    void save(Movie movie) {
        int length = list.length + 1;
        Movie[] addedFilm = new Movie[length];
        for (int i = 0; i < list.length; i++) {
            addedFilm[i] = list[i];
        }

        int lastIndex = addedFilm.length - 1;
        addedFilm[lastIndex] = movie;
        list = addedFilm;
    }

    Movie findById(int id) {
        for (Movie item : list) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    void removeById(int id) {
        boolean b = false;
        for (Movie item : list) {
            if (item.getId() == id) {
                b = true;
                break;
            }
        }
        if (b) {
            int length = list.length - 1;
            Movie[] newArray = new Movie[length];
            int index = 0;
            for (Movie item : list) {
                if (item.getId() != id) {
                    newArray[index] = item;
                    index++;
                }
            }
            list = newArray;
        }

    }
    void removeAll() {
        list= new Movie[0];
    }
}
