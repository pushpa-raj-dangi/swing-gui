package models;

import java.util.UUID;

public class University {
    private UUID id;
    private String name;
    private String address;

    
    public University(String name, String address) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return id + getName() + getAddress();
    }
}
