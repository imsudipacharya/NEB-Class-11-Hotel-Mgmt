package com.sudipacharya.nebclass11hotelmgmt;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.InterstitialAd;

public class MainActivity extends AppCompatActivity {

    private String url1 = "https://ge1hfzjb6npdizmd9zewja-on.drv.tw/NEB/NEB%20Class%2011%20Hotel%20Management/h1Unit1.html";
    private String url2 = "https://ge1hfzjb6npdizmd9zewja-on.drv.tw/NEB/NEB%20Class%2011%20Hotel%20Management/h1Unit2.html";
    private String url3 = "https://ge1hfzjb6npdizmd9zewja-on.drv.tw/NEB/NEB%20Class%2011%20Hotel%20Management/h1Unit3.html";
    private String url4 = "https://ge1hfzjb6npdizmd9zewja-on.drv.tw/NEB/NEB%20Class%2011%20Hotel%20Management/h1Unit4.html";
    private String url5 = "https://ge1hfzjb6npdizmd9zewja-on.drv.tw/NEB/NEB%20Class%2011%20Hotel%20Management/h1Unit5.html";

    private String title1 = "Tourism and Hospitality";
    private String title2 = "Hotel and Catering Establishment";
    private String title3 = "Front Office Department";
    private String title4 = "Housekeeping Department";
    private String title5 = "Introduction of Kitchen";


    private InterstitialAd interstitialAd, interstitialAd1, interstitialAd2, interstitialAd3, interstitialAd4, interstitialAd5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("NEB Class 11 Hotel Management");

        AudienceNetworkAds.initialize(this);
        interstitialAd1 = new InterstitialAd(this, "825676708220540_825677701553774");
        interstitialAd1.loadAd();

        AudienceNetworkAds.initialize(this);
        interstitialAd2 = new InterstitialAd(this, "825676708220540_825677771553767");
        interstitialAd2.loadAd();

        AudienceNetworkAds.initialize(this);
        interstitialAd3 = new InterstitialAd(this, "825676708220540_825677858220425");
        interstitialAd3.loadAd();

        AudienceNetworkAds.initialize(this);
        interstitialAd4 = new InterstitialAd(this, "825676708220540_825677941553750");
        interstitialAd4.loadAd();

        AudienceNetworkAds.initialize(this);
        interstitialAd5 = new InterstitialAd(this, "825676708220540_825678018220409");
        interstitialAd5.loadAd();

        AudienceNetworkAds.initialize(this);
        interstitialAd = new InterstitialAd(this, "825676708220540_825677381553806");
        interstitialAd.loadAd();

        TextView btntxt1 = (TextView) findViewById(R.id.btntxt1);
        TextView btntxt2 = (TextView) findViewById(R.id.btntxt2);
        TextView btntxt3 = (TextView) findViewById(R.id.btntxt3);
        TextView btntxt4 = (TextView) findViewById(R.id.btntxt4);
        TextView btntxt5 = (TextView) findViewById(R.id.btntxt5);

        btntxt1.setText(title1);
        btntxt2.setText(title2);
        btntxt3.setText(title3);
        btntxt4.setText(title4);
        btntxt5.setText(title5);

        CardView card1 = (CardView) findViewById(R.id.card1);
        CardView card2 = (CardView) findViewById(R.id.card2);
        CardView card3 = (CardView) findViewById(R.id.card3);
        CardView card4 = (CardView) findViewById(R.id.card4);
        CardView card5 = (CardView) findViewById(R.id.card5);

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (interstitialAd1.isAdLoaded()) {
                    interstitialAd1.show();
                } else {
                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("epuzzle", url1);
                    i.putExtra("title", title1);
                    startActivity(i);
                }
            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (interstitialAd2.isAdLoaded()) {
                    interstitialAd2.show();
                } else {
                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("epuzzle", url2);
                    i.putExtra("title", title2);
                    startActivity(i);
                }
            }
        });

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (interstitialAd3.isAdLoaded()) {
                    interstitialAd3.show();
                } else {
                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("epuzzle", url3);
                    i.putExtra("title", title3);
                    startActivity(i);
                }
            }
        });

        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (interstitialAd4.isAdLoaded()) {
                    interstitialAd4.show();
                } else {
                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("epuzzle", url4);
                    i.putExtra("title", title4);
                    startActivity(i);
                }
            }
        });

        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (interstitialAd5.isAdLoaded()) {
                    interstitialAd5.show();
                } else {
                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("epuzzle", url5);
                    i.putExtra("title", title5);
                    startActivity(i);
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        if (interstitialAd.isAdLoaded()) {
            interstitialAd.show();
        }
        super.onBackPressed();
    }
}