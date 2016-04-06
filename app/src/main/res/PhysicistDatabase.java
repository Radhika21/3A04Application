import android.graphics.drawable.shapes.Shape;

import java.util.ArrayList;

/**
 * Created by Radhi on 4/1/2016.
 */
public class PhysicistDatabase {

    ArrayList PData = new ArrayList(PhysicistDatabase);
    Shape shape;
    Color color;
    Opacity opacity;
    Size size;
    Elevation elevation;
    Brightness brightness;

    public PhysicistDatabase(Shape shape, Color color, Opacity opacity, Size size, Elevation elevation, Brightness brightness){
        this.shape = shape;
        this.color = color;
        this.opacity = opacity;

        this.size = size;
        this.elevation = elevation;
        this.brightness = brightness;
    }


    public PhysicistDatabase()

    private enum Shape{
        arc, cloud, funnel, circular, spherical, oval
    }

    private enum Color{
        rainbow, red, blue, yellow, white, notApplicable, green
    }

    private enum Opacity{
        transparent, opaque, translucent
    }

    private enum Size{
        large, medium, small
    }

    private enum Elevation{
        horizon, mountain, sky, ground
    }

    private enum Brightness{
        bright, dull
    }

    PhysicistDatabase Glory = new PhysicistDatabase(Shape.circular,Color.rainbow,Opacity.translucent, Size.large, Elevation.sky, Brightness.bright);
    PhysicistDatabase GreenFlash = new PhysicistDatabase(Shape.oval,Color.green,Opacity.translucent, Size.large, Elevation.sky, Brightness.bright);
    PhysicistDatabase Halo = new PhysicistDatabase(Shape.circular,Color.whitew,Opacity.translucent, Size.large, Elevation.sky, Brightness.bright);
    PhysicistDatabase Heilligenschein = new PhysicistDatabase(Shape.circular,Color.white,Opacity.translucent, Size.small, Elevation.ground, Brightness.bright);
    PData[0] = Glory;
    PData[1] = GreenFlash;
    PData[2] = Halo;
    PData[3] = Heilligenschein;


}
