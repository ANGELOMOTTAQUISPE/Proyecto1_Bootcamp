package Proyecto1.service.impl;

import Proyecto1.model.SavingAccount;
import Proyecto1.repo.ISavingAccountRepo;
import Proyecto1.service.ISavingAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Service
public class SavingAccountServiceImpl implements ISavingAccountService {
    @Autowired
    private ISavingAccountRepo repo;

    @Override
    public Mono<SavingAccount> register(SavingAccount obj) {
        return repo.save(obj);
    }

    @Override
    public Mono<SavingAccount> modify(SavingAccount obj) {
        return repo.save(obj);
    }

    @Override
    public Flux<SavingAccount> list() {
        return repo.findAll();
    }

    @Override
    public Mono<SavingAccount> listofId(String id) {
        Mono<SavingAccount> op = repo.findById(id);
        return op;
    }
    @Override
    public boolean delete(String id) {
        repo.deleteById(id);
        return true;
    }
}
