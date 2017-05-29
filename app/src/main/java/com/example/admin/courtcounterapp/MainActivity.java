package com.example.admin.courtcounterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.R.string.no;

public class MainActivity extends AppCompatActivity {
 int scoreTeamA=0;
    int scoreTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void displayForTeamA (int score)
    {
        TextView scoreView =(TextView) findViewById(R.id.tean_a_score);
        scoreView.setText(String.valueOf(score));

    }


         public void plusOneTeamA(View v )
             {

                scoreTeamA=scoreTeamA+1;
                 displayForTeamA(scoreTeamA);
            }

          public void plusTwoTeamA(View v)

              {
                  scoreTeamA=scoreTeamA+2;
                      displayForTeamA( scoreTeamA) ;
             }
        public void AddThreeTeamA(View v)

              {
                  scoreTeamA=scoreTeamA+3;
                  displayForTeamA(scoreTeamA);
              }


    public void displayForTeamB (int score)
    {
        TextView scoreView =(TextView) findViewById(R.id.tean_b_score);
        scoreView.setText(String.valueOf(score));

    }

    public void plusOneTeamB(View v )
    {

        scoreTeamB= scoreTeamB+1;
        displayForTeamB( scoreTeamB);
    }

    public void plusTwoTeamB(View v)

    {
        scoreTeamB= scoreTeamB+2;
        displayForTeamB(  scoreTeamB) ;
    }
    public void AddThreeTeamB(View v)

    {
        scoreTeamB= scoreTeamB+3;
        displayForTeamB( scoreTeamB);
    }

    public void resetScore( View v)
    {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(0);
        displayForTeamB(0);
    }






}
