package io.lenur.compare;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SortByMoneyTest {
    private final Person arnold = new Person("Arnold", BigDecimal.valueOf(500.0));
    private final Person john = new Person("John", BigDecimal.valueOf(200.0));
    private final Person teddy = new Person("Teddy", BigDecimal.valueOf(700.0));
    private final List<Person> personsSorted = new LinkedList<>();
    private final List<Person> persons = new ArrayList<>();

    {
        persons.add(john);
        persons.add(teddy);
        persons.add(arnold);

        personsSorted.add(john);
        personsSorted.add(arnold);
        personsSorted.add(teddy);
    }

    @Test
    public void sortByComparable() {
        persons.sort(new ByMoneyComparator());

        Assertions.assertEquals(persons, personsSorted);
        Assertions.assertEquals(persons.get(0).getName(), "John");
        Assertions.assertEquals(persons.get(1).getName(), "Arnold");
        Assertions.assertEquals(persons.get(2).getName(), "Teddy");
    }
}
