package com.bloodbank.ServiceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bloodbank.Repository.RecipientRepository;
import com.bloodbank.Service.RecipientService;
import com.bloodbank.models.Recipient;

@Service
public class RecipientServiceImpl implements RecipientService {

    private final RecipientRepository recipientRepository;

    public RecipientServiceImpl(RecipientRepository recipientRepository) {
        this.recipientRepository = recipientRepository;
    }

    @Override
    public List<Recipient> getAllRecipients() {
        return recipientRepository.findAll();
    }

    @Override
    public Recipient getRecipientById(Integer id) {
        return recipientRepository.findById(id).orElse(null);
    }

    @Override
    public void saveRecipient(Recipient recipient) {
        recipientRepository.save(recipient);
    }

    @Override
    public void deleteRecipient(Integer id) {
        recipientRepository.deleteById(id);
    }

    // Implement other methods specific to the Recipient entity
}
