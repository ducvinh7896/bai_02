package com.example.ducvinh.bai_02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText txtf,txtc;
    private Button btntoC,btnToF,btnclear;
   private double f,c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addcontrol();
        addevent();
    }

    private void addevent() {


        btnToF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                c=Double.parseDouble(txtc.getText().toString());
                double kq;
                kq=c*(9/5)+32;
                txtf.setText(String.valueOf(kq));

            }
        });
    btntoC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                f=Double.parseDouble(txtf.getText().toString());
                double kq;
                kq=(f-32)*5/9;
                txtc.setText(String.valueOf(kq));

            }
        });


        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

              txtc.setText("");
              txtf.setText("");
            }
        });

    }

    private void addcontrol() {
        txtc=findViewById(R.id.txtc);
        txtf=findViewById(R.id.txtf);
        btntoC=findViewById(R.id.btnToC);
        btnToF=findViewById(R.id.btnToF);
        btnclear=findViewById(R.id.btnclear);
    }
}
