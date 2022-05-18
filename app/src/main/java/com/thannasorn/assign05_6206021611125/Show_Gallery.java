//6206021611125 น.ส.ธรรณศร เมตตา

package com.thannasorn.assign05_6206021611125;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Show_Gallery extends AppCompatActivity implements View.OnClickListener {

    private ImageButton p1, p2, p3, p4, p5, p6, p7, p8;
    private ImageView Img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_gallery);

        p1 = (ImageButton) findViewById(R.id.pic1);
        p1.setOnClickListener(this);
        p2 = (ImageButton) findViewById(R.id.pic2);
        p2.setOnClickListener(this);
        p3 = (ImageButton) findViewById(R.id.pic3);
        p3.setOnClickListener(this);
        p4 = (ImageButton) findViewById(R.id.pic4);
        p4.setOnClickListener(this);
        p5 = (ImageButton) findViewById(R.id.pic5);
        p5.setOnClickListener(this);
        p6 = (ImageButton) findViewById(R.id.pic6);
        p6.setOnClickListener(this);
        p7 = (ImageButton) findViewById(R.id.pic7);
        p7.setOnClickListener(this);
        p8 = (ImageButton) findViewById(R.id.pic8);
        p8.setOnClickListener(this);

        Img = (ImageView) findViewById(R.id.ShowImg);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.pic1){
            Img.setImageResource(R.drawable.p1);
        }
        else if (id == R.id.pic2){
            Img.setImageResource(R.drawable.p2);
        }
        else if (id == R.id.pic3){
            Img.setImageResource(R.drawable.p3);
        }
        else if (id == R.id.pic4){
            Img.setImageResource(R.drawable.p4);
        }
        else if (id == R.id.pic5){
            Img.setImageResource(R.drawable.p5);
        }
        else if (id == R.id.pic6){
            Img.setImageResource(R.drawable.p6);
        }
        else if (id == R.id.pic7){
            Img.setImageResource(R.drawable.p7);
        }
        else if (id == R.id.pic8){
            Img.setImageResource(R.drawable.p8);
        }
    }
}


