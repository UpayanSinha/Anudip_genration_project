package com.bloodbank.Service;

import java.util.List;

import com.bloodbank.models.Blood;

public interface BloodService {
    List<Blood> getAllBlood();
    Blood getBloodById(Integer id);
    void saveBlood(Blood blood);
    void deleteBlood(Integer id);
    // Other methods specific to the Blood entity
}