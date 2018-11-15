package com.stb.stb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SplashScreen extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        Button goToMenuCalc = findViewById(R.id.button_goto_menu_calc);
        Button goToLager = findViewById(R.id.button_goto_lager);
        Button goToBrand = findViewById(R.id.button_goto_braende);

        goToMenuCalc.setOnClickListener(this);
        goToLager.setOnClickListener(this);
        goToBrand.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_goto_menu_calc:
                Intent goToMenuCalc = new Intent(getApplicationContext(), MenuCalcActivity.class);
                startActivity(goToMenuCalc);
                break;
            case R.id.button_goto_lager:
                Intent goToLager = new Intent(getApplicationContext(), LagerActivity.class);
                startActivity(goToLager);
                break;
            case R.id.button_goto_braende:
                Intent goToBraende = new Intent(getApplicationContext(), BraendeActivity.class);
                startActivity(goToBraende);
                break;
        }

    }

}