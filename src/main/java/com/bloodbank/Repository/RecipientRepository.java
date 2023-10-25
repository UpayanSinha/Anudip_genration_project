package com.bloodbank.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bloodbank.models.Recipient;

public interface RecipientRepository extends JpaRepository<Recipient, Long> {

	Optional<Recipient> findById(Integer id);
    // Custom queries specific to the Recipient entity

	void deleteById(Integer id);
}