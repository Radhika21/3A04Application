package com.example.radhi.myapplication1;

import android.app.IntentService;
import android.app.Service;
import android.content.Intent;

import java.util.ArrayList;

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

  /*  public void onHandleIntent(Intent intent){
        com.example.radhi.myapplication1.PhysicistController.creatingExpert();
        //x = com.example.radhi.myapplication1.PhysicistController.ColorOptions.size();
       String[] a = (String[]) com.example.radhi.myapplication1.PhysicistController.ColorOptions.toArray();
    }*/

    public static ExpertADT creatingExpert(){
        {ColorOptions.add("red");
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
        ParametersOptions.add(ShapeOptions);

        ExpertADT Physicist = new ExpertADT();
        ExpertADT.setParametersOptions(Physicist, ParametersOptions);
        ExpertADT.setNumCat(Physicist, 6);
        ExpertADT.setIDNumber(Physicist, 0);

        return Physicist;

    }

    /*public static void main(String [] args){
        ExpertADT a = ExpertController.CreateExperts();
        ExpertController.AddExpert(a);
        System.out.println(ExpertController.AllCategories.toString());
        Object c = (ExpertController.AllCategories.get(0));
        Object b = ((ArrayList) c).get(0);
        System.out.println((((ArrayList) c).get(0)).toString());
        System.out.println((((ArrayList) b).get(1)).toString());


    }*/



    // Answer is going to be obtained from the identify phenomena, sorted from expert controller and acessed here
    //static List<String> Answer = new ArrayList(); // will be deleted

    // size of PData
    //static int a = PhysicistDatabase.PData.size();

    // Answers to be returned to expert controller
    //static ArrayList SolvedAnswers = new ArrayList();

    // Physicist Database made from users answers
    //static PhysicistDatabase Answer1 = new PhysicistDatabase(Answer.get(0),Answer.get(1),Answer.get(2), Answer.get(3), Answer.get(4), Answer.get(5));


// compare Answer1 to each element in Physicist Database
	/*public static void compareAnswer(PhysicistDatabase b){

		for(int i=0; i<a;){
			if (PhysicistDatabase.getShape(PhysicistDatabase.getInfo(i)) == b.shape & PhysicistDatabase.getColor(PhysicistDatabase.getInfo(i)) == b.color
					& PhysicistDatabase.getSize(PhysicistDatabase.getInfo(i)) == b.size & PhysicistDatabase.getOpacity(PhysicistDatabase.getInfo(i)) == b.opacity
					&PhysicistDatabase.getElevation(PhysicistDatabase.getInfo(i)) == b.elevation & PhysicistDatabase.getBrightness(PhysicistDatabase.getInfo(i)) == b.brightness){
				SolvedAnswers.add(PhysicistDatabase.PData.get(i));
			}
			else {i = i + 1;}
		}

    }*/
}
