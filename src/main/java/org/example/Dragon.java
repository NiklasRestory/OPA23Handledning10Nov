package org.example;

public class Dragon {
    private String name;
    private int age;
    private int wingspan;
    private String color;
    private int gasLevel;

    public Dragon(String name, int age, int wingspan, String color, int gasLevel) {
        this.name = name;
        this.age = age;
        this.wingspan = wingspan;
        this.color = color;
        this.gasLevel = gasLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getGasLevel() {
        return gasLevel;
    }

    public void setGasLevel(int gasLevel) {
        this.gasLevel = gasLevel;
    }
}
