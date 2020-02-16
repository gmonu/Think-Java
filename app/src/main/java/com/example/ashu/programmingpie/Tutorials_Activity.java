package com.example.ashu.programmingpie;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Tutorials_Activity extends AppCompatActivity {

      Button intro_btn;
      Button setup_And_BasicProgram;
      Button Variables_And_DataTypes;
      Button Operators_And_Expression;
      Button Flow_Control;
      Button Classes_And_Object;
      Button Arrays_And_String;
      Button Interface;
      Button Packages;
      Button Multithreaded_Programming;
      Button Errors_And_Exception;
      Button btnApplet;
      Button File_Management;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorials_);


        intro_btn = (Button)findViewById(R.id.intro_button);
        setup_And_BasicProgram = (Button)findViewById(R.id.setup_button);
        Variables_And_DataTypes = (Button)findViewById(R.id.Variable_button);
        Operators_And_Expression = (Button)findViewById(R.id.operators_button);
        Flow_Control = (Button)findViewById(R.id.flowControl_button);
        Classes_And_Object = (Button)findViewById(R.id.class_button);
        Arrays_And_String = (Button)findViewById(R.id.array_button);
        Interface = (Button)findViewById(R.id.Interface_button);
        Packages = (Button)findViewById(R.id.packages_button);
        Multithreaded_Programming = (Button)findViewById(R.id.multithreading_button);
        Errors_And_Exception = (Button)findViewById(R.id.Errors_button);
        btnApplet =  (Button)findViewById(R.id.btnApplet);
        File_Management = (Button)findViewById(R.id.file_button);
        final MediaPlayer mp = MediaPlayer.create(this,R.raw.sample);  // this for sound on clicl button



        intro_btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp.start();
                        Intent intent = new Intent(Tutorials_Activity.this,Introdution_activity.class);
                        startActivity(intent);
                    }
                }
        );
        setup_And_BasicProgram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i = new Intent(Tutorials_Activity.this,SetupActivity.class);
                startActivity(i);
            }
        });
        Variables_And_DataTypes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i = new Intent(Tutorials_Activity.this,VariablesActivity.class);
                startActivity(i);
            }
        });
        Operators_And_Expression.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i = new Intent(Tutorials_Activity.this,Operators_And_ExpressionActivity.class);
                startActivity(i);
            }
        });

        Flow_Control.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i = new Intent(Tutorials_Activity.this,FlowControl_Activity.class);
                startActivity(i);

            }
        });
        Classes_And_Object.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i = new Intent(Tutorials_Activity.this,ClassAndObjectMethod_Activity.class);
                startActivity(i);

            }
        });

        Arrays_And_String.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i = new Intent(Tutorials_Activity.this,ArrayStringAndVector_Activity.class);
                startActivity(i);
            }
        });
        Interface.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i = new Intent(Tutorials_Activity.this,Interface_Activity.class);
                startActivity(i);

            }
        });
               Multithreaded_Programming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i = new Intent(Tutorials_Activity.this,MultithreadingActivity.class);
                startActivity(i);

            }
        });

        Errors_And_Exception.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i = new Intent(Tutorials_Activity.this,ErrorAndExceptions_Activity.class);
                startActivity(i);
            }
        });

        btnApplet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i = new Intent(Tutorials_Activity.this,Applet_Activity.class);
                startActivity(i);
            }
        });

        File_Management.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i = new Intent(Tutorials_Activity.this,FileManagement_Activity.class);
                startActivity(i);

            }
        });


    }


    public void btnAbout(){
        Intent i = new Intent(Tutorials_Activity.this,AboutUs_Activity.class);
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
            Intent i = new Intent(Tutorials_Activity.this,Settings_Activity.class);
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
