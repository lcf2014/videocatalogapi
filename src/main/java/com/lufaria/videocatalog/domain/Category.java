package com.lufaria.videocatalog.domain;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.UUID;

public class Category {
    private UUID id;
    private String name;
    private String description;
    private Boolean isActive;

    public Category(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Category(String name, String description, Boolean isActive) {
        this.name = name;
        this.description = description;
        this.isActive = isActive;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public void update(String name, String description, Boolean isActive) {
        this.setName(name);
        this.setDescription(description);
        if (isActive != null && isActive != this.getActive()) {
            this.setActive(isActive);
        }
    }
}
