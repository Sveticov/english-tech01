package com.sveticov.englishtech;

import com.sveticov.englishtech.model.VirtualTest;
import com.sveticov.englishtech.model.VocabularyModel;
import com.sveticov.englishtech.repository.VirtualRepository;
import com.sveticov.englishtech.service.WordService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class EnglishTechApplication implements CommandLineRunner {
    //    @Autowired
//    WordService wordService;

    Logger logger= LoggerFactory.getLogger(EnglishTechApplication.class);
    @Qualifier("virt")
    @Autowired
    VirtualRepository repository;


    @Autowired
    WordService service;


    public static void main(String[] args) {
        SpringApplication.run(EnglishTechApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {

//      service.deleteAll();
//        service.saveWord(new VocabularyModel(0,"run", "бег"));
//        service.saveWord(new VocabularyModel(1,"11run11", "11бег11"));
//        service.saveWord(new VocabularyModel(2,"11run11", "11бег11"));
////        service.saveWord(new VocabularyModel("run2", "бег2"));
//
//        service.findAllModel();
    }

//    @PostConstruct
//    public void init() {
////        wordService.addNewWord(new VocabularyModel(1, "run", "бег"));
////        wordService.addNewWord(new VocabularyModel(2, "live", "жизнь"));
////        wordService.addNewWord(new VocabularyModel(3, "good", "хорошо"));
////        wordService.addNewWord(new VocabularyModel(4, "like", "нравится"));
////        wordService.addNewWord(new VocabularyModel(5, "apple", "яблоко"));
////        wordService.addNewWord(new VocabularyModel(6, "orange", "апельсин"));
////        wordService.addNewWord(new VocabularyModel(7, "orange", "апельсин"));
////        wordService.addNewWord(new VocabularyModel(8, "wood", "дерево"));
////        wordService.addNewWord(new VocabularyModel(9, "loop", "цикл"));
////        wordService.addNewWord(new VocabularyModel(10, "goal", "цель"));
////        wordService.addNewWord(new VocabularyModel(11, "make", "делать"));
////        wordService.addNewWord(new VocabularyModel(12, "make", "делать"));
////        wordService.addNewWord(new VocabularyModel(13, "make", "делать"));
////        wordService.addNewWord(new VocabularyModel(14, "make", "делать"));
////
////        wordService.saveWord(new VocabularyModel( "run", "бег"));
////        wordService.saveWord(new VocabularyModel( "live", "жизнь"));
////        wordService.saveWord(new VocabularyModel("good", "хорошо"));
//
//      //  wordService.getListWord();
//    }
}
