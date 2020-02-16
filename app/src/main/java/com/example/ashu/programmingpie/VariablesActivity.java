package com.example.ashu.programmingpie;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class VariablesActivity extends AppCompatActivity {
     Button btnVariables;
     Button btnDataType;
     Button btnVariablesScope;
     Button btnTypecasting;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_variables);

        btnVariables = (Button) findViewById(R.id.btnVariables);
        btnDataType = (Button)findViewById(R.id.btnDataType);
        btnVariablesScope = (Button)findViewById(R.id.btnVariable_Scope);
        btnTypecasting = (Button)findViewById(R.id.btnTypecasting);

        final MediaPlayer mp = MediaPlayer.create(this,R.raw.sample); // this is for sound on click button.


        btnVariables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i = new Intent(VariablesActivity.this,VariablesAndDataTypeActivity.class);
                startActivity(i);
            }
        });

        btnVariablesScope.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i = new Intent(VariablesActivity.this,VariablesScopeActivity.class);
                 startActivity(i);
            }

        });
        btnDataType.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i = new Intent(VariablesActivity.this,DataTypeActivity.class);
                startActivity(i);
            }
        });
        btnTypecasting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i = new Intent(VariablesActivity.this,TypeCastingActivity.class);
                startActivity(i);
            }
        });
    }
    public void btnAbout(){
        Intent i = new Intent(VariablesActivity.this,AboutUs_Activity.class);
        startActivity(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        //return super.onCreateOptionsMenu(menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.about){
            btnAbout();
            return true;
        }
        // return super.onOptionsItemSelected(item);
        if (id == R.id.shareIt){
            Intent myIntent = new Intent(Intent.ACTION_SEND);
            myIntent.setType("text/plan");
            String shareBody = "Your Body is here";
            String shareSub = "Your Subject is Here";
            myIntent.putExtra(Intent.EXTRA_SUBJECT,shareSub);
            myIntent.putExtra(Intent.EXTRA_TEXT,shareBody);
            startActivity(Intent.createChooser(myIntent,"Share Using"));

            return true;
        }
        if(id == R.id.setting){
            Intent i = new Intent(VariablesActivity.this,Settings_Activity.class);
            startActivity(i);
            return  true;
        }
        if(id == R.id.exit){
            onBackPressed();
            return true;
        }
        return true;
    }


}
