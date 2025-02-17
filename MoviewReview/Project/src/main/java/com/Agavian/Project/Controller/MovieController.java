package com.Agavian.Project.Controller;

import com.Agavian.Project.Model.Movies;
import com.Agavian.Project.Model.Reviews;
import com.Agavian.Project.Services.MovieServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    MovieServices movieServices;

    @GetMapping("/movies")
    public List<Movies> getmovies()
    {
        return movieServices.getmovies();
    }

    @PostMapping("/movies")
    public String addmovies(@RequestBody Movies movies)
    {
        movieServices.addmovies(movies);
        return "Added Successfully";
    }

    @PostMapping("/movies/{movieId}/reviews")
    public ResponseEntity<String> addReview(@PathVariable int movieId, @RequestBody Reviews reviews) {
        movieServices.addReview(movieId, reviews);
        return ResponseEntity.ok("Review added successfully");
    }

    @PutMapping("/reviews/{reviewId}")
    public ResponseEntity<String> updateReview(@PathVariable int reviewId, @RequestBody Reviews updatedReview) {
        movieServices.updateReview(reviewId, updatedReview);
        return ResponseEntity.ok("Review updated successfully");
    }

}
