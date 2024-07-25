package com.example.smartgrow;

public class plant {
    String Key, name, Descripcion, sun;

    public plant() {
    }

    public String getKey() {
        return Key;
    }

    public void setKey(String key) {
        Key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String water) {
        this.Descripcion = water;
    }

    public String getSun() {
        return sun;
    }

    public void setSun(String sun) {
        this.sun = sun;
    }
}
