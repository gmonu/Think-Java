package com.example.ashu.programmingpie;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ErrorAndExceptions_Activity extends AppCompatActivity {
    Button btnException;
    Button btnTryAndCatch;
    Button btnCustomException;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_error_and_exceptions_);

        btnException = (Button)findViewById(R.id.btnExceptions);
        btnTryAndCatch = (Button)findViewById(R.id.btnTryCatch);
        btnCustomException = (Button)findViewById(R.id.btnCustomException);
        final MediaPlayer mp = MediaPlayer.create(this,R.raw.sample);

        btnException.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i = new Intent(ErrorAndExceptions_Activity.this,Exception_Activity.class);
                startActivity(i);
            }
        });
        btnTryAndCatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i = new Intent(ErrorAndExceptions_Activity.this,TryAndCatch_Activity.class);
                startActivity(i);
            }
        });
        btnCustomException.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i = new Intent(ErrorAndExceptions_Activity.this,CustomException_Activity.class);
                startActivity(i);
            }
        });
    }
    public void btnAbout(){
        Intent i = new Intent(ErrorAndExceptions_Activity.this,AboutUs_Activity.class);
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
            Intent i = new Intent(ErrorAndExceptions_Activity.this,Settings_Activity.class);
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
