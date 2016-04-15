package com.example.root.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(int score)
    {
        TextView scoreTeamA = (TextView) findViewById(R.id.scoreTeamA);
        scoreTeamA.setText(String.valueOf(score));
    }

    public void teamA3Points(View view)
    {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    public void teamA2Points(View view)
    {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    public void teamAFreeThrow(View view)
    {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }
}
