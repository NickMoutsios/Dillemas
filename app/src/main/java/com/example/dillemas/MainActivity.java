package com.example.dillemas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Moving to next activity.
    public void goToCategories(View view) {
        Intent intent = new Intent(this,DisplayOptionsActivity.class);
        startActivity(intent);
    }

    //Exit application.
    public void exitGame(View view) {
        finish();
        System.exit(0);
    }
}
