package com.bloodbank.ServiceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bloodbank.Repository.BloodRepository;
import com.bloodbank.Service.BloodService;
import com.bloodbank.models.Blood;

@Service
public class BloodServiceImpl implements BloodService {

    private final BloodRepository bloodRepository;

    public BloodServiceImpl(BloodRepository bloodRepository) {
        this.bloodRepository = bloodRepository;
    }

    @Override
    public List<Blood> getAllBlood() {
        return bloodRepository.findAll();
    }

    @Override
    public Blood getBloodById(Integer id) {
        return bloodRepository.findById(id).orElse(null);
    }

    @Override
    public void saveBlood(Blood blood) {
        bloodRepository.save(blood);
    }

    @Override
    public void deleteBlood(Integer id) {
        bloodRepository.deleteById(id);
    }

    // Implement other methods specific to the Blood entity
}
