package com.company;

public class Ball {
    //properties
    private String name;
    private String type;
    private int size;
    private char symbol;

    //constructor
    public Ball(String name, String type, int size, char symbol) {
        this.name = name;
        this.type = type;
        this.size = size;
        this.symbol = symbol;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public Ball() {

    }

    //behaviors
    public String bounce(int height, int spin) {
        String direction = "Go" + (height + spin * this.size);
        return direction;
    }


}
