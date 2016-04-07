package com.example.radhi.myapplication1;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Radhi on 4/7/2016.
 */
public class FieldExpertDatabase {

    private static Collection FieldExpertDatabase;
    public static ArrayList FData = new ArrayList(FieldExpertDatabase);
    String density;
    String moistness;

    public FieldExpertDatabase (String density, String moistness) {
        this.density = density;
        this.moistness = moistness;

        FieldExpertDatabase BallLightning = new FieldExpertDatabase("n/a", "no");
        FieldExpertDatabase Clouds = new FieldExpertDatabase("gas", "yes");
        FieldExpertDatabase DiamondDust = new FieldExpertDatabase("gas", "no");
        FieldExpertDatabase DustDevil = new FieldExpertDatabase("n/a", "no");
        FieldExpertDatabase DustStorm = new FieldExpertDatabase("n/a", "no");
        FieldExpertDatabase Hail = new FieldExpertDatabase("solid", "yes");
        FieldExpertDatabase Halo = new FieldExpertDatabase("n/a", "no");
        FieldExpertDatabase KevinHelmholtz = new FieldExpertDatabase("n/a", "no");
        FieldExpertDatabase LightPillar = new FieldExpertDatabase("n/a", "no");
        FieldExpertDatabase Lightning = new FieldExpertDatabase("n/a", "no");
        FieldExpertDatabase MorningGloryCloud = new FieldExpertDatabase("gas", "yes");
        FieldExpertDatabase NovayaZemiyaEffect = new FieldExpertDatabase("n/a", "no");
        FieldExpertDatabase Rain = new FieldExpertDatabase("liquid", "yes");
        FieldExpertDatabase RainAndSnowMix = new FieldExpertDatabase("liquid", "yes");
        FieldExpertDatabase Rainbow = new FieldExpertDatabase("n/a", "yes");
        FieldExpertDatabase IcePellets = new FieldExpertDatabase("solid", "no");
        FieldExpertDatabase StElmosFire = new FieldExpertDatabase("n/a", "no");
        FieldExpertDatabase SunShower = new FieldExpertDatabase("liquid", "yes");
        FieldExpertDatabase Supercell = new FieldExpertDatabase("gas", "no");
        FieldExpertDatabase Thunderstorm = new FieldExpertDatabase("gas", "no");
        FieldExpertDatabase Tornado = new FieldExpertDatabase("n/a", "no");
        FieldExpertDatabase BrokenSpectre = new FieldExpertDatabase("n/a", "yes");

        FData.add(BallLightning);
        FData.add(Clouds);
        FData.add(DiamondDust);
        FData.add(DustDevil);
        FData.add(DustDevil);
        FData.add(DustStorm);
        FData.add(Hail);
        FData.add(Halo);
        FData.add(KevinHelmholtz);
        FData.add(LightPillar);
        FData.add(Lightning);
        FData.add(MorningGloryCloud);
        FData.add(NovayaZemiyaEffect);
        FData.add(Rain);
        FData.add(RainAndSnowMix);
        FData.add(Rainbow);
        FData.add(IcePellets);
        FData.add(StElmosFire);
        FData.add(SunShower);
        FData.add(Supercell);
        FData.add(Thunderstorm);
        FData.add(Tornado);
        FData.add(BrokenSpectre);
    }

    public static String getDensity(FieldExpertDatabase a) {
        return a.density;
    }
    public static String getMoistness(FieldExpertDatabase a) {
        return a.moistness;
    }

    public static FieldExpertDatabase getInfo(int i){
        return (FieldExpertDatabase)FData.get(i);
    }
}
