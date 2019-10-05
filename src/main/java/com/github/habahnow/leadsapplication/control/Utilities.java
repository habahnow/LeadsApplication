package com.github.habahnow.leadsapplication.control;


import java.io.File;
import java.util.ArrayList;
import java.util.ResourceBundle;

final class Utilities {

    static String toAddress(String... locations){
        String address;
        StringBuilder addBuilder = new StringBuilder();

        for (String a:locations) {
            addBuilder.append(File.separator);
            addBuilder.append(a);
        }

        return addBuilder.toString();
    }
    static ResourceBundle getMessageBundle(){
        return ResourceBundle.getBundle(
                "com.github.habahnow.leadsapplication.resources.MessageBundle");
    }

}
