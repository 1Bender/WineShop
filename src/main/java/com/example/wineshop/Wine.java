package com.example.wineshop;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

public class Wine {

    private @Id @GeneratedValue Long id;
    private Winery winery;
    private int year;

    private float num_reviews;

    private String country;

    private Region region;

    private float price;

    private Type type;

    private int body;

    private int acidity;

    private float rating;

    private String name;

    public Wine() {}

    public Wine(Winery winery, int year, float num_reviews, String country, Region region, float price, Type type, int body, int acidity,
                float rating, String name) {
        this.winery = winery;
        this.year = year;
        this.num_reviews = num_reviews;
        this.country = country;
        this.region = region;
        this.price = price;
        this.type = type;
        this.body = body;
        this.acidity = acidity;
        this.rating= rating;
        this.name= name;
    }

    /*Getters and setters*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Winery getWinery() {
        return winery;
    }

    public void setWinery(Winery winery) {
        this.winery = winery;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getNum_reviews() {
        return num_reviews;
    }

    public void setNum_reviews(float num_reviews) {
        this.num_reviews = num_reviews;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getBody() {
        return body;
    }

    public void setBody(int body) {
        this.body = body;
    }

    public int getAcidity() {
        return acidity;
    }

    public void setAcidity(int acidity) {
        this.acidity = acidity;
    }


    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Wine))
            return false;
        Wine wine = (Wine) o;
        return Objects.equals(this.getId(), wine.getId()) && Objects.equals(this.winery, wine.winery)
                && Objects.equals(this.year, wine.year) && Objects.equals(this.region, wine.region)
                && Objects.equals(this.price, wine.price) && Objects.equals(this.name, wine.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getId(), this.winery, this.year, this.region, this.price, this.name);
    }

    @Override
    public String toString() {
        return "Wine{" + "id=" + this.getId() + ", winery='" + this.winery + '\'' + ", year='" + this.year
                + '\'' + ", rating='" + this.rating + '\'' + ", num_reviews='" + this.num_reviews +
                ", country='" + this.country + '\'' + ", region='" + this.region + '\'' + ", price='"
                + this.price + ", type='" + this.type + ", body='" + this.body + ", acidity='"
                + this.acidity + '\''+ ", name='" + this.name + '}';
    }



}


