package com.example.radhi.myapplication1;

import java.util.ArrayList;

/**
 * Created by Radhi on 4/6/2016.
 */
public class ExpertController {
    static int MasterNUMCAT=0;
    ArrayList AllExperts = new ArrayList();
    static ArrayList AllCategories = new ArrayList();
    static String[] a4;

    public static void AddExpert(ExpertADT b){
        AllCategories.add(ExpertADT.getIDNumber(b), ExpertADT.getParametersOptions(b));
        MasterNUMCAT = MasterNUMCAT + ExpertADT.getNumCat(b);

    }
    //physicist
    //field
    //meteorologist
    //google maps

    public static void DeleteExpert(ExpertADT b){
        AllCategories.remove(ExpertADT.getIDNumber(b));
    }

    public static void divideCompare(ArrayList a){
        ArrayList b = new ArrayList();
        for (int i=0; i < ExpertADT.getNumCat(PhysicistController.Physicist1); i++){
            b.add(a.get(i));}
        PhysicistController.compareAnswer(b);
        ArrayList c = new ArrayList();
        for (int i=6; i < 6+ExpertADT.getNumCat(FieldController.Field); i++){
            c.add(a.get(i));}
        FieldController.compareAnswer(c);
        ArrayList d = new ArrayList();
        for (int i=9; i < 9+ExpertADT.getNumCat(MeteorologistController.Meteorologist); i++){
            d.add(a.get(i));}
        MeteorologistController.compareAnswer(d);
        ArrayList e = new ArrayList();
        for (int i=12; i < 12+ExpertADT.getNumCat(MeteorologistController.Meteorologist); i++){
            e.add(a.get(i));}
        MeteorologistController.compareAnswer(e);

    }

    public static String CompareSolvedAnswer(ExpertADT c,ExpertADT d, ExpertADT e) {
        String w;
        ArrayList a = ExpertADT.getSolveAnswer(c);
        ArrayList a1 = ExpertADT.getSolveAnswer(d);
        ArrayList a2 = ExpertADT.getSolveAnswer(e);


        for (int i = 0; i < a.size(); i++) {
            String z = a.get(i).toString();
            for (int j = 0; j < a1.size(); j++) {
                String y = a1.get(j).toString();
                for (int k = 0; k < a2.size(); k++) {
                    String x = a2.get(k).toString();
                    if (z == y & y == x & z == x) {
                        w = z;


                    }
                }
            }
        }return w;}
    }
}
