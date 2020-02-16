package com.example.ashu.programmingpie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreenActivity extends AppCompatActivity {
            ImageView iconImage;
            TextView programmingPie,java_tutorials;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        iconImage = (ImageView)findViewById(R.id.JavaImage);
        programmingPie = (TextView) findViewById(R.id.programmingPie);
        java_tutorials = (TextView)findViewById(R.id.java_Tutorials);

        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.mytransition);
        iconImage.setAnimation(myanim);
        java_tutorials.setAnimation(myanim);
        programmingPie.setAnimation(myanim);

        final Intent i = new Intent(SplashScreenActivity.this,MainActivity.class);
          Thread timer = new Thread(){
              public void run()
              {
                  try{
                      sleep(5000);
                  }catch (InterruptedException e){
                      e.printStackTrace();
                  }
                  finally {
                      startActivity(i);
                      finish();
                  }
              }
          };
          timer.start();
    }

}
