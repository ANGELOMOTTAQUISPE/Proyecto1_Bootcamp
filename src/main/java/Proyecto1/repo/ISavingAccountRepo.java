package Proyecto1.repo;

import Proyecto1.model.SavingAccount;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISavingAccountRepo extends ReactiveMongoRepository<SavingAccount, String> {
}
