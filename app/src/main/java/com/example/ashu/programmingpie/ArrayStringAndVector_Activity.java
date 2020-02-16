package com.example.ashu.programmingpie;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ArrayStringAndVector_Activity extends AppCompatActivity {
     Button btnArrays;
     Button btnStrings;
     Button btnVectors;
     Button btnWrapperClass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_string_and_vector_);

        btnArrays = (Button)findViewById(R.id.btnArrays);
        btnStrings = (Button)findViewById(R.id.btnString);
        btnVectors= (Button)findViewById(R.id.btnVectors);
        btnWrapperClass = (Button)findViewById(R.id.btnWrapperClass);
        final MediaPlayer mp = MediaPlayer.create(this,R.raw.sample);

        btnArrays.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i = new Intent(ArrayStringAndVector_Activity.this,Arrays_Activity.class);
                startActivity(i);
            }
        });
        btnStrings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i = new Intent(ArrayStringAndVector_Activity.this,Strings_Activity.class);
                startActivity(i);
            }
        });
        btnVectors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i = new Intent(ArrayStringAndVector_Activity.this,Vectors_Activity.class);
                startActivity(i);
            }
        });
        btnWrapperClass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i = new Intent(ArrayStringAndVector_Activity.this,WrapperClass_Activity.class);
                startActivity(i);
            }
        });
    }
    public void btnAbout(){
        Intent i = new Intent(ArrayStringAndVector_Activity.this,AboutUs_Activity.class);
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
            Intent i = new Intent(ArrayStringAndVector_Activity.this,Settings_Activity.class);
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
