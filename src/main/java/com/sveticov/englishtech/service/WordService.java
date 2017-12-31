package com.sveticov.englishtech.service;

import com.sveticov.englishtech.model.VocabularyModel;
import com.sveticov.englishtech.repository.WordRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service(value = "word_service")
public class WordService {
    @Qualifier("word_repository")
    @Autowired
    WordRepository wordRepository;

    Logger logger = LoggerFactory.getLogger(WordService.class);


    List<VocabularyModel> listWord = new ArrayList<>();
    List<VocabularyModel> listWordShort = new ArrayList<>();

    public void downloadAllData() {
        listWord.clear();
        listWord = wordRepository.findAll();
    }


    public VocabularyModel getOne(int adr) {
        return listWord.get(adr);
    }

    long diff_memory = 0l;

    public List<VocabularyModel> getListWord() {
        int sizeList = listWord.size();
        Random rnd =new Random();

        listWordShort = listWord.stream()

                .map(model -> {
                    for (int i = 0; i < listWord.size(); i++) {
                        int val = rnd.nextInt(listWord.size());

                        model = listWord.get(val);
                        return model;
                    }
                    return null;
                })
                .skip(0)
                .limit(6)
                .collect(Collectors.toList());

//        Random rnd = new Random();
//        long diff_local, diff_rnd;
//        long diff_local_2;
//        diff_rnd = rnd.nextInt(sizeList);
//
//        if (diff_rnd == diff_memory) {
//            diff_rnd = diff_rnd + 7l;
//        }
//
//        diff_local = diff_rnd;
//        diff_local_2 = sizeList - diff_local;
//
//
        logger.info("Size: " + listWord.size() + "  diff_local: " + rnd );
//
//        listWordShort = listWord.stream()
//                .filter(model -> {
//
//
//                    if (diff_local + 7 > sizeList) {
//
//
//                        return (diff_local - (7 - diff_local_2)) < model.getId();
//                    } else {
//
//                        return diff_local < model.getId() && model.getId() < diff_local + 7;
//                    }
//                })
//                .collect(Collectors.toList());

        listWordShort.stream()
                .forEach(model -> logger.info(model.toString()));


//        diff_memory = diff_rnd;

        return listWordShort;
    }


    public void saveOneModel(VocabularyModel model) {
        wordRepository.save(model);
        logger.info("save: " + model.toString());
    }


    public List<VocabularyModel> findAllModel() {
        wordRepository.findAll().stream().forEach(model -> logger.info(model.toString()));
        return wordRepository.findAll();
    }


    public int sizeData() {
        logger.info("sizeData(): " + listWord.size());
        return listWord.size();
    }


    public void clearListWord() {
        wordRepository.deleteAll();
    }
}
