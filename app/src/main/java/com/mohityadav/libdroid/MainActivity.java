package com.mohityadav.libdroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import mohityadav.com.hellolib.LatlonDistance;
import mohityadav.com.hellolib.Point;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Point buenosAiresObeliscoPoint =
                new Point((float) -34.6037389, (float) -58.3815704);

        Point nycStatueOfLibertyPoint =
                new Point((float) 40.6892494, (float) -74.0445004);

        float distanceBetweenPoints = LatlonDistance.calculateDistance(
                buenosAiresObeliscoPoint,
                nycStatueOfLibertyPoint);

        TextView kilometersLabel = (TextView) findViewById(R.id.kilometers_label);

        kilometersLabel.setText("Between the Obelisco and the Statue of Liberty there are: \n" + distanceBetweenPoints + "KM");
    }

}

