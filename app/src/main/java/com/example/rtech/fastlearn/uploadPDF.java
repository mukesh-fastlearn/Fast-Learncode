package com.example.rtech.fastlearn;

public class uploadPDF {
    public String name;
    public static String url;

    public uploadPDF(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }



    public static String getUrl() {
        return url;
    }


}
