package com.example.radhi.myapplication1;

import java.util.ArrayList;

/**
 * Created by Radhi on 4/6/2016.
 */
public class ExpertController {
    ArrayList AllExperts = new ArrayList();
    static ArrayList AllCategories = new ArrayList();

    public static ExpertADT CreateExperts(){
        ExpertADT a = PhysicistController.creatingExpert();
        return a;
    }

    public static void AddExpert(ExpertADT b){
        AllCategories.add(ExpertADT.getIDNumber(b), ExpertADT.getParametersOptions(b));

    }

    public static void DeleteExpert(ExpertADT b){
        AllCategories.remove(ExpertADT.getIDNumber(b));
    }

    public static void divideInfo(ArrayList a){

    }
}
