package com.example.conversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText txtC, txtF, txtK, txtM, txtKg, txtLb, txtL, txtG;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtC = findViewById(R.id.txtC);
        txtF = findViewById(R.id.txtF);
        txtK = findViewById(R.id.txtK);
        txtM = findViewById(R.id.txtM);
        txtKg = findViewById(R.id.txtKg);
        txtLb = findViewById(R.id.txtLb);
        txtL = findViewById(R.id.txtL);
        txtG = findViewById(R.id.txtG);
        final TextWatcher myWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String stF = txtF.getText().toString();
                double valF = Double.parseDouble(stF);
                double valC = (valF -32)*5/9;
                String stC = Double.toString(valC);
                txtC.setText(stC);

            }

            @Override
            public void afterTextChanged(Editable s) {


            }
        };
        txtF.addTextChangedListener(myWatcher);
        final TextWatcher cWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String stC = txtC.getText().toString();
                double valC = Double.parseDouble(stC);
                double valF = (valC * 9/5)+32;
                String stF = Double.toString(valF);
                txtF.setText(stF);

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        };
        txtC.addTextChangedListener(cWatcher);




    }
}
