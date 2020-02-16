package com.example.ashu.programmingpie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Settings_Activity extends AppCompatActivity {
      private Button btnshareit,btnAboutus,btnExit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_);

        btnshareit = (Button)findViewById(R.id.btnShareit);
        btnAboutus = (Button)findViewById(R.id.btnAboutus);
        btnExit = (Button)findViewById(R.id.btnExit);

        btnshareit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plan");
                String shareBody = "Your Body is here";
                String shareSub = "Your Subject is Here";
                myIntent.putExtra(Intent.EXTRA_SUBJECT,shareSub);
                myIntent.putExtra(Intent.EXTRA_TEXT,shareBody);
                startActivity(Intent.createChooser(myIntent,"Share Using"));

            }
        });
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        btnAboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Settings_Activity.this,AboutUs_Activity.class);
                startActivity(i);
            }
        });
    }
}
