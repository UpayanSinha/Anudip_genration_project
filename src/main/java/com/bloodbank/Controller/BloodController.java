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

import com.bloodbank.Service.BloodService;
import com.bloodbank.models.Blood;

@RestController
@RequestMapping("/blood")
public class BloodController {

    private final BloodService bloodService;

    public BloodController(BloodService bloodService) {
        this.bloodService = bloodService;
    }

    @GetMapping("/")
    public List<Blood> getAllBlood() {
        return bloodService.getAllBlood();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Blood> getBloodById(@PathVariable Integer id) {
        Blood blood = bloodService.getBloodById(id);
        return ResponseEntity.ok().body(blood);
    }

    @PostMapping("/")
    public ResponseEntity<Blood> saveBlood(@RequestBody Blood blood) {
        bloodService.saveBlood(blood);
        return ResponseEntity.ok().body(blood);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBlood(@PathVariable Integer id) {
        bloodService.deleteBlood(id);
        return ResponseEntity.ok().body("Blood with ID: " + id + " has been deleted successfully.");
    }
}
