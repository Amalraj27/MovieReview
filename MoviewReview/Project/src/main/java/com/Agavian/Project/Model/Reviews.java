package com.Agavian.Project.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jdk.jfr.DataAmount;

@Entity
@Table(name = "Reviews")
public class Reviews {
    @Id
    private int id;
    private String reviewerName;
    private String comments;
    private int rating;

    @ManyToOne
    @JoinColumn(name = "movie_id", nullable = false)
    @JsonBackReference
    private Movies movies;

//    public Reviews(int id, String reviewerName, String comment, int rating, Movies movies) {
//        this.id = id;
//        this.reviewerName = reviewerName;
//        this.comment = comment;
//        this.rating = rating;
//        this.movies = movies;
//    }

    public Movies getMovies() {
        return movies;
    }

    public void setMovies(Movies movies) {
        this.movies = movies;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReviewerName() {
        return reviewerName;
    }

    public void setReviewerName(String reviewerName) {
        this.reviewerName = reviewerName;
    }

    public String getComment() {
        return comments;
    }

    public void setComment(String comments) {
        this.comments = comments;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Reviews(int id, String reviewerName, String comments, int rating) {
        this.id = id;
        this.reviewerName = reviewerName;
        this.comments = comments;
        this.rating = rating;
    }

    public Reviews(){}
}
