package Proyecto1.controller;

import Proyecto1.model.FixedTermAccount;
import Proyecto1.service.IFixedTermAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/fixedterm")
public class FixedTermAccountController {
    @Autowired
    private IFixedTermAccountService service;
    @GetMapping
    public ResponseEntity<Flux<FixedTermAccount>> listar(){
        Flux<FixedTermAccount> lista = service.list();
        return new ResponseEntity<Flux<FixedTermAccount>>(lista, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Mono<FixedTermAccount>> registrar(@RequestBody FixedTermAccount fixedterm){
        Mono<FixedTermAccount> p = service.register(fixedterm);
        return new ResponseEntity<Mono<FixedTermAccount>>(p, HttpStatus.CREATED);
    }
}
