package com.example.wineshop;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

public class Winery {

    @Id @GeneratedValue private Long id;

    private String name;

    public Winery(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Winery))
            return false;
        Winery winery = (Winery) o;
        return Objects.equals(this.getId(), winery.getId()) && Objects.equals(this.name, winery.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getId(), this.name);
    }

    @Override
    public String toString() {
        return "Winery{" + "id=" + this.getId() + ", name='" + this.name + '\'' + '}';
    }



}
