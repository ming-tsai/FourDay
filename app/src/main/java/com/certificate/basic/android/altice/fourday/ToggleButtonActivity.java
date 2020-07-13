package com.certificate.basic.android.altice.fourday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ToggleButtonActivity extends AppCompatActivity implements View.OnClickListener {

    private ToggleButton toggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button);
        toggleButton = findViewById(R.id.my_toggle_button);
        findViewById(R.id.my_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this
                , toggleButton.isChecked()? "Checked":"Not Checked"
                ,Toast.LENGTH_SHORT).show();
    }
}
