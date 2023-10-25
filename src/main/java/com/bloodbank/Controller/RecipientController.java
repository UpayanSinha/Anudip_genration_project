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

import com.bloodbank.Service.RecipientService;
import com.bloodbank.models.Recipient;

@RestController
@RequestMapping("/recipients")
public class RecipientController {

    private final RecipientService recipientService;

    public RecipientController(RecipientService recipientService) {
        this.recipientService = recipientService;
    }

    @GetMapping("/")
    public List<Recipient> getAllRecipients() {
        return recipientService.getAllRecipients();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Recipient> getRecipientById(@PathVariable Integer id) {
        Recipient recipient = recipientService.getRecipientById(id);
        return ResponseEntity.ok().body(recipient);
    }

    @PostMapping("/")
    public ResponseEntity<Recipient> saveRecipient(@RequestBody Recipient recipient) {
        recipientService.saveRecipient(recipient);
        return ResponseEntity.ok().body(recipient);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteRecipient(@PathVariable Integer id) {
        recipientService.deleteRecipient(id);
        return ResponseEntity.ok().body("Recipient with ID: " + id + " has been deleted successfully.");
    }
}
