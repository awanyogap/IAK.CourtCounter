package com.example.root.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

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
        displayForTeamA(3);
    }

    public void teamA2Points(View view)
    {
        displayForTeamA(2);
    }

    public void teamAFreeThrow(View view)
    {
        displayForTeamA(1);
    }
}
