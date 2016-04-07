package com.example.radhi.myapplication1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Radhi on 4/6/2016.
 */
public class ExpertADT {
    int IDNumber;
    static int NumberOfCategories;
    static ArrayList ParametersOptions = new ArrayList();
    static ArrayList DB = new ArrayList();

    static ArrayList solveAnswer = new ArrayList();



    public static ArrayList getSolveAnswer(ExpertADT a) {
        return a.solveAnswer;
    }

    public static void setSolveAnswer(int i, ExpertADT a) {
        a.solveAnswer.add(i, a.DB.get(i));;
    }
    public static ArrayList getDB(ExpertADT a) {
        return a.DB;
    }
    public static void setDB(ArrayList dB, ExpertADT b) {
        b.DB = dB;
    }
    public static int getNumCat(ExpertADT a) {
        return a.NumberOfCategories;
    }
    public static void setNumCat(ExpertADT a, int numberOfCategories) {
        a.NumberOfCategories = numberOfCategories;
    }

    public static ArrayList getParametersOptions(ExpertADT b) {
        return b.ParametersOptions;
    }
    public static void setParametersOptions(ExpertADT a, ArrayList parametersOptions) {
        a.ParametersOptions.addAll(parametersOptions);
    }

    public static int getIDNumber(ExpertADT a ) {
        return a.IDNumber;
    }
    public static void setIDNumber(ExpertADT a, int iDNumber) {
        a.IDNumber = iDNumber;
    }




	/*public ExpertADT(String NofCategory, List<String> CategoryOptions){
		CategoryName.add(NofCategory);
		CategoryOptions.addAll(CategoryOptions);

	}*/

}
