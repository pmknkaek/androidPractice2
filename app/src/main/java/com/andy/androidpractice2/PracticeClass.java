package com.andy.androidpractice2;

/**
 * Created by Andy on 8/22/2017.
 */


public class PracticeClass {
    private String word;
    private String translation;


    public static final PracticeClass[] translations = {
            new PracticeClass("Hello", "Hallo"),
            new PracticeClass("Skinny", "Schlank")
    };

    public PracticeClass(String word, String translation){
        this.word = word;
        this.translation = translation;
    }

    public String getWord(){
        return word;
    }

    public String getTranslation(){
        return translation;
    }

    public String toString(){
        return word+" = "+translation;
    }
}
