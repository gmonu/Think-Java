package com.example.ashu.programmingpie;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MultithreadingActivity extends AppCompatActivity {
     Button btnCreatingThread;
     Button btnStoppingAndBlocking;
     Button btnLifeCycle;
     Button btnExpressinAndPriority;
     Button btnSynchronzation;
     Button btnRunnableInterface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multithreading);

        btnCreatingThread = (Button)findViewById(R.id.btnCreatingThread);
        btnStoppingAndBlocking = (Button)findViewById(R.id.btnStoppingAndBlocking);
        btnLifeCycle = (Button)findViewById(R.id.btnLifeCycle);
        btnExpressinAndPriority = (Button)findViewById(R.id.btnExceptionAndPriority);
        btnSynchronzation = (Button)findViewById(R.id.btnSynchronization);
        btnRunnableInterface = (Button)findViewById(R.id.btnRunnable_Interface);
        final MediaPlayer mp = MediaPlayer.create(this,R.raw.sample);

        btnCreatingThread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i = new Intent(MultithreadingActivity.this,CreatingThreadActivity.class);
                startActivity(i);
            }
        });

        btnStoppingAndBlocking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i = new Intent(MultithreadingActivity.this,StoppingAndBlocking_Activity.class);
                startActivity(i);
            }
        });

        btnLifeCycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i = new Intent(MultithreadingActivity.this,LifeCycle_Activity.class);
                startActivity(i);
            }
        });

        btnExpressinAndPriority.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i = new Intent(MultithreadingActivity.this,ExceptionAndPriority_Activity.class);
                startActivity(i);
            }
        });

        btnSynchronzation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i = new Intent(MultithreadingActivity.this,SynchronizationActivity.class);
                startActivity(i);
            }
        });

        btnRunnableInterface.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i = new Intent(MultithreadingActivity.this,Runnable_Interface_Activity.class);
                startActivity(i);
            }
        });

    }
    public void btnAbout(){
        Intent i = new Intent(MultithreadingActivity.this,AboutUs_Activity.class);
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
            Intent i = new Intent(MultithreadingActivity.this,Settings_Activity.class);
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
