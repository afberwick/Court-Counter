/*Aileen Berwick
 *Score Keeper app: Lesson 9
 *March, 20, 2018
 *Grow With Google Challenge Scholarship: Android Basics
 */
/*
 * This activity keeps track of the tennis score for 2 players.
 */

package com.example.android.courtcounter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    // Tracks the score for Player A
    int addPointsA = 0;

    // Tracks the score for Player B
    int addPointsB = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * Increase the score for Player A by 15 points for winning game 1.
     */
    public void oneForPlayerA(View v) {
        addPointsA = addPointsA + 15;
        displayForPlayerA(addPointsA);
    }

    /**
     * Increase the score for Player A by 30 points for winning game 2.
     */
    public void twoForPlayerA(View v) {
        addPointsA = addPointsA + 30;
        displayForPlayerA(addPointsA);
    }

    /**
     * Increase the score for Player A by 40 points for winning game 3.
     */
    public void threeForPlayerA(View v) {
        addPointsA = addPointsA + 40;
        displayForPlayerA(addPointsA);
    }

    /**
     * Increase the score for Player A by 1 points for game point and game win
     */
    public void winForPlayerA(View v) {
        addPointsA = addPointsA + 1;
        displayForPlayerA(addPointsA);
    }


    /**
     * Increase the score for Player B by 15 points for winning game.
     */
    public void oneForPlayerB(View v) {
        addPointsB = addPointsB + 15;
        displayForPlayerB(addPointsB);
    }

    /**
     * Increase the score for Player B by 30 points for winning game.
     */

    public void twoForPlayerB(View v) {
        addPointsB = addPointsB + 30;
        displayForPlayerB(addPointsB);
    }

    /**
     * Increase the score for Player B by 40 points for winning game.
     */
    public void threeForPlayerB(View v) {
        addPointsB = addPointsB + 40;
        displayForPlayerB(addPointsB);
    }

    /**
     * Increase the score for Player B by 1 points for game point and game win
     */
    public void winForPlayerB(View v) {
        addPointsB = addPointsB + 1;
        displayForPlayerB(addPointsB);
    }

    public void resetScore(View v) {
        addPointsA = 0;
        addPointsB = 0;
        displayForPlayerA(addPointsA);
        displayForPlayerB(addPointsB);
    }


    /**
     * Displays the given score for Player A.
     */
    public void displayForPlayerA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Player B.
     */
    public void displayForPlayerB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


}