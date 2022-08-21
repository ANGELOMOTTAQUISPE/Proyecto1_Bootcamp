package Proyecto1.controller;

import Proyecto1.model.Client;
import Proyecto1.service.IClientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/api/client")
public class ClientController {
    private static final Logger logger = LoggerFactory.getLogger(ClientController.class);
    @Autowired
    private IClientService service;
    @GetMapping
    public ResponseEntity<Flux<Client>> listar(){
        Flux<Client> lista = service.list();
        Mono<Long> cantClient = service.countClient();

        logger.info("cantclient 2" + cantClient);

        return new ResponseEntity<Flux<Client>>(lista, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Mono<Client>> registrar(@RequestBody Client client){
        Mono<Client> p = service.register(client);
        return new ResponseEntity<Mono<Client>>(p, HttpStatus.CREATED);
    }
    @DeleteMapping("/{id}")
    public Mono<ResponseEntity<Void>> eliminar(@PathVariable("id") String id) {
        return service.delete(id).map(r->ResponseEntity.ok().<Void>build()).defaultIfEmpty(ResponseEntity.notFound().build());
    }
    @GetMapping("/documentNumber/{documentNumber}")
    public ResponseEntity<Mono<Client>> clientbydocumentNumber(@PathVariable("documentNumber") String documentNumber){
        Mono<Client> lista = service.clientbydocumentNumber(documentNumber);
        return new ResponseEntity<Mono<Client>>(lista, HttpStatus.OK);
    }
    @PutMapping
    public ResponseEntity<Mono<Client>> update(@RequestBody Client client){
        Mono<Client> p = service.modify(client);
        return new ResponseEntity<Mono<Client>>(p, HttpStatus.OK);
    }
}
