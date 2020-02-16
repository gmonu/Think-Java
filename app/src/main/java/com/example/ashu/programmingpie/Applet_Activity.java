package com.example.ashu.programmingpie;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Applet_Activity extends AppCompatActivity {
      Button btnAppletIntro;
      Button btnCreatingApplet;
      Button btnLifeCycle;
      Button btnDesignAWebpage;
      Button btnRunningApplet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_applet_);

        btnAppletIntro = (Button)findViewById(R.id.btnAppletIntro);
        btnLifeCycle = (Button)findViewById(R.id.btnAppletLifeCycle);
        btnCreatingApplet = (Button)findViewById(R.id.btnCreatingApplet);
        btnDesignAWebpage = (Button)findViewById(R.id.btnDesignAWabpage);
        btnRunningApplet = (Button)findViewById(R.id.btnRunningApplet);
        final MediaPlayer mp = MediaPlayer.create(this,R.raw.sample);

         btnAppletIntro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              mp.start();
              Intent i = new Intent(Applet_Activity.this,Apple_Introduction_Activity.class);
              startActivity(i);
            }
        });
         btnLifeCycle.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 mp.start();
                 Intent i = new Intent(Applet_Activity.this,Applet_LifeCycle_Activity.class);
                 startActivity(i);
             }
         });
         btnCreatingApplet.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 mp.start();
                 Intent i = new Intent(Applet_Activity.this,Creating_An_Executable_Applet_Activity.class);
                 startActivity(i);
             }
         });
         btnDesignAWebpage.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 mp.start();
                 Intent i = new Intent(Applet_Activity.this,Designing_A_WebPage_Activity.class);
                 startActivity(i);
             }
         });
         btnRunningApplet.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 mp.start();
                 Intent i = new Intent(Applet_Activity.this,Running_Applet_Activity.class);
                 startActivity(i);
             }
         });
    }

    public void btnAbout(){
        Intent i = new Intent(Applet_Activity.this,AboutUs_Activity.class);
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
            Intent i = new Intent(Applet_Activity.this,Settings_Activity.class);
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
