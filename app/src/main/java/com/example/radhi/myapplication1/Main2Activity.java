package com.example.radhi.myapplication1;

import android.app.Activity;
import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends Activity implements AdapterView.OnItemSelectedListener {
    ArrayList<String> Answers = new ArrayList<String>();

    //private MyService myservice = new MyService();
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();
        // Showing selected spinner item

        Answers.add(item);
        Toast.makeText(parent.getContext(), "Selected: " + Answers.get(Answers.size()-1) + Answers.size(), Toast.LENGTH_LONG).show();


    }

    public void setFillViewport (boolean fillViewport){
        android:setFillViewport(true);
    }

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);

       spinner1.setOnItemSelectedListener(this);
       List<String> ColorOptions = new ArrayList<String>();
       { ColorOptions.add("red");
           ColorOptions.add("white");
           ColorOptions.add("rainbow");
           ColorOptions.add("blue");
           ColorOptions.add("green");
           ColorOptions.add("yellow");
           ColorOptions.add("multiple");
           ColorOptions.add("not applicable");
           ColorOptions.add("brown");}

       // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, ColorOptions);

        // Drop down layout style - list view with radio button
        dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner1.setAdapter(dataAdapter1);

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
       Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);

       spinner2.setOnItemSelectedListener(this);
       List<String> OpacityOptions = new ArrayList<String>();
       {OpacityOptions.add("opauqe");
           OpacityOptions.add("translucent");
           OpacityOptions.add("transparent");
           OpacityOptions.add("not applicable");}

       // Creating adapter for spinner
       ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, OpacityOptions);

       // Drop down layout style - list view with radio button
       dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

       // attaching data adapter to spinner
       spinner2.setAdapter(dataAdapter2);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
       Spinner spinner3 = (Spinner) findViewById(R.id.spinner3);

       spinner3.setOnItemSelectedListener(this);
       List<String> ShapeOptions = new ArrayList<String>();
       {ShapeOptions.add("linear");
           ShapeOptions.add("hourglass");
           ShapeOptions.add("not applicable");
           ShapeOptions.add("oval");
           ShapeOptions.add("spherical");
           ShapeOptions.add("cylindrical");
           ShapeOptions.add("arc");
           ShapeOptions.add("spider-vein");
           ShapeOptions.add("human-like");}

       // Creating adapter for spinner
       ArrayAdapter<String> dataAdapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, ShapeOptions);

       // Drop down layout style - list view with radio button
       dataAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

       // attaching data adapter to spinner
       spinner3.setAdapter(dataAdapter3);
       //coment
       ////////////////////////////////////////////////////////////////////////////////////////////////////////
       Spinner spinner4 = (Spinner) findViewById(R.id.spinner4);

       spinner4.setOnItemSelectedListener(this);
       List<String> ElevationOptions = new ArrayList<String>();
       {ElevationOptions.add("sky");
           ElevationOptions.add("horizon");
           ElevationOptions.add("not applicable");
           ElevationOptions.add("ground");}

       // Creating adapter for spinner
       ArrayAdapter<String> dataAdapter4 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, ElevationOptions);

       // Drop down layout style - list view with radio button
       dataAdapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

       // attaching data adapter to spinner
       spinner4.setAdapter(dataAdapter4);
       ////////////////////////////////////////////////////////////////////////////////////////////////////

       Spinner spinner5 = (Spinner) findViewById(R.id.spinner5);

       spinner5.setOnItemSelectedListener(this);
       List<String> DensityOptions = new ArrayList<String>();
       {DensityOptions.add("solid");
           DensityOptions.add("liquid");
           DensityOptions.add("gas");
           DensityOptions.add("not applicable");}

       // Creating adapter for spinner
       ArrayAdapter<String> dataAdapter5 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, DensityOptions);

       // Drop down layout style - list view with radio button
       dataAdapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

       // attaching data adapter to spinner
       spinner5.setAdapter(dataAdapter5);
       /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

       Spinner spinner6 = (Spinner) findViewById(R.id.spinner6);

       spinner6.setOnItemSelectedListener(this);
       List<String> MoistnessOptions = new ArrayList<String>();
       {MoistnessOptions.add("yes");
           MoistnessOptions.add("no");}

       // Creating adapter for spinner
       ArrayAdapter<String> dataAdapter6 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, MoistnessOptions);

       // Drop down layout style - list view with radio button
       dataAdapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

       // attaching data adapter to spinner
       spinner6.setAdapter(dataAdapter6);

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();


            }
        });

    }

}

