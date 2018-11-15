package com.stb.stb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.text.DecimalFormat;

public class CalcHerabsetzenActivity extends AppCompatActivity {

    DecimalFormat precision = new DecimalFormat("###.##");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_herabsetzen);

        Button button_calculate_herabsetzen = (Button) findViewById(R.id.button_calculate_herabsetzen);
        button_calculate_herabsetzen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText ausgangsmengeLiter = (EditText) findViewById(R.id.ausgangsmengeLiter);
                EditText ausgangsVol = (EditText) findViewById(R.id.ausgangsVol);
                EditText zielVol = (EditText) findViewById(R.id.zielVol);
                EditText gebindeGroesse = (EditText) findViewById(R.id.gebindeGroesse);
                TextView ergebnisSchnittwasser = (TextView) findViewById(R.id.ergebnisSchnittwasser);
                TextView literGesamt = (TextView) findViewById(R.id.literGesamt);
                TextView anzahlGebinde = (TextView) findViewById(R.id.anzahlGebinde);

                float ausgLit = (float) Float.parseFloat(ausgangsmengeLiter.getText().toString());
                double ausgVol = Double.parseDouble(ausgangsVol.getText().toString());
                double zVol = Double.parseDouble(zielVol.getText().toString());
                double gebGr = Double.parseDouble(gebindeGroesse.getText().toString());
                double ergebSchnittw = (((ausgLit * (ausgVol  - zVol) / zVol )))*1.032;
                double litGes = ausgLit + ergebSchnittw;
                double anzGeb = litGes / gebGr;



                ergebnisSchnittwasser.setText(precision.format(ergebSchnittw));
                literGesamt.setText(precision.format(litGes));
                anzahlGebinde.setText(precision.format(anzGeb));









            }
        });
    }
}
