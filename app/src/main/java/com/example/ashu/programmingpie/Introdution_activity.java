package com.example.ashu.programmingpie;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Introdution_activity extends AppCompatActivity {
     Button btnIntroduction_1;
     Button btnFeatures;
     Button btnProsAndCons;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introdution_activity);


        btnIntroduction_1 = (Button)findViewById(R.id.btnIntroduction_1);
        btnFeatures = (Button)findViewById(R.id.btnFeatures_2);
        btnProsAndCons = (Button)findViewById(R.id.btnProsandCons_3);
        final MediaPlayer mp = MediaPlayer.create(this,R.raw.sample);

        btnIntroduction_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i = new Intent(Introdution_activity.this,Introduction_1_Activity.class);
                startActivity(i);
            }
        });

        btnFeatures.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i = new Intent(Introdution_activity.this,FeaturesActivity.class);
                startActivity(i);
            }
        });

        btnProsAndCons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i = new Intent(Introdution_activity.this,ProsAndConsActivity.class);
                startActivity(i);
            }
        });

    }


    public void btnAbout(){
        Intent i = new Intent(Introdution_activity.this,AboutUs_Activity.class);
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
            Intent i = new Intent(Introdution_activity.this,Settings_Activity.class);
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
