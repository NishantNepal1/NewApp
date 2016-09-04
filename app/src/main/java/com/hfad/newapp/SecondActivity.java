package com.hfad.newapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by user on 8/8/2016.
 */
public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    EditText etUserName;
    EditText etPassword;
    Button btnSubmit;
    Button passwordForgot;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        init();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("onStart", "onstart");
    }


    @Override
    protected void onPause() {
        super.onPause();

        Log.e("onpause", "onpause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Onresume", "onResume");
    }

    private void init() {
        etUserName = (EditText) findViewById(R.id.etUserName);
        etPassword = (EditText) findViewById(R.id.etUserPassword);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        passwordForgot = (Button) findViewById(R.id.passwordForgot);
        btnSubmit.setOnClickListener(this);
        passwordForgot.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (isFormvalid()) {

            Toast.makeText(SecondActivity.this, "Hello " + etUserName.getText().toString(), Toast.LENGTH_SHORT).show();

        }
    }



    private boolean isFormvalid() {
        if (etUserName.getText().toString().isEmpty()) {
            etUserName.setError("Empty Field");
            return false;
        }

        return true;
    }
}
