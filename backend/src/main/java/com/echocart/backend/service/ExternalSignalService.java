package com.echocart.backend.service;

import com.echocart.backend.model.ExternalSignal;
import com.echocart.backend.repository.ExternalSignalRepository;
import org.springframework.stereotype.Service;

@Service
public class ExternalSignalService {
    private final ExternalSignalRepository externalSignalRepository;
    public ExternalSignalService(ExternalSignalRepository repo) {
        this.externalSignalRepository = repo;
    }

    public void addSignal(ExternalSignal signal){
        externalSignalRepository.saveSignal(signal);
    }
}
