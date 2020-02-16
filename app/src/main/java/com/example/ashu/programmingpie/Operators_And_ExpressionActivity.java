package com.example.ashu.programmingpie;


import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Operators_And_ExpressionActivity extends AppCompatActivity {
     Button btnExpression;
     Button btnOperators;
     Button btnOpPrecedence;
     Button btnKeywords;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operators__and__expression);

        btnOperators = (Button)findViewById(R.id.btnOperators);
        btnExpression = (Button)findViewById(R.id.btnExpression);
        btnOpPrecedence = (Button)findViewById(R.id.btnopPrecedence);
        btnKeywords = (Button)findViewById(R.id.btnKeywords);
        final MediaPlayer mp = MediaPlayer.create(this,R.raw.sample);


        btnOperators.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i= new Intent(Operators_And_ExpressionActivity.this,Operators_Activity.class);
                startActivity(i);
            }
        });
        btnExpression.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i = new Intent(Operators_And_ExpressionActivity.this,ExpressionActivity.class);
                startActivity(i);
            }
        });
        btnOpPrecedence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i = new Intent(Operators_And_ExpressionActivity.this,Operator_Precedence_Activity.class);
                startActivity(i);
            }
        });

        btnKeywords.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent i = new Intent(Operators_And_ExpressionActivity.this,KeywordsActivity.class);
                startActivity(i);

            }
        });

    }
    public void btnAbout(){
        Intent i = new Intent(Operators_And_ExpressionActivity.this,AboutUs_Activity.class);
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
            Intent i = new Intent(Operators_And_ExpressionActivity.this,Settings_Activity.class);
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
