import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.Instant;
import java.time.LocalDate;

public class Cat {
    String name;
    int age;
    LocalDate date;

    public Cat(String name, int age, LocalDate date) {
        this.name = name;
        this.age = age;
        this.date = date;
    }

    @JsonCreator
    public Cat() {
    }

    @JsonProperty(required = true)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
