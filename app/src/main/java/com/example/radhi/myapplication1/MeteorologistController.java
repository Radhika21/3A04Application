package com.example.radhi.myapplication1;

import java.util.ArrayList;

/**
 * Created by Radhi on 4/7/2016.
 */
public class MeteorologistController {
    static ArrayList ParametersOptions = new ArrayList();

    static ExpertADT Meteorologist;

    public MeteorologistController(){
        ExpertADT Meteorologist = new ExpertADT();
        //ExpertADT.setParametersOptions(Meteorologist, ParametersOptions);
        ExpertADT.setNumCat(Meteorologist, 3);
        ExpertADT.setIDNumber(Meteorologist, 1);
        ExpertADT.setDB(PhysicistDatabase.PData, Meteorologist);
    }

    public static void compareAnswer(ArrayList b){
        for(int i=0; i < 3; ){
            if (MeteorologistDatabase.getSun(MeteorologistDatabase.getInfo(i)) == b.get(0) & MeteorologistDatabase.getTemp(MeteorologistDatabase.getInfo(i)) == b.get(1)
                    & MeteorologistDatabase.getPrecip(MeteorologistDatabase.getInfo(i)) == b.get(2)){
                ExpertADT.setSolveAnswer(i,Meteorologist);
            }
            else {i = i + 1;}
        }
    }

}
