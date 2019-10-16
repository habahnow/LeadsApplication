package com.github.habahnow.leadsapplication.control;

import org.omg.CORBA.Current;

import java.util.ResourceBundle;

final class CurrentBundle {
    private final static Language DEFAULT_LANGUAGE = Language.ENGLISH;
    private static ResourceBundle currentBundle;

    private CurrentBundle(){
    }

    static ResourceBundle getCurrentBundle() {
        if(currentBundle == null){
           currentBundle = DEFAULT_LANGUAGE.getBundle();
        }
        return currentBundle;
    }

    static void changeLanguage(Language language){
        currentBundle = language.getBundle();
    }
}
