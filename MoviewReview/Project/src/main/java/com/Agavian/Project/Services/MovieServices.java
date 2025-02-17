package com.Agavian.Project.Services;

import com.Agavian.Project.Model.Movies;
import com.Agavian.Project.Model.Reviews;
import com.Agavian.Project.Repository.MoviesRepo;
import com.Agavian.Project.Repository.ReviewRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServices {
    @Autowired
    MoviesRepo moviesRepo;

    @Autowired
    ReviewRepo reviewRepo;

    public List<Movies> getmovies() {
        return moviesRepo.findAll();
    }

    public void addmovies(Movies movies) {
        moviesRepo.save(movies);
    }

    public void addReview(int movieId, Reviews reviews) {
        Movies movies = moviesRepo.findById(movieId)
                .orElseThrow(() -> new RuntimeException("Movie not found"));
        reviews.setMovies(movies);
        reviewRepo.save(reviews);
    }

    public void updateReview(int reviewId, Reviews updatedReview) {
        Reviews existingReview = reviewRepo.findById(reviewId)
                .orElseThrow(() -> new RuntimeException("Review not found"));

        existingReview.setComment(updatedReview.getComment());
        existingReview.setRating(updatedReview.getRating());
        existingReview.setReviewerName(updatedReview.getReviewerName());

        reviewRepo.save(existingReview);
    }
}
