package com.example.ciphermaster;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import javax.crypto.Cipher;

public class MainActivity extends AppCompatActivity {

    List<Information> cipherList;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        cipherList = new ArrayList<>();

        cipherList.add(new Information("Caesar's Cipher", "rotate by 3 places"));
        cipherList.add(new Information("ROT13 Cipher", "rotate by 13 places"));
        cipherList.add(new Information("Null Cipher", "first letter of each word"));
        cipherList.add(new Information("Atbash Cipher", "maps characters to other"));

        CipherAdapter adapter = new CipherAdapter(this, cipherList);
        recyclerView.setAdapter(adapter);
    }
}
