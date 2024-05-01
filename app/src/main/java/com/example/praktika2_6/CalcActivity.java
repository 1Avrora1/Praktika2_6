package com.example.praktika2_6;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CalcActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        EditText eTF = findViewById(R.id.etFirst);
        EditText eTS = findViewById(R.id.etSecond);
        EditText eTT = findViewById(R.id.etThird);
        Button btnCalc = findViewById(R.id.btnStart);
        btnCalc.setOnClickListener(v -> {
            String fTS = eTF.getText().toString();
            String sTS = eTS.getText().toString();
            String tTS = eTT.getText().toString();
            if(!fTS.isEmpty() && !sTS.isEmpty() && !tTS.isEmpty()){
                int result = Integer.parseInt(fTS) * Integer.parseInt(sTS) * Integer.parseInt(tTS);
                Intent intent = new Intent();
                intent.putExtra("data",result);
                setResult(RESULT_OK,intent);
                finish();
            }
            else{
                Toast.makeText(getApplicationContext(),"Неверный ввод значений",Toast.LENGTH_LONG).show();
            }
        });
    }
}