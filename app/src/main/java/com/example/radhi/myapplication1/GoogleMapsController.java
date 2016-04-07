package com.example.radhi.myapplication1;

import java.util.ArrayList;

/**
 * Created by Radhi on 4/7/2016.
 */
public class GoogleMapsController {
    static ArrayList ParametersOptions = new ArrayList();

    static ExpertADT GoogleMaps;

    public GoogleMapsController(){
        ExpertADT GoogleMaps = new ExpertADT();
        //ExpertADT.setParametersOptions(Meteorologist, ParametersOptions);
        ExpertADT.setNumCat(GoogleMaps, 4);
        ExpertADT.setIDNumber(GoogleMaps, 2);
        ExpertADT.setDB(GoogleMapsDatabase.GMData, GoogleMaps);
    }

    public static void compareAnswer(ArrayList b){
        for(int i=0; i <ExpertADT.getDB(GoogleMaps).size();){
            if (GoogleMapsDatabase.getminLong(GoogleMapsDatabase.getInfo(i)) == b.get(0) & GoogleMapsDatabase.getMaxLong(GoogleMapsDatabase.getInfo(i)) == b.get(1)
                    & GoogleMapsDatabase.getMinLat(GoogleMapsDatabase.getInfo(i)) == b.get(2)& GoogleMapsDatabase.getMaxLat(GoogleMapsDatabase.getInfo(i)) == b.get(3))
                ExpertADT.setSolveAnswer(i,GoogleMaps);
            else {i = i + 1;}
        }
    }
}

