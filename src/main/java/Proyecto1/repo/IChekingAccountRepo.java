package Proyecto1.repo;

import Proyecto1.model.ChekingAccount;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IChekingAccountRepo extends ReactiveMongoRepository<ChekingAccount, String> {
}
