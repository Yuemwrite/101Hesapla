package com.example.a101hesapla;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;


public class esli101 extends AppCompatActivity {

    private EditText g11,g12,g13,g14,g15,g16,g17,g18,g19,g110,g111;
    private EditText g21,g22,g23,g24,g25,g26,g27,g28,g29,g210,g211;
    private TextView g1toplam, g2toplam;
    private Button skorHesapla, oyunBitir, cezaVer, cezaVer2;
    private TextView grup1Ad, grup2Ad;
    List <Integer> grup1Liste = new ArrayList<>();
    List<Integer> grup2Liste = new ArrayList<>();
    int grup1Toplam=0;
    int grup2Toplam=0;
    Context context = this;

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.esli101);

        grup1Ad=(TextView)findViewById(R.id.grup1Ad);
        grup2Ad=(TextView)findViewById(R.id.grup2Ad);

        grup1Ad.setText(getIntent().getExtras().getString("grupisim1"));
        grup2Ad.setText(getIntent().getExtras().getString("grupisim2"));

        g11 = (EditText)findViewById(R.id.g11);
        g12 = (EditText)findViewById(R.id.g12);
        g13 = (EditText)findViewById(R.id.g13);
        g14 = (EditText)findViewById(R.id.g14);
        g15 = (EditText)findViewById(R.id.g15);
        g16 = (EditText)findViewById(R.id.g16);
        g17 = (EditText)findViewById(R.id.g17);
        g18 = (EditText)findViewById(R.id.g18);
        g19 = (EditText)findViewById(R.id.g19);
        g110 = (EditText)findViewById(R.id.g110);
        g111 = (EditText)findViewById(R.id.g111);

        g21 = (EditText)findViewById(R.id.g21);
        g22 = (EditText)findViewById(R.id.g22);
        g23 = (EditText)findViewById(R.id.g23);
        g24 = (EditText)findViewById(R.id.g24);
        g25 = (EditText)findViewById(R.id.g25);
        g26 = (EditText)findViewById(R.id.g26);
        g27 = (EditText)findViewById(R.id.g27);
        g28 = (EditText)findViewById(R.id.g28);
        g29 = (EditText)findViewById(R.id.g29);
        g210 = (EditText)findViewById(R.id.g210);
        g211 = (EditText)findViewById(R.id.g211);

        g1toplam=(TextView)findViewById(R.id.grup1ToplamPuan);
        g2toplam=(TextView)findViewById(R.id.grup2ToplamPuan);

        skorHesapla=(Button)findViewById(R.id.SkorHesapla);
        oyunBitir=(Button)findViewById(R.id.OyunBitir);



        skorHesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                grup1Toplam=0;
                grup2Toplam=0;
                oyunBitir.setVisibility(View.VISIBLE);
                 int g1deger = Integer.parseInt(g11.getText().toString());
                 int g12deger = Integer.parseInt(g12.getText().toString());
                 int g13deger = Integer.parseInt(g13.getText().toString());
                 int g14deger = Integer.parseInt(g14.getText().toString());
                 int g15deger = Integer.parseInt(g15.getText().toString());
                 int g16deger = Integer.parseInt(g16.getText().toString());
                 int g17deger = Integer.parseInt(g17.getText().toString());
                 int g18deger = Integer.parseInt(g18.getText().toString());
                 int g19deger = Integer.parseInt(g19.getText().toString());
                 int g110deger = Integer.parseInt(g110.getText().toString());
                 int g111deger = Integer.parseInt(g111.getText().toString());

                for(int i=0;i<grup1Liste.size();i++)
                {
                    grup1Toplam=grup1Toplam+ grup1Liste.get(i);
                }

                int toplam=g1deger+g12deger+g13deger+g14deger+g15deger+g16deger+g17deger+g18deger+g19deger+g110deger+g111deger+grup1Toplam;



                 g1toplam.setText(Integer.toString(toplam));

                   int g21deger = Integer.parseInt(g21.getText().toString());
                   int g22deger = Integer.parseInt(g22.getText().toString());
                   int g23deger = Integer.parseInt(g23.getText().toString());
                   int g24deger = Integer.parseInt(g24.getText().toString());
                   int g25deger = Integer.parseInt(g25.getText().toString());
                   int g26deger = Integer.parseInt(g26.getText().toString());
                   int g27deger = Integer.parseInt(g27.getText().toString());
                   int g28deger = Integer.parseInt(g28.getText().toString());
                   int g29deger = Integer.parseInt(g29.getText().toString());
                   int g210deger = Integer.parseInt(g210.getText().toString());
                   int g211deger = Integer.parseInt(g211.getText().toString());

                   for(int i=0; i<grup2Liste.size();i++)
                   {
                       grup2Toplam=grup2Toplam+grup2Liste.get(i);
                   }

                   int toplam2 = g21deger+g22deger+g23deger+g24deger+g25deger+g26deger+g27deger+g28deger+g29deger+g210deger+g211deger+grup2Toplam;

                   g2toplam.setText(Integer.toString(toplam2));

            }
        });

        cezaVer=(Button)findViewById(R.id.g1Ceza);
        cezaVer2=(Button)findViewById(R.id.g2Ceza);


        oyunBitir.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {


                int g1Toplam=Integer.parseInt(g1toplam.getText().toString());
                int g2Toplam=Integer.parseInt(g2toplam.getText().toString());

                if(g1Toplam>g2Toplam)
                {
                    AlertDialog.Builder uyarıMesaji = new AlertDialog.Builder(context);
                    uyarıMesaji.setTitle("Oyun Bitti! Tebrikler " + grup2Ad.getText().toString());
                    uyarıMesaji.setMessage("Kazanan Takım: " + grup2Ad.getText().toString());
                    uyarıMesaji.setIcon(R.drawable.tebrikleremoji);
                    uyarıMesaji.setPositiveButton("Tamam", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                            finish();
                        }
                    });
                    AlertDialog alertDialog = uyarıMesaji.create();
                    alertDialog.show();
                }

                else if(g1Toplam<g2Toplam)
                {
                    AlertDialog.Builder uyarıMesaji = new AlertDialog.Builder(context);
                    uyarıMesaji.setTitle("Oyun Bitti! Tebrikler \n " + grup1Ad.getText().toString());
                    uyarıMesaji.setMessage("Kazanan Takım: " + grup1Ad.getText().toString());
                    uyarıMesaji.setIcon(R.drawable.tebrikleremoji);
                    uyarıMesaji.setPositiveButton("Tamam", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                            finish();
                        }
                    });
                    AlertDialog alertDialog = uyarıMesaji.create();
                    alertDialog.show();
                }
                else
                {
                    AlertDialog.Builder uyarıMesaji = new AlertDialog.Builder(context);
                    uyarıMesaji.setTitle("Oyun Bitti");
                    uyarıMesaji.setMessage("Kazanan Yok. Oyun Berabere");
                    uyarıMesaji.setIcon(R.drawable.tebrikleremoji);
                    uyarıMesaji.setPositiveButton("Tamam", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                            finish();
                        }
                    });
                    AlertDialog alertDialog = uyarıMesaji.create();
                    alertDialog.show();
                }
            }
        });


    }

    public void cezaEkle(View v)
    {
        if(g1toplam.getText().equals(""))
            g1toplam.setText("0");
        final PopupMenu popupmenu = new PopupMenu(getApplicationContext(), cezaVer);
        popupmenu.getMenuInflater().inflate(R.menu.popup_menu,popupmenu.getMenu());
        popupmenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {

            int isler=101;
            int okey=101;
            int yanlisel=101;
            int okeyialindi=101;
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId())
                {
                    case R.id.isler1:
                        grup1Liste.add(isler);
                        //g1toplam.setText((Integer.parseInt(g1toplam.getText().toString())  + isler) + "");
                        return true;
                    case R.id.okey1:
                        grup1Liste.add(okey);
                        //g1toplam.setText((Integer.parseInt(g1toplam.getText().toString())  + okey) + "");
                        return true;
                    case R.id.yanlisel1:
                        grup1Liste.add(yanlisel);
                        //g1toplam.setText((Integer.parseInt(g1toplam.getText().toString())  + yanlisel) + "");
                        return true;
                    case R.id.okeyialindi:
                        grup1Liste.add(okeyialindi);
                        return true;
                }
                return false;
            }
        });
        popupmenu.show();
    }



    public void cezaEkle2(View v)
    {
        if(g2toplam.getText().equals(""))
            g2toplam.setText("0");
        final PopupMenu popupmenu = new PopupMenu(getApplicationContext(), cezaVer2);
        popupmenu.getMenuInflater().inflate(R.menu.popup_menu,popupmenu.getMenu());
        popupmenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {

            int isler=101;
            int okey=101;
            int yanlisel=101;
            int okeyialindi=101;
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.isler1:
                        grup2Liste.add(isler);
                        //g2toplam.setText((Integer.parseInt(g2toplam.getText().toString()) + isler) + "");
                        return true;
                    case R.id.okey1:
                        grup2Liste.add(okey);
                       // g2toplam.setText((Integer.parseInt(g2toplam.getText().toString()) + okey) + "");
                        return true;
                    case R.id.yanlisel1:
                        grup2Liste.add(yanlisel);
                        //g2toplam.setText((Integer.parseInt(g2toplam.getText().toString()) + yanlisel) + "");
                        return true;
                    case R.id.okeyialindi:
                        grup2Liste.add(okeyialindi);
                        return true;
                }

                return false;
            }
        });
        popupmenu.show();
    }


}
