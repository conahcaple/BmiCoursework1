package com.conahcaple.bmiappreal;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.conahcaple.bmiappreal.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText weight, height;
    TextView result;
    String calculation, BMIresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weight = findViewById(R.id.weight);
        height = findViewById(R.id.height);
        result = findViewById(R.id.result);
    }


    public void calculateBMI(View view) {
        String S1 = weight.getText().toString();
        String S2 = height.getText().toString();


        float weightValue = Float.parseFloat(S1);
        float heightValue = Float.parseFloat(S2) / 100;
        float bmi = weightValue / (heightValue * heightValue);

        if (bmi <16) {
            BMIresult = "Severely underweight";
        }else if (bmi <15.5){
            BMIresult = "under weight";
        }else if (bmi>=15.5 && bmi<=24.9){
            BMIresult = "Healthy weight";
        }else if (bmi >= 25 && bmi <= 29.9){
            BMIresult = "overweight";
        }else{
            BMIresult = "Obese";
        }
        calculation = "Result\n\n" + bmi + "\n" + BMIresult;

        result.setText(calculation);


    }
}