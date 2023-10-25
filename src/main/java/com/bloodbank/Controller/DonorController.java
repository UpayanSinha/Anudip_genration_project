package com.bloodbank.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bloodbank.Service.DonorService;
import com.bloodbank.models.Donor;

@RestController
@RequestMapping("/donors")
public class DonorController {

    private final DonorService donorService;

    public DonorController(DonorService donorService) {
        this.donorService = donorService;
    }

    @GetMapping("/")
    public List<Donor> getAllDonors() {
        return donorService.getAllDonors();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Donor> getDonorById(@PathVariable Integer id) {
        Donor donor = donorService.getDonorById(id);
        return ResponseEntity.ok().body(donor);
    }

    @PostMapping("/")
    public ResponseEntity<Donor> saveDonor(@RequestBody Donor donor) {
        donorService.saveDonor(donor);
        return ResponseEntity.ok().body(donor);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteDonor(@PathVariable Integer id) {
        donorService.deleteDonor(id);
        return ResponseEntity.ok().body("Donor with ID: " + id + " has been deleted successfully.");
    }
}
