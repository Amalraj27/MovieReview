package com.Agavian.Project.Repository;

import com.Agavian.Project.Model.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoviesRepo extends JpaRepository<Movies,Integer> {
}
