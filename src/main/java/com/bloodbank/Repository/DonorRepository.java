package com.bloodbank.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bloodbank.models.Donor;

public interface DonorRepository extends JpaRepository<Donor, Long> {

	Optional<Donor> findById(Integer id);
    // Custom queries specific to the Donor entity

	void deleteAllById(Integer id);
}