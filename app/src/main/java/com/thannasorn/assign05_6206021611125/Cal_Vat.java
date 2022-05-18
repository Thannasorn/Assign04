//6206021611125 น.ส.ธรรณศร เมตตา

package com.thannasorn.assign05_6206021611125;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.text.DecimalFormat;

public class Cal_Vat extends AppCompatActivity implements View.OnClickListener {

    private Button Vatbtn, Backbtn;
    private EditText priceText;
    private TextView priceP, vatP, total;

    double price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal_vat);

        Vatbtn = findViewById(R.id.calVat);
        Vatbtn.setOnClickListener(this);
        Backbtn = findViewById(R.id.btnBack);
        Backbtn.setOnClickListener(this);

        priceText = findViewById(R.id.Price);
        priceP = findViewById(R.id.PriceP);
        vatP = findViewById(R.id.VatP);
        total = findViewById(R.id.TotalP);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.calVat) {
            price = Double.parseDouble(priceText.getText().toString());
            DecimalFormat df = new DecimalFormat();
            df.applyPattern("#,###.00");


            Double PriceP = price;
            String PP = df.format(PriceP);



            Double Vat = price * 7;
            Vat = Vat / 100;
            String V = String.valueOf(df.format(Vat));

            Double total1 = price + Vat;
            String Total = String.valueOf(df.format(total1));

            priceP.setText(PP);
            vatP.setText(V);
            total.setText(Total);
        } else if (id == R.id.btnBack) {
            finish();
        }
    }
}

