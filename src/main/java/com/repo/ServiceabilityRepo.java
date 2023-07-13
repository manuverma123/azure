package com.repo; 

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Serviceability;

public interface ServiceabilityRepo extends JpaRepository<Serviceability, Integer> {

    // Method for retrieving serviceability information based on product ID and pin code
    List<Serviceability> findByPidAndPincodes(int id, int code);
}
