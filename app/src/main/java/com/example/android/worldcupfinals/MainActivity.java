package com.example.android.worldcupfinals;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int goalsBrazil = 0;
    int goalsGermany = 0;
    int cornersBrazil = 0;
    int foulsBrazil = 0;
    int redsBrazil = 0;
    int yellowsBrazil = 0;
    int cornersGermany = 0;
    int foulsGermany = 0;
    int redsGermany = 0;
    int yellowsGermany = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addGoalsBrazil(View view) {
        goalsBrazil = goalsBrazil + 1;
        displayForBrazil(goalsBrazil);

    }

    public void addGoalsGermany(View view) {
        goalsGermany = goalsGermany + 1;
        displayForGermany(goalsGermany);

    }

    public void addBrazilCorners(View view) {
        cornersBrazil = cornersBrazil + 1;
        displayBrazilCorners(cornersBrazil);

    }

    public void addBrazilFouls(View view) {
        foulsBrazil = foulsBrazil + 1;
        displayBrazilFouls(foulsBrazil);
    }

    public void addBrazilReds(View view) {
        redsBrazil = redsBrazil + 1;
        displayBrazilReds(redsBrazil);

    }

    public void addBrazilYellows(View view) {
        yellowsBrazil = yellowsBrazil + 1;
        displayBrazilYellows(yellowsBrazil);
    }

    public void addGermanyCorners(View view) {
        cornersGermany = cornersGermany + 1;
        displayGermanyCorners(cornersGermany);
    }

    public void addGermanyFouls(View view) {
        foulsGermany = foulsGermany + 1;
        displayGermanyFouls(foulsGermany);
    }

    public void addGermanyReds(View view) {
        redsGermany = redsGermany + 1;
        displayGermanyReds(redsGermany);
    }

    public void addGermanyYellows(View view) {
        yellowsGermany = yellowsGermany + 1;
        displayGermanyYellows(yellowsGermany);
    }

    public void resetValues(View view) {

        goalsBrazil = 0;
        goalsGermany = 0;
        cornersBrazil = 0;
        foulsBrazil = 0;
        redsBrazil = 0;
        yellowsBrazil = 0;
        cornersGermany = 0;
        foulsGermany = 0;
        redsGermany = 0;
        yellowsGermany = 0;

        displayForBrazil(goalsBrazil);
        displayForGermany(goalsGermany);
        displayBrazilCorners(cornersBrazil);
        displayBrazilFouls(foulsBrazil);
        displayBrazilReds(redsBrazil);
        displayBrazilYellows(yellowsBrazil);
        displayGermanyCorners(cornersGermany);
        displayGermanyFouls(foulsGermany);
        displayGermanyReds(redsGermany);
        displayGermanyYellows(yellowsGermany);

    }


    public void displayForBrazil(int score) {
        TextView scoreView = (TextView) findViewById(R.id.b_goals);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForGermany(int score) {
        TextView scoreView = (TextView) findViewById(R.id.g_goals);
        scoreView.setText(String.valueOf(score));
    }

    public void displayBrazilCorners(int score) {
        TextView scoreView = (TextView) findViewById(R.id.b_corners);
        scoreView.setText(String.valueOf(score));
    }

    public void displayBrazilFouls(int score) {
        TextView scoreView = (TextView) findViewById(R.id.b_fouls);
        scoreView.setText(String.valueOf(score));
    }

    public void displayBrazilReds(int score) {
        TextView scoreView = (TextView) findViewById(R.id.b_rcards);
        scoreView.setText(String.valueOf(score));
    }

    public void displayBrazilYellows(int score) {
        TextView scoreView = (TextView) findViewById(R.id.b_ycards);
        scoreView.setText(String.valueOf(score));
    }

    public void displayGermanyCorners(int score) {
        TextView scoreView = (TextView) findViewById(R.id.g_corners);
        scoreView.setText(String.valueOf(score));
    }

    public void displayGermanyFouls(int score) {
        TextView scoreView = (TextView) findViewById(R.id.g_fouls);
        scoreView.setText(String.valueOf(score));
    }

    public void displayGermanyReds(int score) {
        TextView scoreView = (TextView) findViewById(R.id.g_reds);
        scoreView.setText(String.valueOf(score));
    }

    public void displayGermanyYellows(int score) {
        TextView scoreView = (TextView) findViewById(R.id.g_yellows);
        scoreView.setText(String.valueOf(score));
    }
}
