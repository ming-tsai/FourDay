package com.certificate.basic.android.altice.fourday;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.muddzdev.styleabletoastlibrary.StyleableToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new StyleableToast
                .Builder(this)
                .text("Hello World")
                .textColor(Color.WHITE)
                .backgroundColor(Color.BLUE)
                .show();
    }

    public void goToMyTextViewActivity(View view){
        goToActivity(new Intent(this,TextViewActivity.class));
    }

    public void goToMyImageViewActivity(View view){
        goToActivity(new Intent(this,ImageViewActivity.class));
    }

    public void goToMyEditTextActivity(View view){
        goToActivity(new Intent(this,EditTextActivity.class));
    }

    public void goToMyAutoCompleteTextViewActivity(View view){
        goToActivity(new Intent(this,AutoCompleteTextViewActivity.class));
    }

    public void goToMyButtonActivity(View view){
        goToActivity(new Intent(this,ButtonActivity.class));
    }

    public void goToMyImageButtonActivity(View view){
        goToActivity(new Intent(this,ImageButtonActivity.class));
    }

    public void goToMyCheckBoxActivity(View view){
        goToActivity(new Intent(this,CheckBoxActivity.class));
    }

    public void goToMyToggleButtonActivity(View view){
        goToActivity(new Intent(this,ToggleButtonActivity.class));
    }

    public void goToMyRadioButtonActivity(View view){
        goToActivity(new Intent(this,RadioButtonActivity.class));
    }

    public void goToMyRadioButtonGroupActivity(View view){
        goToActivity(new Intent(this,RadioButtonGroupActivity.class));
    }

    public void goToMyProgressBarActivity(View view){
        goToActivity(new Intent(this,ProgressBarActivity.class));
    }

    public void goToMySpinnerActivity(View view){
        goToActivity(new Intent(this,SpinnerActivity.class));
    }

    public void goToMyTimePickerActivity(View view){
        goToActivity(new Intent(this,TimePickerActivity.class));
    }

    public void goToMyDatePickerActivity(View view){
        goToActivity(new Intent(this,DatePickerActivity.class));
    }

    public void goToMyDateAndTimeActivity(View view){
        goToActivity(new Intent(this,DateAndTimeDialogActivity.class));
    }

    public void goToActivity(Intent intent){
        startActivity(intent);
    }
}
