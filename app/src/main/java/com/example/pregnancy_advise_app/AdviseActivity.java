package com.example.pregnancy_advise_app;

import java.util.ArrayList;

public class AdviseActivity {
    String name;
    ArrayList<String> advises;
    int image1,image2,image3;
    public AdviseActivity( String name,ArrayList<String> advises, int image1,int image2,int image3){
        this.name = name;
        this.advises = advises;
        this.image1 = image1;
        this.image2 = image2;
        this.image3 = image3;
    }
}
