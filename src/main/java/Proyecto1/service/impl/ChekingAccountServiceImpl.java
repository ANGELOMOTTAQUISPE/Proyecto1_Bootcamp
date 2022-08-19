package Proyecto1.service.impl;

import Proyecto1.model.ChekingAccount;
import Proyecto1.repo.IChekingAccountRepo;
import Proyecto1.service.IChekingAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ChekingAccountServiceImpl implements IChekingAccountService {
    @Autowired
    private IChekingAccountRepo repo;

    @Override
    public Mono<ChekingAccount> register(ChekingAccount obj) {
        return repo.save(obj);
    }

    @Override
    public Mono<ChekingAccount> modify(ChekingAccount obj) {
        return repo.save(obj);
    }

    @Override
    public Flux<ChekingAccount> list() {
        return repo.findAll();
    }

    @Override
    public Mono<ChekingAccount> listofId(String id) {
        Mono<ChekingAccount> op = repo.findById(id);
        return op;
    }
    @Override
    public boolean delete(String id) {
        repo.deleteById(id);
        return true;
    }
}
