package com.example.radhi.myapplication1;

import java.util.ArrayList;

/**
 * Created by Radhi on 4/7/2016.
 */
public class IdentifyPhenomena {

    public static void IdentifyPhenomena(){
        ArrayList a = Main2Activity.Answers;
        ExpertController.divideCompare(a);
        ExpertController.CompareSolvedAnswer(PhysicistController.Physicist1, FieldController.Field, MeteorologistController.Meteorologist);

    }


}




