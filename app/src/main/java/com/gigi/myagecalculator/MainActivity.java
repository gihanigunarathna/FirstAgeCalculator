package com.gigi.myagecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    EditText et,et2;
    Button btn;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //bind the programming variables with views in the layout xml

        et=findViewById(R.id.etYear);
        btn=findViewById(R.id.btnCalculate);
        tv=findViewById(R.id.tvAge);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Integer birthYear=Integer.parseInt(et.getText().toString());
                Integer currentYear=Calendar.getInstance().get(Calendar.YEAR);
                Integer age=currentYear-birthYear;

                tv.setText("Your age is "+age+" years");

            }
        });



    }


}
