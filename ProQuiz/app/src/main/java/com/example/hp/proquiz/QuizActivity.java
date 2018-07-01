package com.example.hp.proquiz;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    public int scorepoint = 0;
    public int finalScore;
    String correctAnswer4 = "Integrated Development Environment";
    String correctAnswer6 = "uniform Resource identifier";
    String correctAnswer8 = "hyper text transfer protocol";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
    }

    /* display a dialog and a toast showing the number of selected question which where answered correctly and
     the result when the submit button is click and also provides and option to try the quiz again or exit the app */
    public void submit(View v) {

        EditText input_name = findViewById(R.id.user_name);
        final String user_name = input_name.getText().toString();

        final RadioButton opt_a1 = findViewById(R.id.opt_a1);
        boolean tickOpta1 = opt_a1.isChecked();

        final RadioButton opt_b1 = findViewById(R.id.opt_b1);
        boolean tickOptb1 = opt_b1.isChecked();

        final RadioButton opt_c1 = findViewById(R.id.opt_c1);
        boolean tickOptc1 = opt_c1.isChecked();

        final RadioButton opt_a2 = findViewById(R.id.opt_a2);
        boolean tickOpta2 = opt_a2.isChecked();

        final RadioButton opt_b2 = findViewById(R.id.opt_b2);
        boolean tickOptb2 = opt_b2.isChecked();

        final RadioButton opt_c2 = findViewById(R.id.opt_c2);
        boolean tickOptc2 = opt_c2.isChecked();

        final CheckBox opt_a3 = findViewById(R.id.opt_a3);
        boolean tickOpta3 = opt_a3.isChecked();

        final CheckBox opt_b3 = findViewById(R.id.opt_b3);
        boolean tickOptb3 = opt_b3.isChecked();

        final CheckBox opt_c3 = findViewById(R.id.opt_c3);
        boolean tickOptc3 = opt_c3.isChecked();

        final EditText input4 = findViewById(R.id.input4);
        String userInput4 = input4.getText().toString();

        final RadioButton opt_a5 = findViewById(R.id.opt_a5);
        boolean tickOpta5 = opt_a5.isChecked();

        final RadioButton opt_b5 = findViewById(R.id.opt_b5);
        boolean tickOptb5 = opt_b5.isChecked();

        final RadioButton opt_c5 = findViewById(R.id.opt_c5);
        boolean tickOptc5 = opt_c5.isChecked();

        final EditText input6 = findViewById(R.id.input6);
        String userInput6 = input6.getText().toString();

        final RadioButton opt_a7 = findViewById(R.id.opt_a7);
        boolean tickOpta7 = opt_a7.isChecked();

        final RadioButton opt_b7 = findViewById(R.id.opt_b7);
        boolean tickOptb7 = opt_b7.isChecked();

        final RadioButton opt_c7 = findViewById(R.id.opt_c7);
        boolean tickOptc7 = opt_c7.isChecked();

        final EditText input8 = findViewById(R.id.input8);
        String userInput8 = input8.getText().toString();

        final RadioButton opt_a9 = findViewById(R.id.opt_a9);
        boolean tickOpta9 = opt_a9.isChecked();

        final RadioButton opt_b9 = findViewById(R.id.opt_b9);
        boolean tickOptb9 = opt_b9.isChecked();

        final RadioButton opt_c9 = findViewById(R.id.opt_c9);
        boolean tickOptc9 = opt_c9.isChecked();

        final RadioButton opt_a10 = findViewById(R.id.opt_a10);
        boolean tickOpta10 = opt_a10.isChecked();

        final RadioButton opt_b10 = findViewById(R.id.opt_b10);
        boolean tickOptb10 = opt_b10.isChecked();

        final int finalScore = score(tickOpta1, tickOptb1, tickOptc1,
                tickOpta2, tickOptb2, tickOptc2,
                tickOpta3, tickOptb3, tickOptc3,
                userInput4, tickOpta5, tickOptb5, tickOptc5,
                userInput6, tickOpta7, tickOptb7, tickOptc7,
                userInput8, tickOpta9, tickOptb9, tickOptc9,
                tickOpta10, tickOptb10);

        int selected = correctlySelected(tickOptc1,
                tickOpta2,
                tickOpta3, tickOptc3,
                userInput4, tickOptb5,
                userInput6, tickOptc7,
                userInput8, tickOptc9, tickOptb10);

        //Print out a toast message
        Toast.makeText(this, getString(R.string.javeTxt1)+ " \n" + user_name + " "+ getString(R.string.javaTxt2) + " "+ selected + " " + getString(R.string.javaTxt3), Toast.LENGTH_SHORT).show();

        //Send motivation message based on the finalScore
        String message;
        if (finalScore <= 3) {
            message = getString(R.string.remark)+" " + user_name + " " + getString(R.string.javaTxt4);
        } else if (finalScore <= 7) {
            message = getString(R.string.remark)+" " + user_name + " " + getString(R.string.javaTxt5);
        } else {
            message = getString(R.string.remark)+" " + user_name + " " + getString(R.string.javaTxt6);
        }

        //calling the building the alertDailog
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);

        //set Title of the alertDialog
        alertDialogBuilder.setTitle(getString(R.string.result));

        //setting activities for the dialog box
        alertDialogBuilder.setMessage(getString(R.string.javaTxt7)+ " " + finalScore + "/10\n" + message);
        alertDialogBuilder.setCancelable(false);//avoid cancelling

        //Uncheck all button and clear every editText field whenTry Again is click
        alertDialogBuilder.setNegativeButton( getString(R.string.again), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {

                opt_a1.setChecked(false);
                opt_b1.setChecked(false);
                opt_c1.setChecked(false);
                opt_a2.setChecked(false);
                opt_b2.setChecked(false);
                opt_c2.setChecked(false);
                opt_a3.setChecked(false);
                opt_b3.setChecked(false);
                opt_c3.setChecked(false);
                input4.setText(null);
                opt_a5.setChecked(false);
                opt_b5.setChecked(false);
                opt_c5.setChecked(false);
                input6.setText(null);
                opt_a7.setChecked(false);
                opt_b7.setChecked(false);
                opt_c7.setChecked(false);
                input8.setText(null);
                opt_a9.setChecked(false);
                opt_b9.setChecked(false);
                opt_c9.setChecked(false);
                opt_b10.setChecked(false);
                opt_a10.setChecked(false);

                scorepoint = 0;
                dialog.cancel();
            }
        });
        //setting exit
        alertDialogBuilder.setPositiveButton(getString(R.string.exit), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("EXIT", true);
                startActivity(intent);
            }
        });
        //creating dailog
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    //calcuating the score by the result for the radio button
    public int score(boolean tickOpta1, boolean tickOptb1, boolean tickOptc1,
                     boolean tickOpta2, boolean tickOptb2, boolean tickOptc2,
                     boolean tickOpta3, boolean tickOptb3, boolean tickOptc3, String userInput4,
                     boolean tickOpta5, boolean tickOptb5, boolean tickOptc5, String userInput6,
                     boolean tickOpta7, boolean tickOptb7, boolean tickOptc7, String userInput8,
                     boolean tickOpta9, boolean tickOptb9, boolean tickOptc9,
                     boolean tickOpta10, boolean tickOptb10) {
        if (tickOptc1) {
            scorepoint += 1;
        }
        if (tickOpta1 || tickOptb1) {
            scorepoint += 0;
        }
        if (tickOpta2) {
            scorepoint += 1;
        }
        if (tickOptb2 || tickOptc2) {
            scorepoint += 0;
        }
        if (tickOpta3 && tickOptc3) {
            scorepoint += 1;
        }
        if (tickOpta3 && tickOptc3 && tickOptb3) {
            scorepoint += 0;
        }
        if (userInput4.trim().equalsIgnoreCase(correctAnswer4)) {
            scorepoint += 1;
        }
        if (tickOptb5) {
            scorepoint += 1;
        }
        if (tickOpta5 || tickOptc5) {
            scorepoint += 0;
        }
        if (userInput6.trim().equalsIgnoreCase(correctAnswer6)) {
            scorepoint += 1;
        }
        if (tickOptc7) {
            scorepoint += 1;
        }
        if (tickOpta7 || tickOptb7) {
            scorepoint += 0;
        }
        if (userInput8.trim().equalsIgnoreCase(correctAnswer8)) {
            scorepoint += 1;
        }
        if (tickOptc9) {
            scorepoint += 1;
        }
        if (tickOpta9 || tickOptb9) {
            scorepoint += 0;
        }
        if (tickOptb10) {
            scorepoint += 1;
        }
        if (tickOpta10) {
            scorepoint += 0;
        } else {
            scorepoint += 0;
        }

        return finalScore = scorepoint;
    }

    //record selected option that are correct only
    public int correctlySelected(boolean tickOptc1,
                                 boolean tickOpta2,
                                 boolean tickOpta3, boolean tickOptc3, String userInput4,
                                 boolean tickOptb5, String userInput6,
                                 boolean tickOptc7, String userInput8,
                                 boolean tickOptc9, boolean tickOptb10) {
        int answeredRight = 0;

        if (tickOptc1) {
            answeredRight += 1;
        }
        if (tickOpta2) {
            answeredRight += 1;
        }
        if (tickOpta3 && tickOptc3) {
            answeredRight += 1;
        }
        if (userInput4.trim().equalsIgnoreCase(correctAnswer4)) {
            answeredRight += 1;
        }
        if (tickOptb5) {
            answeredRight += 1;
        }
        if (userInput6.trim().equalsIgnoreCase(correctAnswer6)) {
            answeredRight += 1;
        }
        if (tickOptc7) {
            answeredRight += 1;
        }
        if (userInput8.trim().equalsIgnoreCase(correctAnswer8)) {
            answeredRight += 1;
        }
        if (tickOptc9) {
            answeredRight += 1;
        }
        if (tickOptb10) {
            answeredRight += 1;
        }

        return answeredRight;
    }
}