package com.example.app3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onMainClickManager(View v){
        switch(v.getId()){
            case R.id.bt_main_children:
                Toast.makeText(getApplicationContext(),"Clic sur bt: ==> Enfant", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
