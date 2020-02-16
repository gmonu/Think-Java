package com.example.ashu.programmingpie;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

      ImageButton tuto_btn;
      ImageButton share_btn;
      ImageButton exit_Btn;
      ImageButton btnProgram;
      ImageButton btnIQ;
      ImageButton btnSetting;

      @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        share_btn = (ImageButton)findViewById(R.id.share_button);
        tuto_btn = (ImageButton) findViewById(R.id.tutotrial_button);
        exit_Btn = (ImageButton)findViewById(R.id.exits_button);
        btnProgram = (ImageButton)findViewById(R.id.programs_button);
        btnIQ = (ImageButton) findViewById(R.id.iQ_button);
        btnSetting = (ImageButton)findViewById(R.id.settings_button);
        final MediaPlayer mp = MediaPlayer.create(this,R.raw.sample);

         tuto_btn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 mp.start();
                 Intent intentLoadNewActivity = new Intent(MainActivity.this,Tutorials_Activity.class);
                 startActivity(intentLoadNewActivity);

             }
         });

          share_btn.setOnClickListener(
                  new View.OnClickListener() {
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
                  }
          );

        exit_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                onBackPressed();
            }
        });
        btnProgram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i = new Intent(MainActivity.this,Programs_Activity.class);
                startActivity(i);
            }
        });
        btnIQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i = new Intent(MainActivity.this,Important_Question_Activity.class);
                startActivity(i);
            }
        });
        btnSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i = new Intent(MainActivity.this,Settings_Activity.class);
                startActivity(i);
            }
        });

   }


    // back press button coding Start...
    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("Are sure want to do this...?");
        builder.setCancelable(true);
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
                //super.onBackPressed();
    }

    // back press button coding end
    public void btnAbout()
    {
         Intent i = new Intent(MainActivity.this,AboutUs_Activity.class);
         startActivity(i);

    }



    // menu ke liye yahan se code likh
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
        if(id == R.id.shareIt){
            Intent myIntent = new Intent(Intent.ACTION_SEND);
            myIntent.setType("text/plan");
            String shareBody = "Your Body is here";
            String shareSub = "Your Subject is Here";
            myIntent.putExtra(Intent.EXTRA_SUBJECT,shareSub);
            myIntent.putExtra(Intent.EXTRA_TEXT,shareBody);
            startActivity(Intent.createChooser(myIntent,"Share Using"));

            return true;
        }
        // return super.onOptionsItemSelected(item);
        if(id == R.id.setting){
            Intent i = new Intent(MainActivity.this,Settings_Activity.class);
            startActivity(i);
            return  true;
        }
        if(id == R.id.exit){
            onBackPressed();
            return true;
        }
        return true;
    }  // yahan tak likh menu ke liye code
}
