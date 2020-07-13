package com.certificate.basic.android.altice.fourday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class RadioButtonActivity extends AppCompatActivity implements View.OnClickListener {

    RadioButton radioButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

        radioButton = findViewById(R.id.radio_button);
        findViewById(R.id.my_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this
                , radioButton.isChecked()? "Checked":"Not Checked"
                ,Toast.LENGTH_SHORT).show();
        radioButton.setChecked(false);
    }
}
