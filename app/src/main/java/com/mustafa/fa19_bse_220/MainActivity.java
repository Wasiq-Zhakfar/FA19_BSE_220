package com.mustafa.fa19_bse_220;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button addRecord = findViewById(R.id.btnAdd);




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnClick(View v){
        addRecord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
            }
        });replaceFragment (new addRecord());
    }

    private void replaceFragment(com.mustafa.fa19_bse_220.addRecord addRecord) {
    }


}