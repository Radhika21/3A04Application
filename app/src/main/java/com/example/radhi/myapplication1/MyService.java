package com.example.radhi.myapplication1;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.example.radhi.myapplication1.PhysicistController;

import java.util.ArrayList;

public class MyService extends Service{
    int x;
    String[] a = new String[x];


    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

   /* public String[] MakeStrArray(){
        com.example.radhi.myapplication1.PhysicistController.creatingExpert();
        x = com.example.radhi.myapplication1.PhysicistController.ColorOptions.size();
       String[] b = (String[]) com.example.radhi.myapplication1.PhysicistController.ColorOptions.toArray();

        return b;
    }*/

    public void onCreate(){
        com.example.radhi.myapplication1.PhysicistController.creatingExpert();
        x = com.example.radhi.myapplication1.PhysicistController.ColorOptions.size();
        a = (String[]) com.example.radhi.myapplication1.PhysicistController.ColorOptions.toArray();
    }

}
