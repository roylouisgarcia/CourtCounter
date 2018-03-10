package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);


    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void add3Points4TeamA(View view){

        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    public void add2Points4TeamA(View view){

        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    public void add1Point4TeamA(View view){
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void add3Points4TeamB(View view){

        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    public void add2Points4TeamB(View view){

        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    public void add1Point4TeamB(View view){
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    public void resetGame(View view){
        scoreTeamB = 0;
        scoreTeamA = 0;
        displayForTeamB(scoreTeamB);
        displayForTeamA(scoreTeamA);
    }



}
