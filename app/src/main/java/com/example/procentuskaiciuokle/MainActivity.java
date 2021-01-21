package com.example.procentuskaiciuokle;

import androidx.appcompat.app.AppCompatActivity;

// Erika Supranavičiūtė

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

// Erika Supranavičiūtė

public class MainActivity extends AppCompatActivity {

    private EditText edtEnterPercent, edtEnterNumber;
    private Button btnCalculate;
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtEnterPercent = findViewById(R.id.edtEnterPercent);
        edtEnterNumber = findViewById(R.id.edtEnterNumber);
        btnCalculate = findViewById(R.id.btnCalculate);
        txtResult = findViewById(R.id.txtResult);

        setTitle("Procentų skaičiuoklė");

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                float percentNumericValue = Float.parseFloat(edtEnterPercent.getText().toString());
                float decimalValue = percentNumericValue / 100;
                float result = decimalValue * Float.parseFloat(edtEnterNumber.getText().toString());
                txtResult.setText(Float.toString(result));
            }
        });

    }
}
