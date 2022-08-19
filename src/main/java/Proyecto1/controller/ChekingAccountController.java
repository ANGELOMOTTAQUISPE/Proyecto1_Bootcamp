package Proyecto1.controller;

import Proyecto1.model.ChekingAccount;
import Proyecto1.service.IChekingAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/cheking")
public class ChekingAccountController {
    @Autowired
    private IChekingAccountService service;
    @GetMapping
    public ResponseEntity<Flux<ChekingAccount>> listar(){
        Flux<ChekingAccount> lista = service.list();
        return new ResponseEntity<Flux<ChekingAccount>>(lista, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Mono<ChekingAccount>> registrar(@RequestBody ChekingAccount checking){
        Mono<ChekingAccount> p = service.register(checking);
        return new ResponseEntity<Mono<ChekingAccount>>(p, HttpStatus.CREATED);
    }
}
