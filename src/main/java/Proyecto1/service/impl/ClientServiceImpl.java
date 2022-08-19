package Proyecto1.service.impl;

import Proyecto1.model.Client;
import Proyecto1.repo.IClientRepo;
import Proyecto1.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Service
public class ClientServiceImpl implements IClientService {
    @Autowired
    private IClientRepo repo;

    @Override
    public Mono<Client> register(Client obj) {
        return repo.save(obj);
    }

    @Override
    public Mono<Client> modify(Client obj) {
        return repo.save(obj);
    }

    @Override
    public Flux<Client> list() {
        return repo.findAll();
    }

    @Override
    public Mono<Client> listofId(String id) {
        Mono<Client> op = repo.findById(id);
        return op;
    }
    @Override
    public boolean delete(String id) {
        repo.deleteById(id);
        return true;
    }
}
