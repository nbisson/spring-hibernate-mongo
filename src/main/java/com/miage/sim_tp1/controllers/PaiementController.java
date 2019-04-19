package com.miage.sim_tp1.controllers;

import com.miage.sim_tp1.models.Paiement;
import com.miage.sim_tp1.services.PaiementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PaiementController {

    @Autowired
    PaiementService paiementService;

    @RequestMapping(value = "/paiements", method = RequestMethod.POST)
    public ResponseEntity<Paiement> saveUser(@RequestBody Paiement paiement) {
        System.out.println(paiement.toString());
        try {
            paiementService.insert(paiement);
        } catch (Exception e) {
            System.err.println(e);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>(paiement, HttpStatus.CREATED);
    }

}
