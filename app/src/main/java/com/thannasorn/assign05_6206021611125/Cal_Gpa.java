//6206021611125 น.ส.ธรรณศร เมตตา

package com.thannasorn.assign05_6206021611125;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Cal_Gpa extends AppCompatActivity implements View.OnClickListener {
    private Button Gpacal, Backbtn;
    private EditText grade1, grade2, grade3, grade4;
    private TextView yourP, yourC, yourG;

    String Edit1, Edit2, Edit3, Edit4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal_gpa);

        Gpacal = (Button) findViewById(R.id.calGpa);
        Gpacal.setOnClickListener(this);
        Backbtn = (Button) findViewById(R.id.btnback);
        Backbtn.setOnClickListener(this);

        grade1 = (EditText) findViewById(R.id.grade1);
        grade2 = (EditText) findViewById(R.id.grade2);
        grade3 = (EditText) findViewById(R.id.grade3);
        grade4 = (EditText) findViewById(R.id.grade4);
        yourP = (TextView) findViewById(R.id.yourPoint);
        yourC = (TextView) findViewById(R.id.yourCredit);
        yourG = (TextView) findViewById(R.id.yourGpa);
    }

    @Override
    public void onClick(View view) {
         Edit1 = grade1.getText().toString();
         Edit2 = grade2.getText().toString();
         Edit3 = grade3.getText().toString();
         Edit4 = grade4.getText().toString();

        int id = view.getId();
        if (id == R.id.calGpa) {
            if (id == R.id.calGpa) ;
            Double credit = 3.0;
            Double grade1 = 0.0, grade2 = 0.0, grade3 = 0.0, grade4 = 0.0;
            DecimalFormat df = new DecimalFormat();
            df.applyPattern("0.00");

            if (Edit1.equals("A")) {
                grade1 = 4.0;
            } else if (Edit1.equals("B+")) {
                grade1 = 3.5;
            } else if (Edit1.equals("B")) {
                grade1 = 3.0;
            } else if (Edit1.equals("C+")) {
                grade1 = 2.5;
            } else if (Edit1.equals("C")) {
                grade1 = 2.0;
            } else if (Edit1.equals("D+")) {
                grade1 = 1.5;
            } else if (Edit1.equals("D")) {
                grade1 = 1.0;
            } else if (Edit1.equals("F")) {
                grade1 = 0.0;
            }

            if (Edit2.equals("A")) {
                grade2 = 4.0;
            } else if (Edit2.equals("B+")) {
                grade2 = 3.5;
            } else if (Edit2.equals("B")) {
                grade2 = 3.0;
            } else if (Edit2.equals("C+")) {
                grade2 = 2.5;
            } else if (Edit2.equals("C")) {
                grade2 = 2.0;
            } else if (Edit2.equals("D+")) {
                grade2 = 1.5;
            } else if (Edit2.equals("D")) {
                grade2 = 1.0;
            } else if (Edit2.equals("F")) {
                grade2 = 0.0;
            }

            if (Edit3.equals("A")) {
                grade3 = 4.0;
            } else if (Edit3.equals("B+")) {
                grade3 = 3.5;
            } else if (Edit3.equals("B")) {
                grade3 = 3.0;
            } else if (Edit3.equals("C+")) {
                grade3 = 2.5;
            } else if (Edit3.equals("C")) {
                grade3 = 2.0;
            } else if (Edit3.equals("D+")) {
                grade3 = 1.5;
            } else if (Edit3.equals("D")) {
                grade3 = 1.0;
            } else if (Edit3.equals("F")) {
                grade3 = 0.0;
            }

            if (Edit4.equals("A")) {
                grade4 = 4.0;
            } else if (Edit4.equals("B+")) {
                grade4 = 3.5;
            } else if (Edit4.equals("B")) {
                grade4 = 3.0;
            } else if (Edit4.equals("C+")) {
                grade4 = 2.5;
            } else if (Edit4.equals("C")) {
                grade4 = 2.0;
            } else if (Edit4.equals("D+")) {
                grade4 = 1.5;
            } else if (Edit4.equals("D")) {
                grade4 = 1.0;
            } else if (Edit4.equals("F")) {
                grade4 = 0.0;
            }

            Double totalP = (grade1 * credit) + (grade2 * credit) + (grade3 * credit) + (grade4 * credit);
            Double totalC = credit * 4.0;
            Double totalG = totalP / totalC;

            String TotalP = String.valueOf(df.format(totalP));
            String TotalC = String.valueOf(df.format(totalC));
            String TotalG = String.valueOf(df.format(totalG));

            yourP.setText(TotalP);
            yourC.setText(TotalC);
            yourG.setText(TotalG);
        } else {
            finish();
        }
    }
}

