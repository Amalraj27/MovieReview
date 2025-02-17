package com.Agavian.Project.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Movies")
public class Movies {

    @Id
    private int id;
    private String title;
    private String genre;
    private String release_year;

    @OneToMany(mappedBy = "movies", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Reviews> reviews;

    public int getId() {
        return id;
    }

    public Movies(int id, String title, String genre, String release_year, List<Reviews> reviews) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.release_year = release_year;
        this.reviews = reviews;
    }

    public List<Reviews> getReviews() {
        return reviews;
    }

    public void setReviews(List<Reviews> reviews) {
        this.reviews = reviews;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getRelease_year() {
        return release_year;
    }

    public void setRelease_year(String release_year) {
        this.release_year = release_year;
    }

    public Movies(int id,String title, String genre, String release_year) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.release_year = release_year;
    }

    public Movies(){}
}
