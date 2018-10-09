package com.preciousccheck.api.service;

import com.preciousccheck.api.model.Precious;
import com.preciousccheck.api.repository.PreciousRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PreciousService {
    private final PreciousRepository preciousRepository;

    @Autowired
    public PreciousService(PreciousRepository preciousRepository) {
        this.preciousRepository = preciousRepository;
    }

    public Precious getPreciousById(long id) {
        if (preciousRepository.findById(id).isPresent()) {
            return preciousRepository.findById(id).get();
        } else {
            return null;
        }
    }
}
