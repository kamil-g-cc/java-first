package com.codecool.MyApp;

public class Field {
    private int x;
    private int y;
    private boolean empty;

    public Field(int x, int y, boolean empty) {
        this.x = x;
        this.y = y;
        this.empty = empty;
    }

    public String print(){
        return String.format("(%d, %d) is ", x, y) + (empty?"empty":"not empty");
    }
}
