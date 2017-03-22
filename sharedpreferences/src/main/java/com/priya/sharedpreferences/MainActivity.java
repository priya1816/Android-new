package com.priya.sharedpreferences;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getCanonicalName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSave(View view) {
        final SharedPreferences prefs = getSharedPreferences("my",MODE_PRIVATE);
        final SharedPreferences.Editor editor = prefs.edit();
        editor.putString("myname","priya");
        editor.putInt("my age",9);
        editor.putFloat("sal",45);
        editor.apply();

    }

    public void onRetrive(View view) {
        final SharedPreferences prefs = getSharedPreferences("my",MODE_PRIVATE);
        String name = prefs.getString("myname","none");
        int age = prefs.getInt("age",3);
        float sal = prefs.getFloat("sal",10);
        Log.i(TAG, "Name - "+name +" Age - "+age + " Sal - "+sal);
    }
}
