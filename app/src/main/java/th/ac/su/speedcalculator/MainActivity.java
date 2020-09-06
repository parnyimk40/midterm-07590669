package th.ac.su.speedcalculator;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private EditText n1;
    private EditText n2;
    private Button add;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        n1 = (EditText)findViewById(R.id.editTextNumberDecimal3);
        n2 = (EditText)findViewById(R.id.editTextNumberDecimal4);
        add = (Button)findViewById(R.id.culculate_button);
        result = (TextView)findViewById(R.id.editTextNumberDecimal5);

        Button clear = findViewById(R.id.clear_button);
        Button calculate = findViewById(R.id.culculate_button);

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double d = Integer.parseInt(n1.getText().toString());
                double t = Integer.parseInt(n2.getText().toString());
                double count = d / t ;
                result.setText(String.valueOf(count));
            }



        });
    }

    }



