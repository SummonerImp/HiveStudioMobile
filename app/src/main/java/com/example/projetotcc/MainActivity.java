package com.example.projetotcc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
    Button btnLogin;
    EditText txtUser, txtPassword;
    TextView lblForgotPassword, lblSignUp;
    CheckBox chkRemindMe;
    JSONParse jsonParse = new JSONParse();

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
        jsonParse.execute("");
    }

    public void onLoginPress(View v){

    }
}