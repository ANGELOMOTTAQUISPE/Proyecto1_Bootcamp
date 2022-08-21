package Proyecto1.repo;

import Proyecto1.model.CreditAccount;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface ICreditAccountRepo extends ReactiveMongoRepository<CreditAccount, String> {

}
