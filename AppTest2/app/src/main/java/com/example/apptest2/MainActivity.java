package com.example.apptest2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Mon projet ","-> méthode onCreate");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.i("Mon projet"," -> méthode onStart");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i("Mon projet","-> méthode onRestart");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i("Mon projet","-> méthode onResume");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i("Mon projet"," -> méthode onPause");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("Mon projet ","-> méthode onDestroy");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i("Mon projet ","-> méthode onStop");
    }
}
