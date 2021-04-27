package com.example.hellokotlin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BmiJavaActivity extends AppCompatActivity {
    EditText hightField, weightFiled;
    TextView textResult;
    Button btnBmi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_view_binding);

        hightField = findViewById(R.id.heightField);
        weightFiled = findViewById(R.id.weightField);
        textResult = findViewById(R.id.txtResult);
        btnBmi = findViewById(R.id.btnBMI);

        btnBmi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String sHeight,sWeight;
             /*   String sHeight = hightField.getText().toString();
                String sWeight = weightFiled.getText().toString();
                if(!weightFiled.getText().toString().isEmpty() && !hightField.getText().toString().isEmpty()){
                    if(sHeight != null && sWeight != null){
                        double bmi = Double.parseDouble(sWeight) / Math.pow(Double.parseDouble(sHeight)/100.,2.);
                        textResult.setText("Your BMI = "+bmi);
                    }
                    else{
                        textResult.setText("Input(s) missing");
                    }
                } */
                try {
                    sHeight = hightField.getText().toString();
                    sWeight = weightFiled.getText().toString();
                    double bmi = Double.parseDouble(sWeight) / Math.pow(Double.parseDouble(sHeight)/100.,2.);
                    textResult.setText("Your BMI = "+bmi);
                }catch (Exception e){
                    textResult.setText("Input(s) missing");
                }

            }
        });
    }
}