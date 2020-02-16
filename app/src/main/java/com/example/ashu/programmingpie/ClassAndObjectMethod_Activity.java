package com.example.ashu.programmingpie;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ClassAndObjectMethod_Activity extends AppCompatActivity {
    Button btnClassBasics;
    Button btnClassObject;
    Button btnConstructor;
    Button btnMethodOverloading;
    Button btnMethodOverridig;
    Button btnStaticKeyword;
    Button btnInheritance;
    Button btnTypesOfInheritance;
    Button btnFinalKeyword;
    Button btnAbstraction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_and_object_method_);

        btnClassBasics = (Button)findViewById(R.id.btnClasses);
        btnClassObject = (Button)findViewById(R.id.btnClass_Objects);
        btnConstructor = (Button)findViewById(R.id.btnConstructors);
        btnMethodOverloading = (Button)findViewById(R.id.btnMethodOverloading);
        btnMethodOverridig = (Button)findViewById(R.id.btnMethodOverriding);
        btnStaticKeyword = (Button)findViewById(R.id.btnStaticKeywords);
        btnInheritance = (Button)findViewById(R.id.btnInheritance);
        btnTypesOfInheritance = (Button)findViewById(R.id.btnTypesOfInheritance);
        btnFinalKeyword = (Button)findViewById(R.id.btnFinalKeyword);
        btnAbstraction = (Button)findViewById(R.id.btnAbstraction);
        final MediaPlayer mp = MediaPlayer.create(this,R.raw.sample);

        btnClassBasics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i = new Intent(ClassAndObjectMethod_Activity.this,ClassesBasics_Activity.class);
                startActivity(i);
            }
        });
        btnClassObject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i = new Intent(ClassAndObjectMethod_Activity.this,Class_Objects_Activity.class);
                startActivity(i);
            }
        });
        btnConstructor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i = new Intent(ClassAndObjectMethod_Activity.this,Constructor_Activity.class);
                startActivity(i);
            }
        });
        btnMethodOverloading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i = new Intent(ClassAndObjectMethod_Activity.this,Method_Overloading_Activity.class);
                startActivity(i);
            }
        });
        btnMethodOverridig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i = new Intent(ClassAndObjectMethod_Activity.this,Method_Overriding_Acivity.class);
                startActivity(i);
            }
        });
        btnStaticKeyword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i = new Intent(ClassAndObjectMethod_Activity.this,StaticKeywords_Activity.class);
                startActivity(i);
            }
        });
        btnInheritance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i = new Intent(ClassAndObjectMethod_Activity.this,Inheritance_Activity.class);
                startActivity(i);

            }
        });
        btnTypesOfInheritance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i = new Intent(ClassAndObjectMethod_Activity.this,Type_Of_Inheritance_Activity.class);
                startActivity(i);
            }
        });
        btnFinalKeyword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i = new Intent(ClassAndObjectMethod_Activity.this,Final_Keyword_Activity.class);
                startActivity(i);
            }
        });
        btnAbstraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i = new Intent(ClassAndObjectMethod_Activity.this,Abstraction_Activity.class);
                startActivity(i);
            }
        });
    }
    public void btnAbout(){
        Intent i = new Intent(ClassAndObjectMethod_Activity.this,AboutUs_Activity.class);
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
            Intent i = new Intent(ClassAndObjectMethod_Activity.this,Settings_Activity.class);
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
