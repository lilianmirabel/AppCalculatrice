package lilian.example.appcalculette;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.graphics.Color;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import java.math.BigDecimal;
import android.view.Menu;
import android.widget.RadioGroup;
import android.app.AlertDialog;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button monBouton;
    private EditText bufferA;
    private EditText bufferB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        monBouton = (Button) findViewById(R.id.btCalculer);
        monBouton.setOnClickListener(this);


       bufferA = (EditText) findViewById(R.id.editNbA);
       bufferB = (EditText) findViewById(R.id.editNbB);
    }

    @Override
    public void onClick(View v) {
        Double res = 0.0;
        if (v == monBouton) {
// on récupère les opérandes
            Double nbA = Double.valueOf((bufferA.getText()).toString());
            Double nbB = Double.valueOf((bufferB.getText()).toString());
// On récupère le groupe des boutons radio
            RadioGroup radioOperateur = (RadioGroup)
                    findViewById(R.id.rdOperateur);
// On récupère celui qui est sélectionné
            int operateurSel = radioOperateur.getCheckedRadioButtonId();
            switch (operateurSel) {
                case R.id.rdAddition:
                    res = nbA + nbB;
                    break;
                case R.id.rdSoustraction:
                    res = nbA - nbB;
                    break;
                case R.id.rdMultiplication:
                    res = nbA * nbB;
                    break;
                case R.id.rdDivision:
                    res = nbA / nbB;
                    break;
            }
// On formate le résultat
            int decimalnb = 2;
            BigDecimal bd = new BigDecimal(res);
// setScale is immutable
            bd = bd.setScale(decimalnb, BigDecimal.ROUND_HALF_UP);
            res = bd.doubleValue();
// On affiche le résultat
// dans un champ de type TextView
            TextView t = (TextView) findViewById(R.id.tvResultat);
            t.setText(String.valueOf(res));


        }
    }};
