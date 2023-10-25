package com.bloodbank.Service;

import java.util.List;

import com.bloodbank.models.Recipient;

public interface RecipientService {
    List<Recipient> getAllRecipients();
    Recipient getRecipientById(Integer id);
    void saveRecipient(Recipient recipient);
    void deleteRecipient(Integer id);
    // Other methods specific to the Recipient entity
}