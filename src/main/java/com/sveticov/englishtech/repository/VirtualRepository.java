package com.sveticov.englishtech.repository;

import com.sveticov.englishtech.model.VirtualTest;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository(value = "virt")
public interface VirtualRepository extends MongoRepository<VirtualTest,String > {

}
