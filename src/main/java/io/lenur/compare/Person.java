package io.lenur.compare;

import java.math.BigDecimal;
import java.util.Objects;

public class Person implements Comparable<Person> {
    private String name;

    private BigDecimal money;

    public Person() {
    }

    public Person(String name, BigDecimal money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    @Override
    public int compareTo(Person person) {
        Objects.requireNonNull(person);

        return this
                .getName()
                .compareTo(person.getName());
    }
}
