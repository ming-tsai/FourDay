package com.certificate.basic.android.altice.fourday;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class DateAndTimeDialogActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textViewDate, textViewTime, textViewDateTime;

    DatePickerDialog datePickerDialog;
    TimePickerDialog timePickerDialog;
    Calendar calendar;
    SimpleDateFormat dateFormat, timeFormat, dateTimeFormat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_and_time_dialog);

        calendar = Calendar.getInstance();
        dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
        timeFormat = new SimpleDateFormat("hh:dd a", Locale.getDefault());
        dateTimeFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm a", Locale.getDefault());

        datePickerDialog = new DatePickerDialog(
                this,
                onDateSetListener,
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH));

        timePickerDialog = new TimePickerDialog(
                this,
                onTimeSetListener,
                calendar.get(Calendar.HOUR_OF_DAY),
                calendar.get(Calendar.MINUTE),
                false
        );

        textViewDate = findViewById(R.id.text_view_date);
        textViewTime = findViewById(R.id.text_view_time);
        textViewDateTime = findViewById(R.id.text_view_date_time);

        findViewById(R.id.button_set_date).setOnClickListener(this);
        findViewById(R.id.button_set_time).setOnClickListener(this);

        refreshDisplay();

    }

    DatePickerDialog.OnDateSetListener onDateSetListener =
            new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                    calendar.set(Calendar.YEAR, year);
                    calendar.set(Calendar.MONTH, month);
                    calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);

                    refreshDisplay();
                }
            };

    TimePickerDialog.OnTimeSetListener onTimeSetListener =
            new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                    calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
                    calendar.set(Calendar.MINUTE, minute);

                    refreshDisplay();
                }
            };

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_set_date:
                datePickerDialog.show();
                break;
            case R.id.button_set_time:
                timePickerDialog.show();
                break;
        }
    }


    private void refreshDisplay() {
        textViewDateTime.setText(dateTimeFormat.format(calendar.getTime()));
        textViewDate.setText(dateFormat.format(calendar.getTime()));
        textViewTime.setText(timeFormat.format(calendar.getTime()));
    }
}
