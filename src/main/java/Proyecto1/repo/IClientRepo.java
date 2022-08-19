package Proyecto1.repo;

import Proyecto1.model.Client;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClientRepo extends ReactiveMongoRepository<Client, String> {
}
