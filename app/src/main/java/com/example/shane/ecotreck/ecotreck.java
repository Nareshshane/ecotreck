package com.example.shane.ecotreck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.view.View;

import payumoney.payu.com.payumoneysdkapp.MyActivity;

public class ecotreck extends AppCompatActivity {
    public CardView i,j,k,l,m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecotreck);
        i=(CardView) findViewById(R.id.card1);
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ecotreck.this, codeTreck.class);
                intent.putExtra("userurl", false );
                startActivity(intent);
            }
        });
        j=(CardView) findViewById(R.id.card2);
        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ecotreck.this, openHack.class);
                intent.putExtra("userurl", false );
                startActivity(intent);

            }
        });
        k=(CardView) findViewById(R.id.card3);
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ecotreck.this, OutOfBox.class);
                intent.putExtra("userurl", false );
                startActivity(intent);
            }
        });
        l=(CardView) findViewById(R.id.card4);
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ecotreck.this, codeTravel.class);
                intent.putExtra("userurl", false );
                startActivity(intent);
            }
        });
        m=(CardView) findViewById(R.id.card5);
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ecotreck.this, MyActivity.class);
                intent.putExtra("userurl", false );
                startActivity(intent);
            }
        });


    }
}


