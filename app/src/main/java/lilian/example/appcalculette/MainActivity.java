package lilian.example.appcalculette;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.graphics.Color;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button monBouton;
    private EditText bufferA;
    private EditText bufferB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       monBouton = (Button) findViewById(R.id.btCalculer);
       bufferA = (EditText) findViewById(R.id.editNbA);
       bufferB = (EditText) findViewById(R.id.editNbB);
    }
}
