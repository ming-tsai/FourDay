package com.certificate.basic.android.altice.fourday;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity
        implements View.OnClickListener, DialogInterface.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        findViewById(R.id.my_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        new AlertDialog.Builder(this)
                .setTitle("Titulo")
                .setPositiveButton("Yes",this)
                .setNegativeButton("No",this)
                .setNeutralButton("Ok",this)
                .create()
                .show();
    }

    @SuppressLint("DefaultLocale")
    @Override
    public void onClick(DialogInterface dialog, int which) {

        String message = "Res. %s: val: %d";
        switch (which){
            case  AlertDialog.BUTTON_NEGATIVE:
                message = String.format(message,"Negative",AlertDialog.BUTTON_NEGATIVE);
                break;
            case  AlertDialog.BUTTON_POSITIVE:
                message = String.format(message,"Positive",AlertDialog.BUTTON_POSITIVE);
                break;
            case  AlertDialog.BUTTON_NEUTRAL:
                message = String.format(message,"Neutral",AlertDialog.BUTTON_NEUTRAL);
                break;
        }

        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }
}
