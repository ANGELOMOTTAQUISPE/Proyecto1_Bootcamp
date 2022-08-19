package Proyecto1.service.impl;

import Proyecto1.model.FixedTermAccount;
import Proyecto1.repo.IFixedTermAccountRepo;
import Proyecto1.service.IFixedTermAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Service
public class FixedTermAccountServiceImpl implements IFixedTermAccountService {
    @Autowired
    private IFixedTermAccountRepo repo;

    @Override
    public Mono<FixedTermAccount> register(FixedTermAccount obj) {
        return repo.save(obj);
    }

    @Override
    public Mono<FixedTermAccount> modify(FixedTermAccount obj) {
        return repo.save(obj);
    }

    @Override
    public Flux<FixedTermAccount> list() {
        return repo.findAll();
    }

    @Override
    public Mono<FixedTermAccount> listofId(String id) {
        Mono<FixedTermAccount> op = repo.findById(id);
        return op;
    }
    @Override
    public boolean delete(String id) {
        repo.deleteById(id);
        return true;
    }
}
