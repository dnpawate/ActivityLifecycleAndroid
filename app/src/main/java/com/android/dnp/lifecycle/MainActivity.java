package com.android.dnp.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("tag", "onCreate: ");
        Toast.makeText(this,"Oncreate called",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("tag", "onStart: ");
        Toast.makeText(this,"OnStart called",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("tag", "onStop: ");
        Toast.makeText(this,"OnStop called",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("tag", "onResume: ");
        Toast.makeText(this,"OnResume called",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("tag", "onRestart: ");
        Toast.makeText(this,"OnRestart called",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("tag", "onPause: ");
        Toast.makeText(this,"OnPause called",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("tag", "onDestroy: ");
        Toast.makeText(this,"OnDestroy called",Toast.LENGTH_SHORT).show();
    }


}
