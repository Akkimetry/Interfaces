package com.company;

import java.util.Objects;

public class SetterGetter {

    int id;
    int age;
    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SetterGetter that = (SetterGetter) o;
        return id == that.id && age == that.age && name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, age, name);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SetterGetter(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }
}
