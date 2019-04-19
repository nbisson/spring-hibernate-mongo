package com.miage.sim_tp1.services;

import com.miage.sim_tp1.models.Paiement;
import com.miage.sim_tp1.models.repository.PaiementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaiementService {

    @Autowired
    PaiementRepository paiementRepository;

    public void insert(Paiement paiement) { this.paiementRepository.insert(paiement); }
}
