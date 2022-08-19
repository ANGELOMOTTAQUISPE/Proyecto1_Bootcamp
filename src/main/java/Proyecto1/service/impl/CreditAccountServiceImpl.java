package Proyecto1.service.impl;

import Proyecto1.model.CreditAccount;
import Proyecto1.repo.ICreditAccountRepo;
import Proyecto1.service.ICreditAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Service
public class CreditAccountServiceImpl implements ICreditAccountService {
    @Autowired
    private ICreditAccountRepo repo;

    @Override
    public Mono<CreditAccount> register(CreditAccount obj) {
        return repo.save(obj);
    }

    @Override
    public Mono<CreditAccount> modify(CreditAccount obj) {
        return repo.save(obj);
    }

    @Override
    public Flux<CreditAccount> list() {
        return repo.findAll();
    }

    @Override
    public Mono<CreditAccount> listofId(String id) {
        Mono<CreditAccount> op = repo.findById(id);
        return op;
    }
    @Override
    public boolean delete(String id) {
        repo.deleteById(id);
        return true;
    }
}
