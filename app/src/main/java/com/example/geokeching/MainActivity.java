package com.example.geokeching;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.yandex.mapkit.MapKitFactory;

public class MainActivity extends AppCompatActivity {
Button bt_GoToMAp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MapKitFactory.setApiKey("6606b5ff-4e85-43c8-8471-fb36f7c87329");
        bt_GoToMAp=findViewById(R.id.bt_GoToMap);

    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bt_GoToMap:
                Intent intent=new Intent(MainActivity.this,Map.class);
                startActivity(intent); break;
        }
    }
}