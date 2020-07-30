package io.lenur.compare;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortByNameTest {
    private final Person arnold = new Person("Arnold", BigDecimal.valueOf(200.0));
    private final Person john = new Person("John", BigDecimal.valueOf(100.0));
    private final Person teddy = new Person("Teddy", BigDecimal.valueOf(200.0));
    private final List<Person> personsSorted = new LinkedList<>();
    private final List<Person> persons = new ArrayList<>();

    {
        persons.add(john);
        persons.add(teddy);
        persons.add(arnold);

        personsSorted.add(arnold);
        personsSorted.add(john);
        personsSorted.add(teddy);
    }

    @Test
    public void sortByComparable() {
        Collections.sort(persons);

        Assertions.assertEquals(persons, personsSorted);
        Assertions.assertEquals(persons.get(0).getName(), "Arnold");
        Assertions.assertEquals(persons.get(1).getName(), "John");
        Assertions.assertEquals(persons.get(2).getName(), "Teddy");
    }
}
