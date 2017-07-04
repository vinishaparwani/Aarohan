package com.example.chan.project;

import android.content.Intent;
import android.graphics.Typeface;
import android.icu.text.DisplayContext;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Dashboard extends AppCompatActivity {

    TextView dashText;
    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        init();
        methodListener();

        Typeface myfont = Typeface.createFromAsset(getAssets(),"fonts/Zilap Monograma DEMO.ttf");
        dashText.setTypeface(myfont);

    }

    private void methodListener() {

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Dashboard.this,LoginActivity.class);
                startActivity(i);
            }
        });
    }

    private void init() {

        dashText= (TextView) findViewById(R.id.dashText);
        btn_login = (Button) findViewById(R.id.btn_login);
    }



}
