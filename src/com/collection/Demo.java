package com.collection;

import java.util.Objects;

public class Demo {
    private String name;
    private int age;
    private String passport;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Demo demo = (Demo) o;
        return age == demo.age &&
                Objects.equals(name, demo.name) &&
                Objects.equals(passport, demo.passport);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age, passport);
    }
}
