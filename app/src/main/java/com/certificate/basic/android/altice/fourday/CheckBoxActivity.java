package com.certificate.basic.android.altice.fourday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckBoxActivity extends AppCompatActivity implements View.OnClickListener {

    private CheckBox checkBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        checkBox = findViewById(R.id.my_check_box);
        findViewById(R.id.my_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this
                , checkBox.isChecked()? "Checked":"Not Checked"
                ,Toast.LENGTH_SHORT).show();
    }
}
