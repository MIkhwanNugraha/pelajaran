package android.example.com.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int faultTeamA = 0;
    int faultTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Football Score");
    }

    public void oneForA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayScoreForTeamA(scoreTeamA);
    }

    public void faultForA(View view) {
        faultTeamA = faultTeamA + 1;
        displayFaultForTeamA(faultTeamA);
    }

    public void oneForB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayScoreForTeamB(scoreTeamB);
    }

    public void faultForB(View view) {
        faultTeamB = faultTeamB + 1;
        displayFaultForTeamB(faultTeamB);
    }

    public void putZero(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        faultTeamA = 0;
        faultTeamB = 0;
        displayScoreForTeamA(scoreTeamA);
        displayScoreForTeamB(scoreTeamB);
        displayFaultForTeamA(faultTeamA);
        displayFaultForTeamB(faultTeamB);
    }

    public void displayScoreForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFaultForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_fault);
        scoreView.setText(String.valueOf(score));
    }

    public void displayScoreForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFaultForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_fault);
        scoreView.setText(String.valueOf(score));
    }
}
