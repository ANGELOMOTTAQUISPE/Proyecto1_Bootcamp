package Proyecto1.controller;

import Proyecto1.model.FixedTermAccount;
import Proyecto1.model.SavingAccount;
import Proyecto1.service.IFixedTermAccountService;
import Proyecto1.service.ISavingAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/saving")
public class SavingAccountController {
    @Autowired
    private ISavingAccountService service;
    @GetMapping
    public ResponseEntity<Flux<SavingAccount>> listar(){
        Flux<SavingAccount> lista = service.list();
        return new ResponseEntity<Flux<SavingAccount>>(lista, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Mono<SavingAccount>> registrar(@RequestBody SavingAccount saving){
        Mono<SavingAccount> p = service.register(saving);
        return new ResponseEntity<Mono<SavingAccount>>(p, HttpStatus.CREATED);
    }
}
