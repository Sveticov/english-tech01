package com.sveticov.englishtech.repository;

import com.sveticov.englishtech.model.VocabularyModel;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository(value = "word_repository")
public interface WordRepository extends MongoRepository<VocabularyModel,Long> {
}
