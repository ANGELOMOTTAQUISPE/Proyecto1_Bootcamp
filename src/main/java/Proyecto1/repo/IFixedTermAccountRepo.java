package Proyecto1.repo;

import Proyecto1.model.FixedTermAccount;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFixedTermAccountRepo extends ReactiveMongoRepository<FixedTermAccount, String> {
}
