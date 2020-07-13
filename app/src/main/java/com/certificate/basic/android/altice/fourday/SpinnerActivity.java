package com.certificate.basic.android.altice.fourday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class SpinnerActivity extends AppCompatActivity {

    Spinner spinner;
    String[] data ={"Dog","Cat","Mouse"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        spinner = findViewById(R.id.my_spinner);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(
                this, android.R.layout.simple_spinner_dropdown_item,data
        );

        spinner.setAdapter(arrayAdapter);

        findViewById(R.id.my_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(
                        SpinnerActivity.this,
                        (spinner!=null && spinner.getSelectedItem() != null) ?
                                spinner.getSelectedItem().toString() :
                                "Must be select spinner",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });
    }
}
