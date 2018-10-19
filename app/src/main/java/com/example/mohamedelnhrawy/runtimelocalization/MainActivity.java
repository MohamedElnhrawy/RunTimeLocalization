package com.example.mohamedelnhrawy.runtimelocalization;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Settings(View view) {
        startActivity(new Intent(MainActivity.this,SettingsActivity.class));
    }
}
