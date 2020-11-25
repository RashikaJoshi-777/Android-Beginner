package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

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
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the +3 points button is clicked for team A.
     */
    public void threePointsA(View view) {
        scoreTeamA += 3 ;
        displayForTeamA( scoreTeamA ) ;
    }

    /**
     * This method is called when the +2 points button is clicked for team A.
     */
    public void twoPointsA(View view) {
        scoreTeamA += 2 ;
        displayForTeamA( scoreTeamA ) ;
    }

    /**
     * This method is called when the free throw button is clicked for team A.
     */
    public void onePointA(View view) {
        scoreTeamA += 1 ;
        displayForTeamA( scoreTeamA ) ;
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the +3 points button is clicked for team B.
     */
    public void threePointsB(View view) {
        scoreTeamB += 3 ;
        displayForTeamB( scoreTeamB ) ;
    }

    /**
     * This method is called when the +2 points button is clicked for team B.
     */
    public void twoPointsB(View view) {
        scoreTeamB += 2 ;
        displayForTeamB( scoreTeamB ) ;
    }

    /**
     * This method is called when the free throw button is clicked for team B.
     */
    public void onePointB(View view) {
        scoreTeamB += 1 ;
        displayForTeamB( scoreTeamB ) ;
    }

    /**
     * This method is called when the reset button is clicked .
     */
    public void restall(View view) {
       scoreTeamA=0;
       scoreTeamB=0;
       displayForTeamA(scoreTeamA);
       displayForTeamB( scoreTeamB ) ;
    }

}