package com.sveticov.englishtech.controller;

import com.sveticov.englishtech.model.VocabularyModel;
import com.sveticov.englishtech.service.WordService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class RestVisiController {

    Logger logger = LoggerFactory.getLogger(RestVisiController.class);

    @Autowired
    WordService wordService;
    AtomicInteger integer = new AtomicInteger(1);
    int valInt = 1;

    @GetMapping("/app/eng/tech/download/all/data")
    @ResponseBody
    public String downloadAllData() {
        logger.info(" download All Data");
        wordService.downloadAllData();
        return "download All Data";

    }

    @PostMapping("app/eng/tech/add/model")
    public void addNewWord(@RequestBody VocabularyModel model) {
        downloadAllData();
        model.setId(wordService.sizeData());
        wordService.saveOneModel(model);
        logger.info(model.toString());
    }

    int v = 1;

    @GetMapping("/get/model")
    @ResponseBody
    public VocabularyModel getOneModel() {
        VocabularyModel model = new VocabularyModel();
//       model= model._null();
        v++;
        try {
            model = wordService.getOne(v - 1);
        } catch (Exception er) {
        }
        logger.info("Model: " + model.toString());


        return model;
    }

    @GetMapping("show/list/model/six")
    public List<VocabularyModel> listModel() {
        List<VocabularyModel> json = wordService.getListWord();
        return json;
    }

    @GetMapping("/app/eng/clear/list/word")
    public String clearListWord(){
        wordService.clearListWord();
        logger.info("success list is empty");
        return "success list is empty";
    }
}
