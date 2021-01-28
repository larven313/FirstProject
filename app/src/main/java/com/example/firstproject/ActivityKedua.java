package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ActivityKedua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        TextView tv = findViewById(R.id.tv_text);
        TextView alm = findViewById(R.id.tv_text2);

        Bundle ambil = getIntent().getExtras();
        if (ambil == null){
            return;
        }
        //get data via the key
        String nama = ambil.getString("nama_key");
        String alamat = ambil.getString("alamat_key");
        if (nama != null){
            tv.setText(nama);
        }

        if (ambil == null){
            return;
        }
        if (alamat != null){
            alm.setText(alamat);
        }
        if (ambil == null){
            return;
        }
    }
}