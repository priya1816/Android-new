package com.priya.intentandintentfilters;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startNew(View view) {
        concept();

    }

    private void concept(){
        Intent intent = new Intent();
        intent.setAction("com.priya.action.COMMON");
        intent.addCategory("com.priya.category.INFO");
        intent.setData(Uri.parse("http://google.com"));
        startActivity(intent);
    }

    private void dial() {
                startActivity(new Intent(Intent.ACTION_DIAL));

    }
    private void call(){
        Intent intent = new Intent();
        intent.setData(Uri.parse("tel://9999999999"));
        startActivity(intent);

    }

}
