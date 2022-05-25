package com.example.wineshop;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

public class Region {

    private @Id @GeneratedValue Long id;

    private String name;

    private String country;

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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Region))
            return false;
        Region region = (Region) o;
        return Objects.equals(this.getId(), region.getId()) && Objects.equals(this.name, region.name)
                && Objects.equals(this.country, region.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getId(), this.name, this.country);
    }

    @Override
    public String toString() {
        return "Region{" + "id=" + this.getId() + ", name='" + this.name + '\'' + ", country='" + this.country + '\'' +'}';
    }
}
