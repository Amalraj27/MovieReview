package com.Agavian.Project.Repository;

import com.Agavian.Project.Model.Reviews;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepo extends JpaRepository<Reviews,Integer> {
}
