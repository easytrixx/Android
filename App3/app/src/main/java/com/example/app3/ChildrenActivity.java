package com.example.app3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
public class ChildrenActivity extends AppCompatActivity {
    EditText et_children_login;
    EditText et_children_pwd;
    EditText et_children_email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_children);
        et_children_login = (EditText)findViewById(R.id.et_children_login);
        et_children_pwd = (EditText)findViewById(R.id.et_children_pwd);
        et_children_email = (EditText)findViewById(R.id.et_children_email);
    }
    public void onChildrenClickManager(View v) {
        switch (v.getId()) {
            case R.id.bt_children_main:
                Toast.makeText(getApplicationContext(),"Login: "+et_children_login.getText()+"\n"+
                        "Password: "+et_children_pwd.getText()+"\n"+"email: "
                        +et_children_email.getText(),Toast.LENGTH_SHORT).show();
                break;
        }
    }
}

