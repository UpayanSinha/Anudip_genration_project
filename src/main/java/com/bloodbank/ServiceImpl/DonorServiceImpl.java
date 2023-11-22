package com.bloodbank.ServiceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bloodbank.Repository.DonorRepository;
import com.bloodbank.Service.DonorService;
import com.bloodbank.models.Donor;

@Service
public class DonorServiceImpl implements DonorService {

    private final DonorRepository donorRepository;

    public DonorServiceImpl(DonorRepository donorRepository) {
        this.donorRepository = donorRepository;
    }

    @Override
    public List<Donor> getAllDonors() {
        return donorRepository.findAll();
    }

    @Override
    public Donor getDonorById(Integer id) {
        return donorRepository.findById(id).orElse(null);
    }

    @Override
    public void saveDonor(Donor donor) {
        donorRepository.save(donor);
    }

    @Override
    public void deleteDonor(Integer id) {
        donorRepository.deleteAllById(id);
    }

    // Implement other methods specific to the Donor entity
}
