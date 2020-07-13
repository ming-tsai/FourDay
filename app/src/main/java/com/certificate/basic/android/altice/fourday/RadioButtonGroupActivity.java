package com.certificate.basic.android.altice.fourday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioButtonGroupActivity extends AppCompatActivity implements View.OnClickListener {

    RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button_group);

        radioGroup = findViewById(R.id.my_radio_group);
        findViewById(R.id.my_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        RadioButton radioButtonSelected = findViewById(radioGroup.getCheckedRadioButtonId());
        if(radioButtonSelected != null){
            Toast.makeText(this, radioButtonSelected.getText(), Toast.LENGTH_SHORT).show();
        }else{

            Toast.makeText(this, "Please select an option", Toast.LENGTH_SHORT).show();
        }
    }
}
