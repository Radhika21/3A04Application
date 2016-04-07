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
    public static ArrayList<String> Answers = new ArrayList<String>();
    private int blah = 0;


    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        if(blah == position){
            return;
        }
        blah = position;
        String item = parent.getItemAtPosition(position).toString();
        // Showing selected spinner item
        Answers.add(item);
        blah = 0;

        Toast.makeText(parent.getContext(), "Selected: " + Answers.get(Answers.size()-1) + Answers.size(), Toast.LENGTH_LONG).show();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main2);
        IdentifyPhenomena.IdentifyPhenomena();
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, ExpertController.a4[0], Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);

        spinner1.setOnItemSelectedListener(this);
        List<String> ColorOptions = new ArrayList<String>();
        {  ColorOptions.add("Select Color");
            ColorOptions.add("purple");
            ColorOptions.add("white");
            ColorOptions.add("rainbow");
            ColorOptions.add("blue");
            ColorOptions.add("black");
            ColorOptions.add("yellow");
            ColorOptions.add("n/a");
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
        List<String> ShapeOptions = new ArrayList<String>();
        {ShapeOptions.add("Select Shape");
            ShapeOptions.add("sinusoidal");
            ShapeOptions.add("hourglass");
            ShapeOptions.add("n/a");
            ShapeOptions.add("droplet");
            ShapeOptions.add("spherical");
            ShapeOptions.add("cylindrical");
            ShapeOptions.add("arc");
            ShapeOptions.add("spider-vein");
            ShapeOptions.add("human-like");
            ShapeOptions.add("funnel");
            }


        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, ShapeOptions);

        // Drop down layout style - list view with radio button
        dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner2.setAdapter(dataAdapter2);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Spinner spinner3 = (Spinner) findViewById(R.id.spinner3);

        spinner3.setOnItemSelectedListener(this);
        List<String> OpacityOptions = new ArrayList<String>();
        {OpacityOptions.add("Select Opacity");
            OpacityOptions.add("opaque");
            OpacityOptions.add("translucent");
            OpacityOptions.add("translucent-opaque");
            OpacityOptions.add("n/a");}

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, OpacityOptions);

        // Drop down layout style - list view with radio button
        dataAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner3.setAdapter(dataAdapter3);
        //coment
        ////////////////////////////////////////////////////////////////////////////////////////////////////////
        Spinner spinner4 = (Spinner) findViewById(R.id.spinner4);

        spinner4.setOnItemSelectedListener(this);
        List<String> AngleOptions = new ArrayList<String>();
        {
            AngleOptions.add("Select Angle");
            AngleOptions.add("n/a");
            AngleOptions.add("varies");
            AngleOptions.add("45deg");
        }

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter4 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, AngleOptions);

        // Drop down layout style - list view with radio button
        dataAdapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner4.setAdapter(dataAdapter4);
        ////////////////////////////////////////////////////////////////////////////////////////////////////

        Spinner spinner5 = (Spinner) findViewById(R.id.spinner5);

        spinner5.setOnItemSelectedListener(this);
        List<String> ElevationOptions = new ArrayList<String>();
        {ElevationOptions.add("Select Elevation");
            ElevationOptions.add("sky");
            ElevationOptions.add("varies");
            ElevationOptions.add("n/a");
            ElevationOptions.add("ground");}



        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter5 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, ElevationOptions);

        // Drop down layout style - list view with radio button
        dataAdapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner5.setAdapter(dataAdapter5);
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        Spinner spinner6 = (Spinner) findViewById(R.id.spinner6);

        spinner6.setOnItemSelectedListener(this);
        List<String> DensityOptions = new ArrayList<String>();
        {DensityOptions.add("Select Density");
            DensityOptions.add("solid");
            DensityOptions.add("liquid");
            DensityOptions.add("gas");
            DensityOptions.add("n/a");}


        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter6 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, DensityOptions);

        // Drop down layout style - list view with radio button
        dataAdapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner6.setAdapter(dataAdapter6);

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Spinner spinner7 = (Spinner) findViewById(R.id.spinner7);

        spinner7.setOnItemSelectedListener(this);
        List<String> MoistnessOptions = new ArrayList<String>();
        {MoistnessOptions.add("Select Moistness");
            MoistnessOptions.add("yes");
            MoistnessOptions.add("no");}

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter7 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, MoistnessOptions);

        // Drop down layout style - list view with radio button
        dataAdapter7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner7.setAdapter(dataAdapter7);
        //////////////////////////////////////////////////////////////////////
        Spinner spinner8 = (Spinner) findViewById(R.id.spinner8);

        spinner8.setOnItemSelectedListener(this);
        List<String> SunOptions = new ArrayList<String>();
        {
            SunOptions.add("Does it involve the sun?");
            SunOptions.add("yes");
            SunOptions.add("n/a");
        }

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter8 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, SunOptions);

        // Drop down layout style - list view with radio button
        dataAdapter8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner8.setAdapter(dataAdapter8);
        ///////////////////////////////////////////////////////////////
        Spinner spinner9 = (Spinner) findViewById(R.id.spinner9);

        spinner9.setOnItemSelectedListener(this);
        List<String> TempOptions = new ArrayList<String>();
        {
            TempOptions.add("Is it hot or cold?");
            TempOptions.add("cold");
            TempOptions.add("hot");
            TempOptions.add("n/a");
        }

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter9 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, TempOptions);

        // Drop down layout style - list view with radio button
        dataAdapter9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner9.setAdapter(dataAdapter9);
        ////////////////////////////////////////////////////////
        Spinner spinner10 = (Spinner) findViewById(R.id.spinner10);

        spinner10.setOnItemSelectedListener(this);
        List<String> PrecipOptions = new ArrayList<String>();
        {
            PrecipOptions.add("Is there precipitation?");
            PrecipOptions.add("source");
            PrecipOptions.add("no");
            PrecipOptions.add("yes");
            PrecipOptions.add("n/a");
        }

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter10 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, PrecipOptions);

        // Drop down layout style - list view with radio button
        dataAdapter10.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner10.setAdapter(dataAdapter10);
        //////////////////////////////////////////////////////


    }


}


