package com.example.a101hesapla;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class esli101ayar extends AppCompatActivity {

    private Button kaydetdevamet;
    private TextView grup1,grup2;
    Context context=this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.esli101ayar);

        kaydetdevamet=(Button)findViewById(R.id.oyuncukaydet);
        grup1=(TextView)findViewById(R.id.grup1Ad);
        grup2=(TextView)findViewById(R.id.grup2Ad);

        kaydetdevamet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(grup1.getText().toString().equals("") || grup2.getText().toString().equals(""))
                {
                    AlertDialog.Builder uyarıMesaji = new AlertDialog.Builder(context);
                    uyarıMesaji.setTitle("Uyarı Mesajı !");
                    uyarıMesaji.setMessage("Grup İsimleri Boş Geçilemez.");
                    uyarıMesaji.setIcon(R.drawable.stopemoji);
                    uyarıMesaji.setPositiveButton("Tamam", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
                    AlertDialog alertDialog = uyarıMesaji.create();
                    alertDialog.show();
                }
                else
                {
                    Intent gecisYap = new Intent(esli101ayar.this, esli101.class);
                    gecisYap.putExtra("grupisim1",grup1.getText().toString());
                    gecisYap.putExtra("grupisim2",grup2.getText().toString());
                    startActivity(gecisYap);
                }
            }
        });

    }
}

