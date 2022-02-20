package ru.netology;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MovieManager1Test {

    @Test
    void addFilm() {
        Film first = new Film(1, "Титаник");
        Film second = new Film(2, "Крик");
        Film third = new Film(3, "Неудержимые");
        Film fourth = new Film(4, "Форсаж");
        Film fifth = new Film(5, "Дневник памяти");
        Film sixth = new Film(6, "Американский пирог");
        Film seventh = new Film(7, "Убойные каникулы");
        Film eighth = new Film(8, "Под водой");
        Film ninth = new Film(9, "Монстр с глубины");
        Film ten = new Film(10, "Перевозчик");
        Film eleven = new Film(11, "Адреналин");

        MovieManager1 manager = new MovieManager1();
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(ten);
        manager.save(eleven);

        Film[] expected = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, ten, eleven};
        Film[] actual = manager.findAll();

        assertArrayEquals(expected, actual);


    }

    @Test
    void get9Films() {
        Film first = new Film(1, "Титаник");
        Film second = new Film(2, "Крик");
        Film third = new Film(3, "Неудержимые");
        Film fourth = new Film(4, "Форсаж");
        Film fifth = new Film(5, "Дневник памяти");
        Film sixth = new Film(6, "Американский пирог");
        Film seventh = new Film(7, "Убойные каникулы");
        Film eighth = new Film(8, "Под водой");
        Film ninth = new Film(9, "Монстр с глубины");
        Film ten = new Film(10, "Перевозчик");
        Film eleven = new Film(11, "Адреналин");
        Film twelfth = new Film(12, "Властелин колец");

        MovieManager1 manager = new MovieManager1(9);
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(ten);
        manager.save(eleven);
        manager.save(twelfth);


        Film[] expected = {twelfth, eleven, ten, ninth, eighth, seventh, sixth, fifth, fourth};
        Film[] actual = manager.getAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void getFilmsWhenLimit11And12Films() {
        Film first = new Film(1, "Титаник");
        Film second = new Film(2, "Крик");
        Film third = new Film(3, "Неудержимые");
        Film fourth = new Film(4, "Форсаж");
        Film fifth = new Film(5, "Дневник памяти");
        Film sixth = new Film(6, "Американский пирог");
        Film seventh = new Film(7, "Убойные каникулы");
        Film eighth = new Film(8, "Под водой");
        Film ninth = new Film(9, "Монстр с глубины");
        Film ten = new Film(10, "Перевозчик");
        Film eleven = new Film(11, "Адреналин");
        Film twelfth = new Film(12, "Властелин колец");

        MovieManager1 manager = new MovieManager1(11);
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(ten);
        manager.save(eleven);
        manager.save(twelfth);


        Film[] expected = {twelfth, eleven, ten, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        Film[] actual = manager.getAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void getFilmsWhenLimit10And12Films() {
        Film first = new Film(1, "Титаник");
        Film second = new Film(2, "Крик");
        Film third = new Film(3, "Неудержимые");
        Film fourth = new Film(4, "Форсаж");
        Film fifth = new Film(5, "Дневник памяти");
        Film sixth = new Film(6, "Американский пирог");
        Film seventh = new Film(7, "Убойные каникулы");
        Film eighth = new Film(8, "Под водой");
        Film ninth = new Film(9, "Монстр с глубины");
        Film ten = new Film(10, "Перевозчик");
        Film eleven = new Film(11, "Адреналин");
        Film twelfth = new Film(12, "Властелин колец");

        MovieManager1 manager = new MovieManager1();
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(ten);
        manager.save(eleven);
        manager.save(twelfth);


        Film[] expected = {twelfth, eleven, ten, ninth, eighth, seventh, sixth, fifth, fourth, third };
        Film[] actual = manager.getAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void get10FilmsWhenLimit10And10Films() {
        Film first = new Film(1, "Титаник");
        Film second = new Film(2, "Крик");
        Film third = new Film(3, "Неудержимые");
        Film fourth = new Film(4, "Форсаж");
        Film fifth = new Film(5, "Дневник памяти");
        Film sixth = new Film(6, "Американский пирог");
        Film seventh = new Film(7, "Убойные каникулы");
        Film eighth = new Film(8, "Под водой");
        Film ninth = new Film(9, "Монстр с глубины");
        Film ten = new Film(10, "Перевозчик");


        MovieManager1 manager = new MovieManager1();
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(ten);


        Film[] expected = { ten, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first };
        Film[] actual = manager.getAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void getFilmsWhenLimit9And9Films() {
        Film first = new Film(1, "Титаник");
        Film second = new Film(2, "Крик");
        Film third = new Film(3, "Неудержимые");
        Film fourth = new Film(4, "Форсаж");
        Film fifth = new Film(5, "Дневник памяти");
        Film sixth = new Film(6, "Американский пирог");
        Film seventh = new Film(7, "Убойные каникулы");
        Film eighth = new Film(8, "Под водой");
        Film ninth = new Film(9, "Монстр с глубины");


        MovieManager1 manager = new MovieManager1(9);
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);


        Film[] expected = { ninth, eighth, seventh, sixth, fifth, fourth, third, second, first };
        Film[] actual = manager.getAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void getFilmsWhenLimit10And9Films() {
        Film first = new Film(1, "Титаник");
        Film second = new Film(2, "Крик");
        Film third = new Film(3, "Неудержимые");
        Film fourth = new Film(4, "Форсаж");
        Film fifth = new Film(5, "Дневник памяти");
        Film sixth = new Film(6, "Американский пирог");
        Film seventh = new Film(7, "Убойные каникулы");
        Film eighth = new Film(8, "Под водой");
        Film ninth = new Film(9, "Монстр с глубины");


        MovieManager1 manager = new MovieManager1();
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);


        Film[] expected = { ninth, eighth, seventh, sixth, fifth, fourth, third, second, first };
        Film[] actual = manager.getAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void getFilmsWhenLimit1And1Films() {
        Film first = new Film(1, "Титаник");



        MovieManager1 manager = new MovieManager1(1);
        manager.save(first);



        Film[] expected = { first };
        Film[] actual = manager.getAll();

        assertArrayEquals(expected, actual);
    }

}