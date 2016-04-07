package com.example.radhi.myapplication1;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Radhi on 4/7/2016.
 */
public class MeteorologistDatabase {
    private static Collection MeteorologistDatabase;
    public static ArrayList MData = new ArrayList(MeteorologistDatabase);

    String sun;
    String temp;
    String precip;

    public MeteorologistDatabase(String sun, String temp, String precip){
        this.sun = sun;
        this.temp = temp;
        this.precip = precip;

        MeteorologistDatabase BallLightning = new MeteorologistDatabase("n/a","n/a","thunderstorms");
        MeteorologistDatabase Clouds = new MeteorologistDatabase("n/a","n/a","source");
        MeteorologistDatabase DiamondDust = new MeteorologistDatabase("n/a","cold","no");
        MeteorologistDatabase DustDevil = new MeteorologistDatabase("n/a","n/a","no");
        MeteorologistDatabase DustStorm = new MeteorologistDatabase("n/a","hot","no");
        MeteorologistDatabase Hail = new MeteorologistDatabase("n/a","cold","yes");
        MeteorologistDatabase Halo = new MeteorologistDatabase("yes","n/a","no");
        MeteorologistDatabase KevinHelmholtzInstability = new MeteorologistDatabase("n/a","n/a","no");
        MeteorologistDatabase LightPillar = new MeteorologistDatabase("yes","n/a","np");
        MeteorologistDatabase Lightning = new MeteorologistDatabase("n/a","n/a","thunderstorms");
        MeteorologistDatabase MorningGloryCloud = new MeteorologistDatabase("n/a","n/a","source");
        MeteorologistDatabase NovayaZemiyaEffect = new MeteorologistDatabase("yes","n/a","no");
        MeteorologistDatabase Rain = new MeteorologistDatabase("n/a","n/a","yes");
        MeteorologistDatabase RainAndSnow = new MeteorologistDatabase("n/a","n/a","yes");
        MeteorologistDatabase Rainbow = new MeteorologistDatabase("yes","n/a","yes");
        MeteorologistDatabase IcePellets = new MeteorologistDatabase("yes","n/a","yes");
        MeteorologistDatabase StElmosFire = new MeteorologistDatabase("n/a","n/a","thunderstorms");
        MeteorologistDatabase SunShower = new MeteorologistDatabase("yes","n/a","yes");
        MeteorologistDatabase Supercell = new MeteorologistDatabase("n/a","n/a","source");
        MeteorologistDatabase Thunderstorm = new MeteorologistDatabase("n/a","n/a","source");
        MeteorologistDatabase Tornado = new MeteorologistDatabase("n/a","n/a","no");
        MeteorologistDatabase BrockenSpectre = new MeteorologistDatabase("yes","n/a","n/a");

        MData.add(0,BallLightning);
        MData.add(1,Clouds);
        MData.add(2,DiamondDust);
        MData.add(3,DustDevil);
        MData.add(4,DustStorm);
        MData.add(5,Hail);
        MData.add(6,Halo);
        MData.add(7,KevinHelmholtzInstability);
        MData.add(8,LightPillar);
        MData.add(9,Lightning);
        MData.add(10,MorningGloryCloud);
        MData.add(11,NovayaZemiyaEffect);
        MData.add(12,Rain);
        MData.add(13,RainAndSnow);
        MData.add(14,Rainbow);
        MData.add(15,IcePellets);
        MData.add(16,StElmosFire);
        MData.add(17,SunShower);
        MData.add(18,Supercell);
        MData.add(19,Thunderstorm);
        MData.add(20,Tornado);
        MData.add(21,BrockenSpectre);


    }

    public static String getSun(MeteorologistDatabase m){
        return m.sun;
    }

    public static String getTemp(MeteorologistDatabase m){
        return m.temp;
    }

    public static String getPrecip(MeteorologistDatabase m){
        return m.precip;
    }


    public static MeteorologistDatabase getInfo(int i){
        return (MeteorologistDatabase)MData.get(i);
    }
}
