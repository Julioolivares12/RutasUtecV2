package com.example.julio.rutasutecv2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import CLogin.Clogica;

public class Login extends AppCompatActivity {


    private EditText txtusuario,txtpass;
    private Button btnLogin;
    Clogica usu = new Clogica();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtusuario = (EditText)findViewById(R.id.txtusuaio);
        txtpass = (EditText)findViewById(R.id.txtpass);
        btnLogin = (Button)findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String u = txtusuario.getText().toString();
                String p= txtpass.getText().toString();
                int usuarioEncontrado = usu.Login(u,p);
                if(usuarioEncontrado>=0){
                    Intent menu = new Intent(getApplicationContext(),Menu.class);
                    startActivity(menu);
                    Toast.makeText(getApplicationContext()," Bienvenido",Toast.LENGTH_SHORT).show();
                }else
                {
                    Toast.makeText(getApplicationContext(),"error datos no valido",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
