package com.bloodbank.Service;

import java.util.List;

import com.bloodbank.models.Donor;

public interface DonorService {
    List<Donor> getAllDonors();
    Donor getDonorById(Integer id);
    void saveDonor(Donor donor);
    void deleteDonor(Integer id);
    // Other methods specific to the Donor entity
}