package com.example.ashu.programmingpie;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class FileManagement_Activity extends AppCompatActivity {
    Button btnSteamClass;
    Button btnByteStream;
    Button btnCharacterStream;
    Button btnStandarStream;
    Button btnFile;
    Button btnDirectory;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file_management_);

        btnSteamClass = (Button)findViewById(R.id.btnStreamClass);
        btnByteStream = (Button)findViewById(R.id.btnByteStream);
        btnCharacterStream = (Button)findViewById(R.id.btnCharacterStream);
        btnStandarStream = (Button)findViewById(R.id.btnStandardStream);
        btnFile = (Button)findViewById(R.id.btnFile);
        btnDirectory = (Button)findViewById(R.id.btnDirectory);
        final MediaPlayer mp = MediaPlayer.create(this,R.raw.sample);

        btnSteamClass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i = new Intent(FileManagement_Activity.this,StreamClass_Activity.class);
                startActivity(i);
            }
        });
        btnByteStream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i = new Intent(FileManagement_Activity.this,ByteStream_Activiyt.class);
                startActivity(i);
            }
        });
        btnCharacterStream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i = new Intent(FileManagement_Activity.this,CharacterStream_Activity.class);
                startActivity(i);
            }
        });
        btnStandarStream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i = new Intent(FileManagement_Activity.this,StandardStream_Activity.class);
                startActivity(i);
            }
        });
        btnFile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i = new Intent(FileManagement_Activity.this,File_Activity.class);
                startActivity(i);
            }
        });
        btnDirectory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i = new Intent(FileManagement_Activity.this,Directory_Activity.class);
                startActivity(i);
            }
        });
    }


    public void btnAbout(){
        Intent i = new Intent(FileManagement_Activity.this,AboutUs_Activity.class);
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
            Intent i = new Intent(FileManagement_Activity.this,Settings_Activity.class);
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
