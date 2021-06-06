package info.blockchain.insurance.repository;

import info.blockchain.insurance.model.Block;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface BlockRepository extends MongoRepository<Block, String> {
    
    @Query(value = "", sort= "{_id:-1}")
    Block findLastBlock();
}
