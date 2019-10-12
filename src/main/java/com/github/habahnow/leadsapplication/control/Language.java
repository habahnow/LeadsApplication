package com.github.habahnow.leadsapplication.control;

import java.util.Locale;
import java.util.ResourceBundle;

enum Language {



    ENGLISH( ResourceBundle.getBundle("com.github.habahnow.leadsapplication.resources.MessageBundle",
            new Locale("en", "US" ) )),
    SPANISH( ResourceBundle.getBundle("com.github.habahnow.leadsapplication.resources.MessageBundle" ,
            new Locale("es", "MX")));

    private ResourceBundle bundle;

    private Language(ResourceBundle bundle) {
        this.bundle = bundle;
    }

    public ResourceBundle getBundle(){
        return bundle;
    }

}
