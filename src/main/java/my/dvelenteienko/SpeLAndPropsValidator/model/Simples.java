package my.dvelenteienko.SpeLAndPropsValidator.model;

import java.util.Objects;

public class Simples {

    private String name;
    private Integer age;


    public Simples() {
    }

    public Simples(String name, Integer age) {
        name = name;
        age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Simples simples = (Simples) o;
        return Objects.equals(name, simples.name) && Objects.equals(age, simples.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
