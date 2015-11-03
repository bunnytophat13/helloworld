package com.example.jchuah.myapplication;

import android.content.Intent;
import android.os.Debug;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    static String tag = "com.example.jchuah.myapplication.MainActivity";


            Bundle sendBundle = new Bundle();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }





    public void onNextClick(View source){
        //Toast.makeText(this, "Howdy", Toast.LENGTH_LONG ).show();
        Log.d("LOLOLOL", "Next button clicked");
        Log.i(tag, "Launching Color Activity");
        Intent colorActivityIntent = new Intent (this, Main2Activity.class);

        sendBundle.putString("name", "Tom");

        colorActivityIntent.putExtra("groceries", sendBundle);

        startActivity (colorActivityIntent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
