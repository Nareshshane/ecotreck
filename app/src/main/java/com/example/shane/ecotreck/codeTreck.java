package com.example.shane.ecotreck;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class codeTreck extends AppCompatActivity {


    public Button i;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_treck);
        i= findViewById(R.id.but2);
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri= Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLScPi0EivyrdWhRqYIhLTeVtUTuqivC9rDEoPZiQv9iuvWis_A/viewform?usp=sf_link"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });
    }
}
