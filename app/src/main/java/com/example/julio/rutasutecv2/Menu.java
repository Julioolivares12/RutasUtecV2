package com.example.julio.rutasutecv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.Toast;

public class Menu extends AppCompatActivity {

    private TabHost Tbh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Tbh= (TabHost)findViewById(R.id.tabHost);
        Tbh.setup();
        TabHost.TabSpec tab1 = Tbh.newTabSpec("tab1");
        TabHost.TabSpec tab2= Tbh.newTabSpec("tab2");
        TabHost.TabSpec tab3 = Tbh.newTabSpec("tab3");

        tab1.setIndicator("inicio");
        tab1.setContent(R.id.inicio);
        tab2.setIndicator("mapas");
        tab2.setContent(R.id.mapas);
        tab3.setIndicator("buscar");
        tab3.setContent(R.id.buscar);

        Tbh.addTab(tab1);
        Tbh.addTab(tab2);
        Tbh.addTab(tab3);

        /*Tbh.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
                Toast.makeText(getApplicationContext(),"pesta "+tabId+"pulsada",Toast.LENGTH_SHORT).show();
            }
        });*/
    }
}
