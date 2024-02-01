package com.example.hospital.domain.buildings;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.List;

public class Storage extends Building{

    private List<String> storageItems;

    public List<String> getStorageItems() {
        return storageItems;
    }

    public void setStorageItems(List<String> storageItems) {
        this.storageItems = storageItems;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "storageItems=" + storageItems +
                '}';
    }
}
