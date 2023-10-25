package com.bloodbank.ServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bloodbank.Service.DonorService;

@SpringBootTest
public class DonorServiceImplTest {

    @Autowired
    private DonorService donorService;

    @Test
    public void testGetAllDonors() {
        assertNotNull(donorService.getAllDonors());
    }

    // Add more test cases for other methods in DonorServiceImpl as needed
}