package Proyecto1.controller;

import Proyecto1.model.CreditAccount;
import Proyecto1.service.ICreditAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@RestController
@RequestMapping("/api/credit")
public class CreditAccountController {
    @Autowired
    private ICreditAccountService service;
    @GetMapping
    public ResponseEntity<Flux<CreditAccount>> listar(){
        Flux<CreditAccount> lista = service.list();
        return new ResponseEntity<Flux<CreditAccount>>(lista, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Mono<CreditAccount>> registrar(@RequestBody CreditAccount credit){
        Mono<CreditAccount> p = service.register(credit);
        return new ResponseEntity<Mono<CreditAccount>>(p, HttpStatus.CREATED);
    }
}
