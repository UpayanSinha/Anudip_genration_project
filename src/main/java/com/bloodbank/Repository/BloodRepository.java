package com.bloodbank.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bloodbank.models.Blood;

public interface BloodRepository extends JpaRepository<Blood, Long> {

	Optional<Blood> findById(Integer id);
    // Custom queries specific to the Blood entity

	void deleteById(Integer id);
}