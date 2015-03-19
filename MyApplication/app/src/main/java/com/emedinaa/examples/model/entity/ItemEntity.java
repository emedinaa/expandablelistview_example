package com.emedinaa.examples.model.entity;

import java.io.Serializable;

/**
 * Created by emedinaa on 19/03/15.
 */
public class ItemEntity implements Serializable {

    private String name;

    public ItemEntity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
