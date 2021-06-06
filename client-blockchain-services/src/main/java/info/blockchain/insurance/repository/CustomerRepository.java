package info.blockchain.insurance.repository;

import info.blockchain.insurance.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {
}
