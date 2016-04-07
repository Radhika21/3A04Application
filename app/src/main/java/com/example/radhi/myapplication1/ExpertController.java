package com.example.radhi.myapplication1;

import java.util.ArrayList;

/**
 * Created by Radhi on 4/6/2016.
 */
public class ExpertController {
    static int MasterNUMCAT=0;
    ArrayList AllExperts = new ArrayList();
    static ArrayList AllCategories = new ArrayList();

    public static void AddExpert(ExpertADT b){
        AllCategories.add(ExpertADT.getIDNumber(b), ExpertADT.getParametersOptions(b));
        MasterNUMCAT = MasterNUMCAT + ExpertADT.getNumCat(b);

    }

    public static void DeleteExpert(ExpertADT b){
        AllCategories.remove(ExpertADT.getIDNumber(b));
    }

    public static void divideCompare(ArrayList a){
        ArrayList b = new ArrayList();
        for (int i=0; i < ExpertADT.getNumCat(PhysicistController.Physicist); i++){
            b.add(a.get(i));}
        PhysicistController.compareAnswer(b);
    }
}
