package com.example.wineshop;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Type {

    private @Id @GeneratedValue Long id;

    private String name;

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
        if (!(o instanceof Type))
            return false;
        Type type = (Type) o;
        return Objects.equals(this.getId(), type.getId()) && Objects.equals(this.name, type.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getId(), this.name);
    }

    @Override
    public String toString() {
        return "Type{" + "id=" + this.getId() + ", name='" + this.name + '\'' + '}';
    }
}
