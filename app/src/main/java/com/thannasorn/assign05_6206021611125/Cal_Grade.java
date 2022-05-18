//6206021611125 น.ส.ธรรณศร เมตตา

package com.thannasorn.assign05_6206021611125;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cal_Grade extends AppCompatActivity implements View.OnClickListener {

    private Button Gradebtn, Backbtn;
    private EditText ScoreText;
    private TextView total, Grade;

    float Score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal_grade);

        Gradebtn = (Button) findViewById(R.id.calGrade);
        Gradebtn.setOnClickListener(this);
        Backbtn = (Button) findViewById(R.id.btnBack);
        Backbtn.setOnClickListener(this);

        ScoreText = (EditText) findViewById(R.id.Score);
        total = (TextView) findViewById(R.id.yourScore);
        Grade = (TextView) findViewById(R.id.yourGrade);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.calGrade) {
            Score = Float.parseFloat(ScoreText.getText().toString());

            String grade;
            if (Score >= 80) {
                grade = "A";
            } else if (Score >= 75) {
                grade = "B+";
            } else if (Score >= 70) {
                grade = "B";
            } else if (Score >= 65) {
                grade = "C+";
            } else if (Score >= 60) {
                grade = "C";
            } else if (Score >= 55) {
                grade = "D+";
            } else if (Score >= 50) {
                grade = "D";
            } else grade = "F";

            total.setText(Score + "");
            Grade.setText(grade + "");

        } else if (id == R.id.btnBack) {
            finish();
        }
    }
}



