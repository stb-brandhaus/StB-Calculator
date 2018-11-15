package com.stb.stb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class KNMVolActivity extends AppCompatActivity {
    DecimalFormat precision = new DecimalFormat("###.##");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_knmvol);
        Button button_calculate_knmvol = (Button) findViewById(R.id.button_calc_knm_vol);
        button_calculate_knmvol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText KNM = (EditText) findViewById(R.id.KNM);
                EditText toAlk = (EditText) findViewById(R.id.calcVolAlc);


                double knm1 = Double.parseDouble(KNM.getText().toString());
                double toAlk1 = (1.267*(0.711173*knm1-2.55))/((0.267*(0.711173*knm1-2.55))+100)*100;





                toAlk.setText(precision.format(toAlk1));










            }
        });
    }
}
