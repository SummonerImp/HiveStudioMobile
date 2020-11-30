package com.example.projetotcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.example.projetotcc.models.AsyncResponse;
import com.example.projetotcc.models.JSONParse;

public class MainActivity extends AppCompatActivity {
    Button btnLogin;
    EditText txtUser, txtPassword;
    TextView lblForgotPassword, lblSignUp;
    CheckBox chkRemindMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        getWindow().setNavigationBarColor(getResources().getColor(R.color.bistre));
        getWindow().setStatusBarColor(getResources().getColor(R.color.bistre));
        btnLogin = findViewById(R.id.mainBtnLogin);
        txtUser = findViewById(R.id.mainTxtUser);
        txtPassword = findViewById(R.id.mainTxtPasword);
        lblForgotPassword = findViewById(R.id.mainLblForgotPassword);
        lblSignUp = findViewById(R.id.mainLblSignUp);
        chkRemindMe = findViewById(R.id.mainChkRemindMe);
    }

    public void onLoginPress(View v){
        Intent it = new Intent(this, Perfil_Fotografo.class);
        startActivity(it);
    }
}