package com.example.radhi.myapplication1;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Radhi on 4/7/2016.
 */
public class PhysicistDatabase {
    private static Collection PhysicistDatabase;
    public static ArrayList PData = new ArrayList(PhysicistDatabase);
    String shape;
    String color;
    String opacity;
    String elevation;
    String angle;
    public PhysicistDatabase(String color, String shape,  String opacity, String angle, String elevation){
        this.shape = shape;
        this.color = color;
        this.opacity = opacity;
        this.angle = angle;
        this.elevation = elevation;


        PhysicistDatabase BallLightning = new PhysicistDatabase("blue","spherical","opaque","n/a","sky");
        PhysicistDatabase Clouds = new PhysicistDatabase("white","n/a","n/a","n/a","n/a");
        PhysicistDatabase DiamondDust = new PhysicistDatabase("white","n/a","translucent","n/a","ground");
        PhysicistDatabase DustDevil = new PhysicistDatabase("brown","cylindrical","translucent","n/a","n/a");
        PhysicistDatabase DustStorm = new PhysicistDatabase("brown","n/a","translucent-opaque","n/a","sky");
        PhysicistDatabase Hail = new PhysicistDatabase("white","sqpherical","translucent-opaque","n/a","sky");
        PhysicistDatabase Halo = new PhysicistDatabase("rainbow","arc","n/a","n/a","sky");
        PhysicistDatabase KevinHelmholtzInstability = new PhysicistDatabase("n/a","sinusoidal","n/a","n/a","varies");
        PhysicistDatabase LightPillar = new PhysicistDatabase("rainbow","cylindrical","translucent","n/a","varies");
        PhysicistDatabase Lightning = new PhysicistDatabase("blue","spider-vein","opaque","n/a","varies");
        PhysicistDatabase MorningGloryCloud = new PhysicistDatabase("white","cylindrical","n/a","n/a","sky");
        PhysicistDatabase NovayaZemiyaEffect = new PhysicistDatabase("yellow","hourglass","translucent","n/a","n/a");
        PhysicistDatabase Rain = new PhysicistDatabase("n/a","droplet","translucent","n/a","n/a");
        PhysicistDatabase RainAndSnow = new PhysicistDatabase("white","n/a","translucent","n/a","sky");
        PhysicistDatabase Rainbow = new PhysicistDatabase("rainbow","arc","translucent","varies","n/a");
        PhysicistDatabase IcePellets = new PhysicistDatabase("white","n/a","translucent","n/a","n/a");
        PhysicistDatabase StElmosFire = new PhysicistDatabase("purple","n/a","translucent","n/a","n/a");
        PhysicistDatabase SunShower = new PhysicistDatabase("n/a","n/a","n/a","n/a","n/a");
        PhysicistDatabase Supercell = new PhysicistDatabase("n/a","n/a","opaque","n/a","sky");
        PhysicistDatabase Thunderstorm = new PhysicistDatabase("n/a","n/a","n/a","n/a","n/a");
        PhysicistDatabase Tornado = new PhysicistDatabase("n/a","funnel","translucent-opaque","n/a","varies");
        PhysicistDatabase BrockenSpectre = new PhysicistDatabase("black","human-like","n/a","45deg","varies");



        PData.add(0,BallLightning);
        PData.add(1,Clouds);
        PData.add(2,DiamondDust);
        PData.add(3,DustDevil);
        PData.add(4,DustStorm);
        PData.add(5,Hail);
        PData.add(6,Halo);
        PData.add(7,KevinHelmholtzInstability);
        PData.add(8,LightPillar);
        PData.add(9,Lightning);
        PData.add(10,MorningGloryCloud);
        PData.add(11,NovayaZemiyaEffect);
        PData.add(12,Rain);
        PData.add(13,RainAndSnow);
        PData.add(14,Rainbow);
        PData.add(15,IcePellets);
        PData.add(16,StElmosFire);
        PData.add(17,SunShower);
        PData.add(18,Supercell);
        PData.add(19,Thunderstorm);
        PData.add(20,Tornado);
        PData.add(21,BrockenSpectre);


    }

    public static String getColor(PhysicistDatabase a){
        return a.color;
    }

    public static String getOpacity(PhysicistDatabase a){
        return a.opacity;
    }

    public static String getAngle(PhysicistDatabase a){
        return a.angle;
    }

    public static String getElevation(PhysicistDatabase a){
        return a.elevation;
    }


    public static String getShape(PhysicistDatabase a) {
        return a.shape;
    }

    public static PhysicistDatabase getInfo(int i) {
        // TODO Auto-generated method stub
        return (PhysicistDatabase) PData.get(i);
    }








}


