package com.glarimy.glarimy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void verify(View view){
        Log.e("Glarimy", "You have clicked the VERIFY button. Will verify!");
        Toast.makeText(this, "Great! You got it!", Toast.LENGTH_LONG).show();
    }
}
