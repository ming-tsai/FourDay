package com.certificate.basic.android.altice.fourday;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TimePicker;
import android.widget.Toast;

public class TimePickerActivity extends AppCompatActivity implements View.OnClickListener {

    TimePicker timePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker);

        timePicker = findViewById(R.id.my_time_picker);

        findViewById(R.id.my_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        StringBuilder stringBuilder = new StringBuilder();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
            stringBuilder
                    .append(timePicker.getHour())
                    .append(":")
                    .append(timePicker.getMinute());
        }else{
            stringBuilder
                    .append(timePicker.getCurrentHour())
                    .append(":")
                    .append(timePicker.getCurrentMinute());
        }

        Toast.makeText(this,stringBuilder.toString(),Toast.LENGTH_SHORT).show();
    }
}
