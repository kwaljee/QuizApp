package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int numAnswersCorrect = 0;
    int totalQuestions = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //This method checks all answers, disables submit button, and displays the result of the quiz on the click of the submit button
    public void onSubmit(View v) {
        Button submitBtn = (Button) findViewById(R.id.submit);
        submitBtn.setEnabled(false);
        checkAnswer1();
        checkAnswer2();
        checkAnswer3();
        checkAnswer4();
        checkAnswer5();
        displayResults();
    }

    //This method gets text inputted by user and compare to see if it matches correct answer
    public void checkAnswer1() {
        EditText question1 = (EditText) findViewById(R.id.editTxtQuestion1);
        String userAnswer = (question1.getText().toString());
        String actualAnswer = getString(R.string.answer1);
        TextView displayCorrectStatus = (TextView) findViewById(R.id.correct_answer1);
        TextView displayIncorrectStatus = (TextView) findViewById(R.id.incorrect_answer1);
        String message = displayIncorrectStatus.getText().toString();

        if (userAnswer.trim().equalsIgnoreCase(actualAnswer)) {
            numAnswersCorrect = numAnswersCorrect + 1;
            displayCorrectStatus.setVisibility(View.VISIBLE);
        } else {
            displayIncorrectStatus.setText(message + " " + "ANSWER: " + actualAnswer);
            displayIncorrectStatus.setVisibility(View.VISIBLE);
        }
    }

    //This method checks to see if the correct radio button is clicked that matches with the appropriate answer
    public void checkAnswer2() {
        RadioButton question2 = (RadioButton) findViewById(R.id.radioBtnQuestion2D);
        String actualAnswer = question2.getText().toString();
        TextView displayCorrectStatus = (TextView) findViewById(R.id.correct_answer2);
        TextView displayIncorrectStatus = (TextView) findViewById(R.id.incorrect_answer2);
        String message = displayIncorrectStatus.getText().toString();

        if (question2.isChecked()) {
            numAnswersCorrect = numAnswersCorrect + 1;
            displayCorrectStatus.setVisibility(View.VISIBLE);
        } else {
            displayIncorrectStatus.setText(message + " " + "ANSWER: " + actualAnswer);
            displayIncorrectStatus.setVisibility(View.VISIBLE);
        }
    }

    //This method checks to see if the correct boxes are clicked that matches with the appropriate answer
    public void checkAnswer3() {
        CheckBox question3Option1 = (CheckBox) findViewById(R.id.checkBtnQuestion3A);
        CheckBox question3Option3 = (CheckBox) findViewById(R.id.checkBtnQuestion3C);
        String actualAnswer1 = question3Option1.getText().toString();
        String actualAnswer2 = question3Option3.getText().toString();
        TextView displayCorrectStatus = (TextView) findViewById(R.id.correct_answer3);
        TextView displayIncorrectStatus = (TextView) findViewById(R.id.incorrect_answer3);
        String message = displayIncorrectStatus.getText().toString();

        if (question3Option1.isChecked() && question3Option3.isChecked()) {
            numAnswersCorrect = numAnswersCorrect + 1;
            displayCorrectStatus.setVisibility(View.VISIBLE);
        } else {
            displayIncorrectStatus.setText(message + " " + "ANSWER: " + actualAnswer1 + " & " + actualAnswer2);
            displayIncorrectStatus.setVisibility(View.VISIBLE);
        }
    }

    //This method gets text inputted by user and compare to see if it matches correct answer
    public void checkAnswer4() {
        EditText question4 = (EditText) findViewById(R.id.editTxtQuestion4);
        String userAnswer = (question4.getText().toString());
        String actualAnswer = getString(R.string.answer4);
        TextView displayCorrectStatus = (TextView) findViewById(R.id.correct_answer4);
        TextView displayIncorrectStatus = (TextView) findViewById(R.id.incorrect_answer4);
        String message = displayIncorrectStatus.getText().toString();

        if (userAnswer.trim().equalsIgnoreCase(actualAnswer)) {
            numAnswersCorrect = numAnswersCorrect + 1;
            displayCorrectStatus.setVisibility(View.VISIBLE);
        } else {
            displayIncorrectStatus.setText(message + " " + "ANSWER: " + actualAnswer);
            displayIncorrectStatus.setVisibility(View.VISIBLE);
        }
    }

    //This method checks to see if the correct radio button is clicked that matches with the appropriate answer
    public void checkAnswer5() {
        RadioButton question5 = (RadioButton) findViewById(R.id.radioBtnQuestion5C);
        String actualAnswer = question5.getText().toString();
        TextView displayCorrectStatus = (TextView) findViewById(R.id.correct_answer5);
        TextView displayIncorrectStatus = (TextView) findViewById(R.id.incorrect_answer5);
        String message = displayIncorrectStatus.getText().toString();

        if (question5.isChecked()) {
            numAnswersCorrect = numAnswersCorrect + 1;
            displayCorrectStatus.setVisibility(View.VISIBLE);
        } else {
            displayIncorrectStatus.setText(message + " " + "ANSWER: " + actualAnswer);
            displayIncorrectStatus.setVisibility(View.VISIBLE);
        }
    }

    //This method displays the final score results to the user in a toast message
    public void displayResults() {
        String results = "Your total score is " + numAnswersCorrect + " out of " + totalQuestions;
        Toast.makeText(MainActivity.this, results, Toast.LENGTH_LONG).show();
    }
}
