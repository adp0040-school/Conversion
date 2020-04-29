package com.example.conversion;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
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

        txtC.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                String celsius = s.toString();
                if (!txtC.isFocused()) {
                    return;
                }
                if (celsius.length() == 0) {
                    return;
                }

                    Double cVal = Double.parseDouble(celsius);
                    Double fVal = cVal * (9 / 5) + 32;
                    String fahrenheit = Double.toString(fVal);
                    txtF.setText(fahrenheit);
                    Log.i("Conversion", "Celsius entered: " + celsius);
                    Log.i("Conversion", "Fahrenheit converted to: " + fahrenheit);





            }
        });


        txtF.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String fahrenheit = s.toString();
                if(!txtF.isFocused()) {
                    return;
                }
                if (fahrenheit.length() == 0) {
                    return;
                }

                    Double fVal = Double.parseDouble(fahrenheit);
                    Double cVal = (fVal - 32) * 5 / 9;
                    String celsius = Double.toString(cVal);
                    txtC.setText(celsius);
                    Log.i("Conversion", "Fahrenheit entered: " + fahrenheit);
                    Log.i("Conversion", "Celsius converted to: " + celsius);


            }
        });
        txtK.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String kilometers = s.toString();
                if(!txtK.isFocused()) {
                    return;
                }
                if(kilometers.length() == 0) {
                    return;
                }
                Double kVal = Double.parseDouble(kilometers);
                Double mVal = kVal/1.609;
                String mile = Double.toString(mVal);
                txtM.setText(mile);
                Log.i("Conversion", "Kilometer entered: " + kilometers);
                Log.i("Conversion", "Mile converted to: " + mile);


            }
        });
        txtM.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String mile = s.toString();
                if(!txtM.isFocused()) {
                    return;
                }
                if(mile.length() == 0) {
                    return;
                }
                Double mVal = Double.parseDouble(mile);
                Double kVal = mVal * 1.6;
                String kilometers = Double.toString(kVal);
                txtK.setText(kilometers);
                Log.i("Conversion", "Miles entered: " + mile);
                Log.i("Conversion", "Kilometer converted to: " + kilometers);

            }
        });
        txtKg.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String kilogram = s.toString();
                if(!txtKg.isFocused()){
                    return;
                }
                if (kilogram.length() == 0) {
                    return;
                }
                Double kVal = Double.parseDouble(kilogram);
                Double lVal = kVal * 2.2;
                String pounds = Double.toString(lVal);
                txtLb.setText(pounds);
                Log.i("Conversion", "Kilograms entered: " + kilogram);
                Log.i("Conversion", "Pounds converted to: " + pounds);


            }
        });
        txtLb.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String pounds = s.toString();
                if(!txtLb.isFocused()){
                    return;
                }
                if (pounds.length() == 0) {
                    return;
                }
                Double lVal = Double.parseDouble(pounds);
                Double kVal = lVal / 2.2046;
                String kilograms = Double.toString(kVal);
                txtKg.setText(kilograms);
                Log.i("Conversion", "Pounds entered: " + pounds);
                Log.i("Conversion", "Kilograms converted to: " + kilograms);

            }
        });
        txtL.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String liters = s.toString();
                if (!txtL.isFocused()){
                    return;
                }
                if (liters.length() == 0) {
                    return;
                }
                Double lVal = Double.parseDouble(liters);
                Double gVal = lVal * .264;
                String gallons = Double.toString(gVal);
                txtG.setText(gallons);
                Log.i("Conversion", "Liters entered: " + liters);
                Log.i("Conversion", "Gallons converted to: " + gallons);


            }
        });
        txtG.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String gallons = s.toString();
                if (!txtG.isFocused()){
                    return;
                }
                if (gallons.length() == 0) {
                    return;
                }
                Double gVal = Double.parseDouble(gallons);
                Double lVal = gVal / .264;
                String liters = Double.toString(lVal);
                txtL.setText(liters);
                Log.i("Conversion", "Gallons entered: " + gallons);
                Log.i("Conversion", "Liters converted to: " + liters);

            }
        });





    }
}
