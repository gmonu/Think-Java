package com.example.ashu.programmingpie;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class SetupActivity extends AppCompatActivity {

     Button btnEnvironment;
     Button btnFirst_Program;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup);

        btnEnvironment = (Button)findViewById(R.id.btnEnvironment_Setup);
        btnFirst_Program = (Button)findViewById(R.id.btnFirst_Program);
        final MediaPlayer mp = MediaPlayer.create(this,R.raw.sample);

        btnEnvironment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i = new Intent(SetupActivity.this,EnvironmentActivity.class);
                startActivity(i);
            }
        });

        btnFirst_Program.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i = new Intent(SetupActivity.this,First_Program_Activity.class);
                startActivity(i);
            }
        });

    }
    public void btnAbout(){
        Intent i = new Intent(SetupActivity.this,AboutUs_Activity.class);
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
            Intent i = new Intent(SetupActivity.this,Settings_Activity.class);
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
