package lilian.example.appcalculette;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = new TextView(this);
        textView.setTextColor(Color.RED);
        textView.setText("Application Calculette");
        setContentView(textView);
    }
}
