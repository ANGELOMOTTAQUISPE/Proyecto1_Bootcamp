package Proyecto1.service;

import Proyecto1.model.Client;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IClientService extends ICRUD<Client, String> {

    Mono<Client> clientbydocumentNumber(String documentNumber);
    Mono<Long> countClient();
}
