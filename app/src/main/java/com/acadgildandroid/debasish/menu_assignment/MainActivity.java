package com.acadgildandroid.debasish.menu_assignment;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView txtview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


       if(item.getItemId()==R.id.menu_red){


           txtview=(TextView)findViewById(R.id.txtview);
           Toast.makeText(this,"RED",Toast.LENGTH_SHORT).show();
           txtview.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#FF0000")));
       }
       else if(item.getItemId()==R.id.menu_blue){

           txtview=(TextView)findViewById(R.id.txtview);
           Toast.makeText(this,"BLUE",Toast.LENGTH_SHORT).show();
           txtview.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#0000FF")));
       }
        else if(item.getItemId()==R.id.menu_green){

           txtview=(TextView)findViewById(R.id.txtview);
           Toast.makeText(this,"GREEN",Toast.LENGTH_SHORT).show();
           txtview.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#008000")));

       }

                 return super.onOptionsItemSelected(item);



    }
}
