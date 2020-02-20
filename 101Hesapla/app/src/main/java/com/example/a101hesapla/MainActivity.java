package com.example.a101hesapla;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity{


    private Button esli101;
    private Button tekli101;
    private Button nasilOynanir;
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nasilOynanir=(Button)findViewById(R.id.nasilOynanir);
        nasilOynanir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder uyarıMesaji = new AlertDialog.Builder(context);
                uyarıMesaji.setTitle("Nasıl Oynanır? ");
                uyarıMesaji.setMessage("Uygulamamızda 101 oyunu için EŞLİ ve TEKLİ olmak üzere 2 farklı skor ekranı vardır. Toplam 11 " +
                        "setten oluşan skor tablolarını açmak için grup veya kişi isimlerini girmek zorunludur. Oyunda elde edilen skorları" +
                        " her set için girebilirsiniz. Ceza durumlarında CEZA VER botunundaki işlemlerden birini seçerek ceza puanı da ekleyebilirsiniz." +
                        " Her ceza verilmesinin ardından HESAPLA butonuna tıklamanız gerekmektedir. Oyun bittiğinde oyun sonucunu görmek için ise OYUN BİTİR butonuna tıklamanız yeterli olacaktır." +
                        " Oyun bitir butonu ise hesapla butonuna ilk tıklanıldığı zaman aktifleşecektir." +
                        " \n\nİyi eğlenceler! ");
                uyarıMesaji.setIcon(R.drawable.dusunenemoji);
                uyarıMesaji.setPositiveButton("Tamam", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.dismiss();
                    }
                });
                AlertDialog alertDialog = uyarıMesaji.create();
                alertDialog.show();
            }
        });

        esli101=(Button) findViewById(R.id.esli101btn);
        tekli101=(Button)findViewById(R.id.tekli101);

        esli101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gecisYap = new Intent(MainActivity.this, esli101ayar.class);//yani diyor ki esli101ayar clasına git
                startActivity(gecisYap);//bu sayfa geçişi için
            }
        });

        tekli101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gecisyap = new Intent(MainActivity.this, tekli101ayar.class);
                startActivity(gecisyap);
            }
        });


    }
}
