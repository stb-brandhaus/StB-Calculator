package com.stb.stb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MenuCalcActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_calc);

        Button goToCalcHerabsetzen = findViewById(R.id.button_goto_calc_herabsetzen);
        Button goToAlcTemp = findViewById(R.id.button_goto_Alc_Temp);
        Button goToKNMAlc = findViewById(R.id.button_goto_KNMAlc);
        Button goToMaischeZus = findViewById(R.id.button_goto_MaischeZus);

        goToCalcHerabsetzen.setOnClickListener(this);
        goToAlcTemp.setOnClickListener(this);
        goToKNMAlc.setOnClickListener(this);
        goToMaischeZus.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_goto_calc_herabsetzen:
                Intent goToCalcHerabsetzen = new Intent(getApplicationContext(), CalcHerabsetzenActivity.class);
                startActivity(goToCalcHerabsetzen);
                break;
            case R.id.button_goto_Alc_Temp:
                Intent goToAlcTemp = new Intent(getApplicationContext(), VolAlkGradCActivity.class);
                startActivity(goToAlcTemp);
                break;
            case R.id.button_goto_KNMAlc:
                Intent goToKNMAlc = new Intent(getApplicationContext(), KNMVolActivity.class);
                startActivity(goToKNMAlc);
                break;

            case R.id.button_goto_MaischeZus:
                Intent goToCalcMaische = new Intent(getApplicationContext(), MaischeZugabenActivity.class);
                startActivity(goToCalcMaische);
                break;
        }

    }

}
