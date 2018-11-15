package com.stb.stb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.text.DecimalFormat;

public class VolAlkGradCActivity extends AppCompatActivity {

    DecimalFormat precision = new DecimalFormat("###.##");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vol_alk_grad_c);

        Button calcAlcTemp = (Button) findViewById(R.id.calcAlcTemp);
        calcAlcTemp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView istTemp = (TextView) findViewById(R.id.istTemp);
                EditText scheinAlk = (EditText) findViewById(R.id.scheinAlk);
                TextView wahrAlk = (TextView) findViewById(R.id.wahrAlk);
                TextView sollTemp = (TextView) findViewById(R.id.sollTemp);
                TextView TempDiff = (TextView) findViewById(R.id.TempDiff);
                TextView TempDiff_calc = (TextView) findViewById(R.id.TempDiff_calc);
                TextView calc = (TextView) findViewById(R.id.calc);

                double iTemp = Double.parseDouble(istTemp.getText().toString());
                double schAlk = Double.parseDouble(scheinAlk.getText().toString());
                double sTemp = Double.parseDouble(sollTemp.getText().toString());
                double TDiff = (sTemp - iTemp);
                double cal = (schAlk /100*(7.166 - (schAlk /30)));
                double TDiff_calc = TDiff / cal;
                double trueAlk = schAlk + TDiff_calc;

                wahrAlk.setText(precision.format(trueAlk));
                TempDiff_calc.setText(precision.format(trueAlk));
                calc.setText(precision.format(cal));
                TempDiff.setText(precision.format(TDiff));


            }
        });
    }
}
