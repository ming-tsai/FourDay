package com.certificate.basic.android.altice.fourday;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Toast;

public class DatePickerActivity extends AppCompatActivity implements View.OnClickListener {

    DatePicker datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker);

        datePicker = findViewById(R.id.my_date_picker);
        findViewById(R.id.my_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder
                .append(datePicker.getDayOfMonth())
                .append("/")
                .append(datePicker.getMonth())
                .append("/")
                .append(datePicker.getYear());

        Toast.makeText(this, stringBuilder.toString(), Toast.LENGTH_SHORT).show();
    }
}
