package com.greenfox.exams.java;
import javax.swing.*;

/**
 * Created by Viktor on 2016.12.05..
 */
public class TheCard {

    String color;
    int value;

    public TheCard(String color, int value){
        this.color=color;
        this.value=value;
    }

    public int getValue(){
        return this.value;
    }

    @Override
    public String toString(){

        return this.color+" "+this.value;
    }

}
