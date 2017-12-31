package com.sveticov.englishtech.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "vocabulary_model")
public class VocabularyModel {
    @Id
    private @Getter
    @Setter
    long id;
    private @Getter
    @Setter
    String enWord;
    private @Getter
    @Setter
    String ruWord;

    public VocabularyModel() {
    }

    public VocabularyModel(long id, String enWord, String ruWord) {
        this.id = id;
        this.enWord = enWord;
        this.ruWord = ruWord;
    }

    @Override
    public String toString() {
        return "VocabularyModel{" +
                "id=" + id +
                ", enWord='" + enWord + '\'' +
                ", ruWord='" + ruWord + '\'' +
                '}';
    }


}
