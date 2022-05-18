//6206021611125 น.ส.ธรรณศร เมตตา

package com.thannasorn.assign05_6206021611125;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnGrade, btnVat, btnGpa, btnGall, Exitbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGrade = (Button) findViewById(R.id.btncalGrade);
        btnGrade.setOnClickListener(this);
        btnVat = (Button) findViewById(R.id.btncalVat);
        btnVat.setOnClickListener(this);
        btnGpa = (Button) findViewById(R.id.btncalGpa);
        btnGpa.setOnClickListener(this);
        btnGall = (Button) findViewById(R.id.showGall);
        btnGall.setOnClickListener(this);
        Exitbtn = (Button) findViewById(R.id.btnExit);
        Exitbtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.btncalGrade){
            Intent launchGrade = new Intent(MainActivity.this, Cal_Grade.class);
            startActivity(launchGrade);
        }
        else if (id == R.id.btncalVat){
            startcalVat();
        }
        else if (id == R.id.btncalGpa){
            startcalGpa();
        }
        else if (id == R.id.showGall){
            startshow();
        }
        else if (id == R.id.btnExit){
            Toast.makeText(MainActivity.this, "Exit Program", Toast.LENGTH_SHORT).show();
            finish();
        }
    }

    public void startcalGrade(){
        Intent launchGrade = new Intent(MainActivity.this, Cal_Grade.class);
        startActivity(launchGrade);
    }

    public void startcalVat(){
        Intent launchVat = new Intent(MainActivity.this, Cal_Vat.class);
        startActivity(launchVat);
    }

    public void startcalGpa(){
        Intent launchGpa = new Intent(MainActivity.this, Cal_Gpa.class);
        startActivity(launchGpa);
    }

    public void startshow(){
        Intent launchShow = new Intent(MainActivity.this, Show_Gallery.class);
        startActivity(launchShow);
    }
}


