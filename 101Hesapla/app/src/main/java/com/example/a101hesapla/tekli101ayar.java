package com.example.a101hesapla;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class tekli101ayar extends AppCompatActivity {

    private Button kaydetdevamet;
    private EditText oyuncu1,oyuncu2,oyuncu3,oyuncu4;
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tekli101ayar);

        oyuncu1=(EditText)findViewById(R.id.oyuncu1);
        oyuncu2=(EditText)findViewById(R.id.oyuncu2);
        oyuncu3=(EditText)findViewById(R.id.oyuncu3);
        oyuncu4=(EditText)findViewById(R.id.oyuncu4);

        kaydetdevamet=(Button) findViewById(R.id.oyuncukaydet);

        kaydetdevamet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(oyuncu1.getText().toString().equals("") || oyuncu2.getText().toString().equals("") || oyuncu3.getText().toString().equals("") || oyuncu4.getText().toString()
                .equals(""))
                {
                    AlertDialog.Builder uyarıMesaji = new AlertDialog.Builder(context);
                    uyarıMesaji.setTitle("Uyarı Mesajı !");
                    uyarıMesaji.setMessage("Oyuncu İsimleri Boş Geçilemez.");
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
                    Intent gecisYap = new Intent(tekli101ayar.this, tekli101.class);
                    gecisYap.putExtra("oyuncuisim1",oyuncu1.getText().toString());
                    gecisYap.putExtra("oyuncuisim2",oyuncu2.getText().toString());
                    gecisYap.putExtra("oyuncuisim3",oyuncu3.getText().toString());
                    gecisYap.putExtra("oyuncuisim4",oyuncu4.getText().toString());
                    startActivity(gecisYap);

                }

            }
        });

    }
}
