package com.example.a101hesapla;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class tekli101 extends AppCompatActivity {

    private EditText o11,o12,o13,o14,o15,o16,o17,o18,o19,o110,o111;
    private EditText o21,o22,o23,o24,o25,o26,o27,o28,o29,o210,o211;
    private EditText o31,o32,o33,o34,o35,o36,o37,o38,o39,o310,o311;
    private EditText o41,o42,o43,o44,o45,o46,o47,o48,o49,o410,o411;
    private Button skorHesapla, oyunBitir;
    private TextView oyuncu1ToplamPuan,oyuncu2ToplamPuan,oyuncu3ToplamPuan,oyuncu4ToplamPuan;
    private Button oyuncu1Ceza,oyuncu2Ceza,oyuncu3Ceza,oyuncu4Ceza;
    private TextView oyuncu1Ad, oyuncu2Ad, oyuncu3Ad, oyuncu4Ad;
    List<Integer> oyuncu1 = new ArrayList<>();
    List<Integer> oyuncu2 = new ArrayList<>();
    List<Integer> oyuncu3 = new ArrayList<>();
    List<Integer> oyuncu4 = new ArrayList<>();
    Context context=this;
    int oyuncu1Toplam=0;
    int oyuncu2Toplam=0;
    int oyuncu3Toplam=0;
    int oyuncu4Toplam=0;


     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tekli101);

        o11 = (EditText)findViewById(R.id.o11);
        o12 = (EditText)findViewById(R.id.o12);
        o13 = (EditText)findViewById(R.id.o13);
        o14 = (EditText)findViewById(R.id.o14);
        o15 = (EditText)findViewById(R.id.o15);
        o16 = (EditText)findViewById(R.id.o16);
        o17 = (EditText)findViewById(R.id.o17);
        o18 = (EditText)findViewById(R.id.o18);
        o19 = (EditText)findViewById(R.id.o19);
        o110 = (EditText)findViewById(R.id.o110);
        o111 = (EditText)findViewById(R.id.o111);

        o21 = (EditText)findViewById(R.id.o21);
        o22 = (EditText)findViewById(R.id.o22);
        o23 = (EditText)findViewById(R.id.o23);
        o24 = (EditText)findViewById(R.id.o24);
        o25 = (EditText)findViewById(R.id.o25);
        o26 = (EditText)findViewById(R.id.o26);
        o27 = (EditText)findViewById(R.id.o27);
        o28 = (EditText)findViewById(R.id.o28);
        o29 = (EditText)findViewById(R.id.o29);
        o210 = (EditText)findViewById(R.id.o210);
        o211 = (EditText)findViewById(R.id.o211);

        o31=(EditText)findViewById(R.id.o31);
        o32=(EditText)findViewById(R.id.o32);
        o33=(EditText)findViewById(R.id.o33);
        o34=(EditText)findViewById(R.id.o34);
        o35=(EditText)findViewById(R.id.o35);
        o36=(EditText)findViewById(R.id.o36);
        o37=(EditText)findViewById(R.id.o37);
        o38=(EditText)findViewById(R.id.o38);
        o39=(EditText)findViewById(R.id.o39);
        o310=(EditText)findViewById(R.id.o310);
        o311=(EditText)findViewById(R.id.o311);

        o41=(EditText)findViewById(R.id.o41);
        o42=(EditText)findViewById(R.id.o42);
        o43=(EditText)findViewById(R.id.o43);
        o44=(EditText)findViewById(R.id.o44);
        o45=(EditText)findViewById(R.id.o45);
        o46=(EditText)findViewById(R.id.o46);
        o47=(EditText)findViewById(R.id.o47);
        o48=(EditText)findViewById(R.id.o48);
        o49=(EditText)findViewById(R.id.o49);
        o410=(EditText)findViewById(R.id.o410);
        o411=(EditText)findViewById(R.id.o411);

        oyuncu1Ad= (TextView)findViewById(R.id.oyuncu1Yeni);
        oyuncu2Ad= (TextView)findViewById(R.id.oyuncu2Yeni);
        oyuncu3Ad= (TextView)findViewById(R.id.oyuncu3Yeni);
        oyuncu4Ad= (TextView)findViewById(R.id.oyuncu4Yeni);

        oyuncu1Ad.setText(getIntent().getExtras().getString("oyuncuisim1"));
        oyuncu2Ad.setText(getIntent().getExtras().getString("oyuncuisim2"));
        oyuncu3Ad.setText(getIntent().getExtras().getString("oyuncuisim3"));
        oyuncu4Ad.setText(getIntent().getExtras().getString("oyuncuisim4"));

        oyunBitir=(Button)findViewById(R.id.tekliOyunBitir);
        skorHesapla=(Button)findViewById(R.id.TekliSkorHesapla);
        skorHesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oyuncu1Toplam=0;
                oyuncu2Toplam=0;
                oyuncu3Toplam=0;
                oyuncu4Toplam=0;
                oyunBitir.setVisibility(View.VISIBLE);
                int o11deger = Integer.parseInt(o11.getText().toString());
                int o12deger = Integer.parseInt(o12.getText().toString());
                int o13deger = Integer.parseInt(o13.getText().toString());
                int o14deger = Integer.parseInt(o14.getText().toString());
                int o15deger = Integer.parseInt(o15.getText().toString());
                int o16deger = Integer.parseInt(o16.getText().toString());
                int o17deger = Integer.parseInt(o17.getText().toString());
                int o18deger = Integer.parseInt(o18.getText().toString());
                int o19deger = Integer.parseInt(o19.getText().toString());
                int o110deger = Integer.parseInt(o110.getText().toString());
                int o111deger = Integer.parseInt(o111.getText().toString());

                for(int i=0;i<oyuncu1.size();i++)
                {
                    oyuncu1Toplam=oyuncu1Toplam+oyuncu1.get(i);
                }

                int o1Toplam=o11deger+o12deger+o13deger+o14deger+o15deger+o16deger+o17deger+o18deger+o19deger+o110deger+o111deger+oyuncu1Toplam;

                oyuncu1ToplamPuan=(TextView)findViewById(R.id.oyuncu1Skor);
                oyuncu1ToplamPuan.setText(Integer.toString(o1Toplam));

                int o21deger = Integer.parseInt(o21.getText().toString());
                int o22deger = Integer.parseInt(o22.getText().toString());
                int o23deger = Integer.parseInt(o23.getText().toString());
                int o24deger = Integer.parseInt(o24.getText().toString());
                int o25deger = Integer.parseInt(o25.getText().toString());
                int o26deger = Integer.parseInt(o26.getText().toString());
                int o27deger = Integer.parseInt(o27.getText().toString());
                int o28deger = Integer.parseInt(o28.getText().toString());
                int o29deger = Integer.parseInt(o29.getText().toString());
                int o210deger = Integer.parseInt(o210.getText().toString());
                int o211deger = Integer.parseInt(o211.getText().toString());

                for(int i=0;i<oyuncu2.size();i++)
                {
                    oyuncu2Toplam=oyuncu2Toplam+oyuncu2.get(i);
                }

                int o2Toplam=o21deger+o22deger+o23deger+o24deger+o25deger+o26deger+o27deger+o28deger+o29deger+o210deger+o211deger+oyuncu2Toplam;

                oyuncu2ToplamPuan=(TextView)findViewById(R.id.oyuncu2Skor);
                oyuncu2ToplamPuan.setText(Integer.toString(o2Toplam));

                int o31deger = Integer.parseInt(o31.getText().toString());
                int o32deger = Integer.parseInt(o32.getText().toString());
                int o33deger = Integer.parseInt(o33.getText().toString());
                int o34deger = Integer.parseInt(o34.getText().toString());
                int o35deger = Integer.parseInt(o35.getText().toString());
                int o36deger = Integer.parseInt(o36.getText().toString());
                int o37deger = Integer.parseInt(o37.getText().toString());
                int o38deger = Integer.parseInt(o38.getText().toString());
                int o39deger = Integer.parseInt(o39.getText().toString());
                int o310deger = Integer.parseInt(o310.getText().toString());
                int o311deger = Integer.parseInt(o311.getText().toString());

                for(int i=0;i<oyuncu3.size();i++)
                {
                    oyuncu3Toplam=oyuncu3Toplam+oyuncu3.get(i);
                }

                int o3Toplam=o31deger+o32deger+o33deger+o34deger+o35deger+o36deger+o37deger+o38deger+o39deger+o310deger+o311deger+oyuncu3Toplam;

                oyuncu3ToplamPuan=(TextView)findViewById(R.id.oyuncu3Skor);
                oyuncu3ToplamPuan.setText(Integer.toString(o3Toplam));

                int o41deger = Integer.parseInt(o41.getText().toString());
                int o42deger = Integer.parseInt(o42.getText().toString());
                int o43deger = Integer.parseInt(o43.getText().toString());
                int o44deger = Integer.parseInt(o44.getText().toString());
                int o45deger = Integer.parseInt(o45.getText().toString());
                int o46deger = Integer.parseInt(o46.getText().toString());
                int o47deger = Integer.parseInt(o47.getText().toString());
                int o48deger = Integer.parseInt(o48.getText().toString());
                int o49deger = Integer.parseInt(o49.getText().toString());
                int o410deger = Integer.parseInt(o410.getText().toString());
                int o411deger = Integer.parseInt(o411.getText().toString());

                for(int i=0; i<oyuncu4.size();i++)
                {
                    oyuncu4Toplam=oyuncu4Toplam+oyuncu4.get(i);
                }

                int o4Toplam=o41deger+o42deger+o43deger+o44deger+o45deger+o46deger+o47deger+o48deger+o49deger+o410deger+o411deger+oyuncu4Toplam;

                oyuncu4ToplamPuan=(TextView)findViewById(R.id.oyuncu4Skor);
                oyuncu4ToplamPuan.setText(Integer.toString(o4Toplam));

            }
        });

        oyuncu1Ceza=(Button)findViewById(R.id.oyuncu1Ceza);
        oyuncu2Ceza=(Button)findViewById(R.id.oyuncu2Ceza);
        oyuncu3Ceza=(Button)findViewById(R.id.oyuncu3Ceza);
        oyuncu4Ceza=(Button)findViewById(R.id.oyuncu4Ceza);


        oyunBitir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int o1Toplam = Integer.parseInt(oyuncu1ToplamPuan.getText().toString());
                int o2Toplam=  Integer.parseInt(oyuncu2ToplamPuan.getText().toString());
                int o3Toplam = Integer.parseInt(oyuncu3ToplamPuan.getText().toString());
                int o4Toplam = Integer.parseInt(oyuncu4ToplamPuan.getText().toString());

                if(o1Toplam<o2Toplam && o1Toplam<o3Toplam && o1Toplam<o4Toplam)
                {
                    AlertDialog.Builder uyariMesaji = new AlertDialog.Builder(context);
                    uyariMesaji.setTitle("Oyun Bitti! Tebrikler " + oyuncu1Ad.getText().toString() );
                    uyariMesaji.setMessage("Kazanan Kişi: " + oyuncu1Ad.getText().toString());
                    uyariMesaji.setIcon(R.drawable.tebrikleremoji);
                    uyariMesaji.setPositiveButton("Tamam", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            finish();
                        }
                    });
                    AlertDialog alertDialog = uyariMesaji.create();
                    alertDialog.show();
                }
                else if(o2Toplam<o1Toplam && o2Toplam<o3Toplam && o2Toplam<o4Toplam)
                {
                    AlertDialog.Builder uyariMesaji = new AlertDialog.Builder(context);
                    uyariMesaji.setTitle("Oyun Bitti! Tebrikler " + oyuncu2Ad.getText().toString());
                    uyariMesaji.setMessage("Kazanan Kişi: " + oyuncu2Ad.getText().toString());
                    uyariMesaji.setIcon(R.drawable.tebrikleremoji);
                    uyariMesaji.setPositiveButton("Tamam", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            finish();
                        }
                    });
                    AlertDialog alertDialog = uyariMesaji.create();
                    alertDialog.show();
                }
                else if(o3Toplam<o1Toplam && o3Toplam<o2Toplam && o3Toplam<o4Toplam)
                {
                    AlertDialog.Builder uyariMesaji = new AlertDialog.Builder(context);
                    uyariMesaji.setTitle("Oyun Bitti! Tebrikler " + oyuncu3Ad.getText().toString());
                    uyariMesaji.setMessage("Kazanan Kişi: " + oyuncu3Ad.getText().toString());
                    uyariMesaji.setIcon(R.drawable.tebrikleremoji);
                    uyariMesaji.setPositiveButton("Tamam", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            finish();
                        }
                    });
                    AlertDialog alertDialog = uyariMesaji.create();
                    alertDialog.show();
                }
                else if(o4Toplam<o1Toplam && o4Toplam<o2Toplam && o4Toplam<o3Toplam)
                {
                    AlertDialog.Builder uyariMesaji = new AlertDialog.Builder(context);
                    uyariMesaji.setTitle("Oyun Bitti! Tebrikler " + oyuncu4Ad.getText().toString());
                    uyariMesaji.setMessage("Kazanan Kişi: " + oyuncu4Ad.getText().toString());
                    uyariMesaji.setIcon(R.drawable.tebrikleremoji);
                    uyariMesaji.setPositiveButton("Tamam", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            finish();
                        }
                    });
                    AlertDialog alertDialog = uyariMesaji.create();
                    alertDialog.show();
                }
                else if (o1Toplam==o2Toplam && o1Toplam<o3Toplam && o1Toplam<o4Toplam)
                {
                    AlertDialog.Builder uyariMesaji = new AlertDialog.Builder(context);
                    uyariMesaji.setTitle("Oyun Bitti! Tebrikler " + oyuncu1Ad.getText().toString() + "-" + oyuncu2Ad.getText().toString());
                    uyariMesaji.setMessage("Kazanan Kişiler: " + oyuncu1Ad.getText().toString() + " ve " +oyuncu2Ad.getText().toString());
                    uyariMesaji.setIcon(R.drawable.tebrikleremoji);
                    uyariMesaji.setPositiveButton("Tamam", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            finish();
                        }
                    });
                    AlertDialog alertDialog = uyariMesaji.create();
                    alertDialog.show();
                }
                else if(o1Toplam==o3Toplam && o1Toplam<o2Toplam && o1Toplam<o4Toplam)
                {
                    AlertDialog.Builder uyariMesaji = new AlertDialog.Builder(context);
                    uyariMesaji.setTitle("Oyun Bitti! Tebrikler " + oyuncu1Ad.getText().toString() + "-" + oyuncu3Ad.getText().toString());
                    uyariMesaji.setMessage("Kazanan Kişiler: " + oyuncu1Ad.getText().toString() + " ve " +oyuncu3Ad.getText().toString());
                    uyariMesaji.setIcon(R.drawable.tebrikleremoji);
                    uyariMesaji.setPositiveButton("Tamam", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            finish();
                        }
                    });
                    AlertDialog alertDialog = uyariMesaji.create();
                    alertDialog.show();
                }
                else if(o1Toplam==o4Toplam && o1Toplam<o2Toplam && o1Toplam<o3Toplam)
                {
                    AlertDialog.Builder uyariMesaji = new AlertDialog.Builder(context);
                    uyariMesaji.setTitle("Oyun Bitti! Tebrikler " + oyuncu1Ad.getText().toString() + "-" + oyuncu4Ad.getText().toString());
                    uyariMesaji.setMessage("Kazanan Kişiler: " + oyuncu1Ad.getText().toString() + " ve " +oyuncu4Ad.getText().toString());
                    uyariMesaji.setIcon(R.drawable.tebrikleremoji);
                    uyariMesaji.setPositiveButton("Tamam", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            finish();
                        }
                    });
                    AlertDialog alertDialog = uyariMesaji.create();
                    alertDialog.show();
                }
                else if(o2Toplam==o3Toplam && o2Toplam<o1Toplam && o2Toplam<o4Toplam)
                {
                    AlertDialog.Builder uyariMesaji = new AlertDialog.Builder(context);
                    uyariMesaji.setTitle("Oyun Bitti! Tebrikler " + oyuncu2Ad.getText().toString() + "-" + oyuncu3Ad.getText().toString());
                    uyariMesaji.setMessage("Kazanan Kişiler: " + oyuncu2Ad.getText().toString() + " ve " +oyuncu3Ad.getText().toString());
                    uyariMesaji.setIcon(R.drawable.tebrikleremoji);
                    uyariMesaji.setPositiveButton("Tamam", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            finish();
                        }
                    });
                    AlertDialog alertDialog = uyariMesaji.create();
                    alertDialog.show();
                }
                else if(o2Toplam==o4Toplam && o2Toplam<o1Toplam && o2Toplam<o3Toplam)
                {
                    AlertDialog.Builder uyariMesaji = new AlertDialog.Builder(context);
                    uyariMesaji.setTitle("Oyun Bitti! Tebrikler " + oyuncu2Ad.getText().toString() + "-" + oyuncu4Ad.getText().toString());
                    uyariMesaji.setMessage("Kazanan Kişiler: " + oyuncu2Ad.getText().toString() + " ve " +oyuncu4Ad.getText().toString());
                    uyariMesaji.setIcon(R.drawable.tebrikleremoji);
                    uyariMesaji.setPositiveButton("Tamam", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            finish();
                        }
                    });
                    AlertDialog alertDialog = uyariMesaji.create();
                    alertDialog.show();
                }
                else if(o3Toplam==o4Toplam && o3Toplam<o1Toplam && o3Toplam<o2Toplam)
                {
                    AlertDialog.Builder uyariMesaji = new AlertDialog.Builder(context);
                    uyariMesaji.setTitle("Oyun Bitti! Tebrikler " + oyuncu3Ad.getText().toString() + "-" + oyuncu4Ad.getText().toString());
                    uyariMesaji.setMessage("Kazanan Kişiler: " + oyuncu3Ad.getText().toString() + " ve " + oyuncu4Ad.getText().toString());
                    uyariMesaji.setIcon(R.drawable.tebrikleremoji);
                    uyariMesaji.setPositiveButton("Tamam", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            finish();
                        }
                    });
                    AlertDialog alertDialog = uyariMesaji.create();
                    alertDialog.show();
                }
                else if(o1Toplam==o2Toplam && o1Toplam==o3Toplam && o1Toplam<o4Toplam)
                {
                    AlertDialog.Builder uyariMesaji = new AlertDialog.Builder(context);
                    uyariMesaji.setTitle("Oyun Bitti! Tebrikler " + oyuncu1Ad.getText().toString() + "-" + oyuncu2Ad.getText().toString() + "-" + oyuncu3Ad.getText().toString());
                    uyariMesaji.setMessage("Kazanan Kişiler: "+ oyuncu1Ad.getText().toString() + "-" + oyuncu2Ad.getText().toString() + "-" + oyuncu3Ad.getText().toString());
                    uyariMesaji.setIcon(R.drawable.tebrikleremoji);
                    uyariMesaji.setPositiveButton("Tamam", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            finish();
                        }
                    });
                    AlertDialog alertDialog = uyariMesaji.create();
                    alertDialog.show();
                }
                else if(o2Toplam==o3Toplam && o2Toplam==o4Toplam && o2Toplam<o1Toplam)
                {
                    AlertDialog.Builder uyariMesaji = new AlertDialog.Builder(context);
                    uyariMesaji.setTitle("Oyun Bitti! Tebrikler " + oyuncu2Ad.getText().toString() + "-" + oyuncu3Ad.getText().toString() + "-" + oyuncu4Ad.getText().toString());
                    uyariMesaji.setMessage("Kazanan Kişiler: "+ oyuncu2Ad.getText().toString() + "-" + oyuncu3Ad.getText().toString() + "-" + oyuncu4Ad.getText().toString());
                    uyariMesaji.setIcon(R.drawable.tebrikleremoji);
                    uyariMesaji.setPositiveButton("Tamam", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            finish();
                        }
                    });
                    AlertDialog alertDialog = uyariMesaji.create();
                    alertDialog.show();
                }
                else if(o1Toplam==o2Toplam && o1Toplam==o4Toplam && o1Toplam<o3Toplam)
                {

                    AlertDialog.Builder uyariMesaji = new AlertDialog.Builder(context);
                    uyariMesaji.setTitle("Oyun Bitti! Tebrikler " + oyuncu1Ad.getText().toString() + "-" + oyuncu2Ad.getText().toString() + "-" + oyuncu4Ad.getText().toString());
                    uyariMesaji.setMessage("Kazanan Kişiler: "+ oyuncu1Ad.getText().toString() + "-" + oyuncu2Ad.getText().toString() + "-" + oyuncu4Ad.getText().toString());
                    uyariMesaji.setIcon(R.drawable.tebrikleremoji);
                    uyariMesaji.setPositiveButton("Tamam", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            finish();
                        }
                    });
                    AlertDialog alertDialog = uyariMesaji.create();
                    alertDialog.show();

                }
                else
                {
                    AlertDialog.Builder uyariMesaji = new AlertDialog.Builder(context);
                    uyariMesaji.setTitle("Oyun Bitti! Kazanan yok");
                    uyariMesaji.setMessage("Kazanan Yok. Oyun Berabere");
                    uyariMesaji.setIcon(R.drawable.tebrikleremoji);
                    uyariMesaji.setPositiveButton("Tamam", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            finish();
                        }
                    });
                    AlertDialog alertDialog = uyariMesaji.create();
                    alertDialog.show();
                }
            }
        });



    }

    public void cezaEkle1(View v)
    {


        final PopupMenu popupmenu = new PopupMenu(getApplicationContext(), oyuncu1Ceza);
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
                        oyuncu1.add(isler);
                        return true;
                    case R.id.okey1:
                        oyuncu1.add(okey);
                        return true;
                    case R.id.yanlisel1:
                        oyuncu1.add(yanlisel);
                        return true;
                    case R.id.okeyialindi:
                        oyuncu1.add(okeyialindi);
                        return true;
                }
                return false;
            }
        });
        popupmenu.show();
    }


    public void cezaEkle2(View v)
    {

        final PopupMenu popupmenu = new PopupMenu(getApplicationContext(), oyuncu2Ceza);
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
                        oyuncu2.add(isler);
                        return true;
                    case R.id.okey1:
                        oyuncu2.add(okey);
                        return true;
                    case R.id.yanlisel1:
                        oyuncu2.add(yanlisel);
                        return true;
                    case R.id.okeyialindi:
                        oyuncu2.add(okeyialindi);
                        return true;
                }
                return false;
            }
        });
        popupmenu.show();

    }

    public void cezaEkle3(View v)
    {


        final PopupMenu popupmenu = new PopupMenu(getApplicationContext(), oyuncu3Ceza);
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
                        oyuncu3.add(isler);
                        return true;
                    case R.id.okey1:
                        oyuncu3.add(okey);
                        return true;
                    case R.id.yanlisel1:
                        oyuncu3.add(yanlisel);
                        return true;
                    case R.id.okeyialindi:
                        oyuncu3.add(okeyialindi);
                        return true;
                }
                return false;
            }
        });
        popupmenu.show();
    }

    public void cezaEkle4(View v)
    {

        final PopupMenu popupmenu = new PopupMenu(getApplicationContext(), oyuncu4Ceza);
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
                        oyuncu4.add(isler);
                        return true;
                    case R.id.okey1:
                        oyuncu4.add(okey);
                        return true;
                    case R.id.yanlisel1:
                        oyuncu4.add(yanlisel);
                        return true;
                    case R.id.okeyialindi:
                        oyuncu4.add(okeyialindi);
                        return true;
                }
                return false;
            }
        });
        popupmenu.show();
    }

}