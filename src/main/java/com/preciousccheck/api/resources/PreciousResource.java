package com.preciousccheck.api.resources;

import com.preciousccheck.api.model.Precious;
import com.preciousccheck.api.service.PreciousService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PreciousResource {
    final
    private PreciousService preciousService;

    @Autowired
    public PreciousResource(PreciousService preciousService) {
        this.preciousService = preciousService;
    }

    @GetMapping("/precious/{id}")
    public ResponseEntity<Precious> getPreciousById(@PathVariable long id) {
        Precious precious = preciousService.getPreciousById(id);
        return new ResponseEntity<>(precious, HttpStatus.OK);
    }
}
