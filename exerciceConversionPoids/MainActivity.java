package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button myButton;
    EditText poids;
    RadioButton kg_pnd;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.result);

        poids =findViewById(R.id.poids);
        myButton = findViewById(R.id.convert);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kg_pnd=findViewById(R.id.kg_pnd);
                Double poids =new Double(result.getText().toString());

                Double res;

                if (kg_pnd.isChecked())
                    res=poids*2.2;
                else
                    res=(poids/2.2);
                result.setText(res.toString());
            }
        });
    }
}