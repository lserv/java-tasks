package io.lenur.compare;

import java.util.Comparator;

public class ByMoneyComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getMoney().compareTo(o2.getMoney());
    }
}
