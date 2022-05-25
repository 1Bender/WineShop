package com.example.wineshop;

import javax.persistence.*;
import java.util.Objects;


@Entity
public class Region {

    private @Id @GeneratedValue Long id;

    private String nameRegion;

    private String country;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameRegion() {
        return nameRegion;
    }

    public void setNameRegion(String nameRegion) {
        this.nameRegion = nameRegion;
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
        return Objects.equals(this.getId(), region.getId()) && Objects.equals(this.nameRegion, region.nameRegion)
                && Objects.equals(this.country, region.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getId(), this.nameRegion, this.country);
    }

    @Override
    public String toString() {
        return "Region{" + "id=" + this.getId() + ", Región='" + this.nameRegion + '\'' + ", country='" + this.country + '\'' +'}';
    }
}
