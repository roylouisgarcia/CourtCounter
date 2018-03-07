package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);


    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void add3Points4TeamA(View view){

        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    public void add2Points4TeamA(View view){

        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);displayForTeamA(scoreTeamA);
    }

    public void add1Point4TeamA(View view){
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    public void resetTeamA(View view){
        scoreTeamA = 0;
        displayForTeamA(scoreTeamA);
    }



}
