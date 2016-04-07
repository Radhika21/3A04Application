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
    String size;
    String elevation;
    String brightness;

    public PhysicistDatabase(String shape, String color, String opacity, String size, String elevation, String brightness){
        this.shape = shape;
        this.color = color;
        this.opacity = opacity;
        this.size = size;
        this.elevation = elevation;
        this.brightness = brightness;
        PhysicistDatabase Glory = new PhysicistDatabase("circular","rainbow","translucent", "large", "sky", "bright");
        PhysicistDatabase GreenFlash = new PhysicistDatabase("oval","green","translucent", "large", "sky", "bright");
        PhysicistDatabase Halo = new PhysicistDatabase("circular","white","translucent", "large", "sky", "bright");
        PhysicistDatabase Heilligenschein = new PhysicistDatabase("circular","white","translucent", "small", "ground", "bright");
        PData.add(0,Glory);
        PData.add(1, GreenFlash);
        PData.add(2, Halo);
        PData.add(3, Heilligenschein);;

    }

    public static String getColor(PhysicistDatabase a){
        return a.color;
    }

    public static String getOpacity(PhysicistDatabase a){
        return a.opacity;
    }

    public static String getSize(PhysicistDatabase a){
        return a.size;
    }

    public static String getElevation(PhysicistDatabase a){
        return a.elevation;
    }

    public static String getBrightness(PhysicistDatabase a){
        return a.brightness;
    }

    public static String getShape(PhysicistDatabase a) {
        return a.shape;
    }

    public static PhysicistDatabase getInfo(int i) {
        // TODO Auto-generated method stub
        return (PhysicistDatabase) PData.get(i);
    }
}


