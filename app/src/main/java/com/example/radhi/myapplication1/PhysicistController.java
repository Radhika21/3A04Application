package com.example.radhi.myapplication1;

import android.app.IntentService;
import android.app.Service;
import android.content.Intent;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Radhi on 4/6/2016.
 */
public class PhysicistController {
    static ArrayList ColorOptions = new ArrayList();
    static ArrayList OpacityOptions = new ArrayList<String>();
    static ArrayList ElevationOptions = new ArrayList<String>();
    static ArrayList BrightnessOptions = new ArrayList<String>();
    static ArrayList AngleOptions = new ArrayList<String>();
    static ArrayList ShapeOptions = new ArrayList<String>();

    static ArrayList ParametersOptions = new ArrayList();

    public static ExpertADT getPhysicist1() {
        return Physicist1;
    }

    static ExpertADT Physicist1;

    public PhysicistController(){
     /*   {ColorOptions.add("red");
            ColorOptions.add("white");
            ColorOptions.add("rainbow");
            ColorOptions.add("blue");
            ColorOptions.add("green");
            ColorOptions.add("yellow");
            ColorOptions.add("multiple");
            ColorOptions.add("not applicable");
            ColorOptions.add("brown");}

        {OpacityOptions.add("opauqe");
            OpacityOptions.add("translucent");
            OpacityOptions.add("transparent");
            OpacityOptions.add("not applicable");}

        {ShapeOptions.add("linear");
            ShapeOptions.add("hourglass");
            ShapeOptions.add("not applicable");
            ShapeOptions.add("oval");
            ShapeOptions.add("spherical");
            ShapeOptions.add("cylindrical");
            ShapeOptions.add("arc");
            ShapeOptions.add("spider-vein");
            ShapeOptions.add("human-like");}

        ParametersOptions.add(ColorOptions);
        ParametersOptions.add(OpacityOptions);
        ParametersOptions.add(ShapeOptions);*/


        ExpertADT Physicist = new ExpertADT();
        Physicist1 = Physicist;
        ExpertADT.setParametersOptions(Physicist1, ParametersOptions);
        ExpertADT.setNumCat(Physicist1, 6);
        ExpertADT.setIDNumber(Physicist1, 0);
        ExpertADT.setDB(PhysicistDatabase.PData, Physicist1);



    }

       // Answer is going to be obtained from the identify phenomena, sorted from expert controller and acessed here
    //static List<String> Answer = new ArrayList(); // will be deleted

    // size of PData
    //static int a = PhysicistDatabase.PData.size();

    // Answers to be returned to expert controller
    //static ArrayList SolvedAnswers = new ArrayList();

    // Physicist Database made from users answers
    //static PhysicistDatabase Answer1 = new PhysicistDatabase(Answer.get(0),Answer.get(1),Answer.get(2), Answer.get(3), Answer.get(4), Answer.get(5));
    String shape;
    String color;
    String opacity;
    String elevation;
    String angle;

    // compare Answer1 to each element in Physicist Database
    public static void compareAnswer(ArrayList b){

        for(int i=0; i <ExpertADT.getDB(Physicist1).size();){
            if (PhysicistDatabase.getColor(PhysicistDatabase.getInfo(i)) == b.get(0) & PhysicistDatabase.getShape(PhysicistDatabase.getInfo(i)) == b.get(1)
                    & PhysicistDatabase.getOpacity(PhysicistDatabase.getInfo(i)) == b.get(2) & PhysicistDatabase.getAngle(PhysicistDatabase.getInfo(i)) == b.get(3)
                    &PhysicistDatabase.getElevation(PhysicistDatabase.getInfo(i)) == b.get(4) ){
                ExpertADT.setSolveAnswer(i,Physicist1);
            }
            else {i = i + 1;}

        }

    }
}
