package com.sveticov.englishtech.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "VirtualTest")
public class VirtualTest {
    @Id
    private String id;
    private String name;

    public VirtualTest() {
    }

    public VirtualTest( String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
