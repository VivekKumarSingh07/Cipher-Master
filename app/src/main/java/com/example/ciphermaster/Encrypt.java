package com.example.ciphermaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Encrypt extends AppCompatActivity {

    String title;
    TextView encryptedText;
    EditText plainText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.encrypt);

        Intent intent = getIntent();
        title = intent.getStringExtra("Title");
        setTitle(title);

        plainText = findViewById(R.id.plain_text);
        button = findViewById(R.id.button);
        encryptedText = findViewById(R.id.cipher_text);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = plainText.getText().toString();
                String cipherText = EncryptionAlgorithms.getEncryptedMessgae(message, title);
                if (cipherText != "") {
                    encryptedText.setText(cipherText);
                    encryptedText.setVisibility(View.VISIBLE);
                }
                Toast.makeText(Encrypt.this, "You did some mischief", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
