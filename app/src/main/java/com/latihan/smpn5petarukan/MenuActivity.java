package com.latihan.smpn5petarukan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {
    ImageView IvProfil;
    ImageView IvGurudanstaf;
    ImageView IvGaleri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        IvProfil=findViewById(R.id.iv_profil);
        IvGurudanstaf=findViewById(R.id.iv_gurudanstaf);
        IvGaleri=findViewById(R.id.iv_galeri);


        IvProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MenuActivity.this,ProfilActivity.class);
                startActivity(intent);
            }
        });

        IvGurudanstaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MenuActivity.this,GurudanstafActivity.class);
                startActivity(intent);
            }
        });

        IvGaleri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this,GaleriActivity.class);
                startActivity(intent);
            }
        });




    }
}