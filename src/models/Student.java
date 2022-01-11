package models;

import java.util.UUID;

public class Student {
    private UUID id;
    private String name;

    public Student() {
        id = UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }
    
}
