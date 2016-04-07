package com.example.radhi.myapplication1;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Radhi on 4/7/2016.
 */
public class GoogleMapsDatabase {
    private static Collection GoogleMapsDatabase;
    public static ArrayList GMData = new ArrayList(GoogleMapsDatabase);
    String minLong;
    String maxLong;
    String minLat;
    String maxLat;

    public GoogleMapsDatabase (String minLong, String maxLong, String minLat, String maxLat) {
        this.minLong = minLong;
        this.maxLong = maxLong;
        this.minLat = minLat;
        this.maxLat = maxLat;
        GoogleMapsDatabase BallLightning = new GoogleMapsDatabase("n/a", "n/a", "n/a", "n/a");
        GoogleMapsDatabase Clouds = new GoogleMapsDatabase("n/a", "n/a", "n/a", "n/a");
        GoogleMapsDatabase DiamondDust = new GoogleMapsDatabase("n/a", "n/a", "n/a", "n/a");
        GoogleMapsDatabase DustDevil = new GoogleMapsDatabase("n/a", "n/a", "n/a", "n/a");
        GoogleMapsDatabase DustStorm = new GoogleMapsDatabase("n/a", "n/a", "n/a", "n/a");
        GoogleMapsDatabase Hail = new GoogleMapsDatabase("n/a", "n/a", "n/a", "n/a");
        GoogleMapsDatabase Halo = new GoogleMapsDatabase("n/a", "n/a", "n/a", "n/a");
        GoogleMapsDatabase KevinHelmholtz = new GoogleMapsDatabase("n/a", "n/a", "n/a", "n/a");
        GoogleMapsDatabase LightPillar = new GoogleMapsDatabase("n/a", "n/a", "n/a", "n/a");
        GoogleMapsDatabase Lightning = new GoogleMapsDatabase("n/a", "n/a", "n/a", "n/a");
        GoogleMapsDatabase MorningGloryCloud = new GoogleMapsDatabase("139", "139", "-14", "-14");
        GoogleMapsDatabase NovayaZemiyaEffect = new GoogleMapsDatabase("n/a", "n/a", "66.5", "90");
        GoogleMapsDatabase Rain = new GoogleMapsDatabase("n/a", "n/a", "n/a", "n/a");
        GoogleMapsDatabase RainAndSnowMix = new GoogleMapsDatabase("n/a", "n/a", "n/a", "n/a");
        GoogleMapsDatabase Rainbow = new GoogleMapsDatabase("n/a", "n/a", "n/a", "n/a");
        GoogleMapsDatabase IcePellets = new GoogleMapsDatabase("n/a", "n/a", "n/a", "n/a");
        GoogleMapsDatabase StElmosFire = new GoogleMapsDatabase("n/a", "n/a", "n/a", "n/a");
        GoogleMapsDatabase SunShower = new GoogleMapsDatabase("n/a", "n/a", "n/a", "n/a");
        GoogleMapsDatabase Supercell = new GoogleMapsDatabase("-110", "-90", "30", "60");
        GoogleMapsDatabase Thunderstorm = new GoogleMapsDatabase("n/a", "n/a", "n/a", "n/a");
        GoogleMapsDatabase Tornado = new GoogleMapsDatabase("n/a", "n/a", "-90", "-60");
        GoogleMapsDatabase BrokenSpectre = new GoogleMapsDatabase("5", "15", "47", "54");
        GMData.add(BallLightning);
        GMData.add(Clouds);
        GMData.add(DiamondDust);
        GMData.add(DustDevil);
        GMData.add(DustStorm);
        GMData.add(Hail);
        GMData.add(Halo);
        GMData.add(KevinHelmholtz);
        GMData.add(LightPillar);
        GMData.add(Lightning);
        GMData.add(MorningGloryCloud);
        GMData.add(NovayaZemiyaEffect);
        GMData.add(Rain);
        GMData.add(RainAndSnowMix);
        GMData.add(Rainbow);
        GMData.add(IcePellets);
        GMData.add(StElmosFire);
        GMData.add(SunShower);
        GMData.add(Supercell);
        GMData.add(Thunderstorm);
        GMData.add(Tornado);
        GMData.add(BrokenSpectre);




    }
    public static String getminLong (GoogleMapsDatabase a) {
        return a.minLong;
    }

    public static String getMaxLong(GoogleMapsDatabase a) {
        return a.maxLong;
    }

    public static String getMinLat(GoogleMapsDatabase a) {
        return a.minLat;
    }

    public static String getMaxLat(GoogleMapsDatabase a) {
        return a.maxLat;
    }
}
