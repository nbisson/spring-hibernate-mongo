package com.miage.sim_tp1.models.repository;

import com.miage.sim_tp1.models.Paiement;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface PaiementRepository extends MongoRepository<Paiement, Integer> {

    Paiement insert(Paiement paiement);
}
