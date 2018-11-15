package com.stb.stb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MaischeZugabenActivity extends AppCompatActivity {

    DecimalFormat precision = new DecimalFormat("###.##");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maische_zugaben);

        Button MaischeCalc = (Button) findViewById(R.id.button_calcMaische_Zug);
        MaischeCalc.setOnClickListener(new View.OnClickListener() {

           @Override
           public void onClick(View view) {
               EditText MaischeLiter = (EditText) findViewById(R.id.MaischeLiter);
               EditText MaischeKMW = (EditText) findViewById(R.id.MaischeKMW);
               EditText MaischeZielVol = (EditText) findViewById(R.id.MaischeZielVol);
               EditText MaischeVolDiff = (EditText) findViewById(R.id.MaischeVolDiff);
               TextView MaischeZugZuck = (TextView) findViewById(R.id.Maische_ZugZuck);
               EditText MaischeMilchS = (EditText) findViewById(R.id.Maische_MilchS);


               double MLit = Double.parseDouble(MaischeLiter.getText().toString());
               double MKMW = Double.parseDouble(MaischeKMW.getText().toString());
               double MzielVol = Double.parseDouble(MaischeZielVol.getText().toString());

               double MVolDiff = MzielVol-((1.267*(0.711173*MKMW-2.55))/((0.267*(0.711173*MKMW-2.55))+100)*100);
               double MzugZuck = (MVolDiff*16*MLit)/1000;
               double MMilchS = MLit*3.6;



               MaischeZugZuck.setText(precision.format(MzugZuck));
               MaischeMilchS.setText(precision.format(MMilchS));





           }
        });
    }
}
