package sur.cas.edu.score_keeper_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int manCGoal = 0;
    int manCFoul = 0;
    int liverpoolGoal = 0;
    int liverpoolFoul = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //testing if score display works properly
        //displayFoulForManC(5);
    }


    /**
     * Displays the goal score for  ManCity.
     */
    public void displayGoalForManC(int score) {
        TextView scoreView = (TextView) findViewById(R.id.ManCGoal);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays the foul score for  ManCity.
     */
    public void displayFoulForManC(int foul) {
        TextView scoreView = (TextView) findViewById(R.id.ManCFoul);
        scoreView.setText(String.valueOf(foul));
    }


    /**
     * Displays the goal score for  Liverpool.
     */
    public void displayGoalForLiverpool(int score) {
        TextView scoreView = (TextView) findViewById(R.id.LiverpoolGoal);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays the foul score for  Liverpool.
     */
    public void displayFoulForLiverpool(int foul) {
        TextView scoreView = (TextView) findViewById(R.id.LiverpoolFoul);
        scoreView.setText(String.valueOf(foul));
    }


    /**
     * Adds goal score by 1 for  ManCity.
     */
    public void addScoreForMancity(View view) {
        manCGoal = manCGoal + 1;
        displayGoalForManC(manCGoal);
    }


    /**
     * Adds foul score by 1 for  ManCity.
     */
    public void addFoulForMancity(View view) {
        manCFoul = manCFoul + 1;
        displayFoulForManC(manCFoul);
    }


    /**
     * Adds goal score by 1 for  Liverpool.
     */
    public void addScoreForLiverpool(View view) {
        liverpoolGoal = liverpoolGoal + 1;
        displayGoalForLiverpool(liverpoolGoal);
    }


    /**
     * Adds foul score by 1 for  Liverpool.
     */
    public void addFoulForLiverpool(View view) {
        liverpoolFoul = liverpoolFoul + 1;
        displayFoulForLiverpool(liverpoolFoul);
    }


    /**
     * Resetting all scores back to zero for both teams
     */
    public void resetScore(View view) {
        manCGoal = 0;
        manCFoul = 0;
        liverpoolGoal = 0;
        liverpoolFoul = 0;

        //resetting manchester city scores
        displayGoalForManC(manCGoal);
        displayFoulForManC(manCFoul);

        //resetting liverpool scores
        displayGoalForLiverpool(liverpoolGoal);
        displayFoulForLiverpool(liverpoolFoul);

    }
}
