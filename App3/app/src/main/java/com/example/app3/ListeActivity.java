package com.example.app3;

import android.preference.PreferenceActivity;
import android.os.Bundle;
import android.preference.PreferenceFragment;
public class ListeActivity extends PreferenceActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//setContentView(R.layout.activity_activity_pref);
//addPreferencesFromResource(R.xml.pref);
        getFragmentManager().beginTransaction().replace(android.R.id.content,
                new NotreFragment()).commit();
    }
    public static class NotreFragment extends PreferenceFragment{
        @Override
        public void onCreate(final Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            addPreferencesFromResource(R.xml.pref);
        }
    }
}