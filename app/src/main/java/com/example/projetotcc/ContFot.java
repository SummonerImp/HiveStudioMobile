package com.example.projetotcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ContFot extends AppCompatActivity {
    Button btnSoli;
    EditText txtNome, txtEmail, txtCel, txtCpf, txtDig, txtOrca, txtDesc;
    private static String url ="jdbc:mysql://bancoonline.mysql.database.azure.com:3306/dbhive?useSSL=true&requireSSL=false";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cont_fot);
        getSupportActionBar().hide();
        getWindow().setNavigationBarColor(getResources().getColor(R.color.bistre));
        getWindow().setStatusBarColor(getResources().getColor(R.color.bistre));
        btnSoli = findViewById(R.id.btnSoli);
        txtNome = findViewById(R.id.txtNomeCli);
        txtEmail = findViewById(R.id.txtEmailCli);
        txtCel = findViewById(R.id.txtTelCelCli);
        txtCpf = findViewById(R.id.txtCpfCli);
        txtDig = findViewById(R.id.txtDigCli);
        txtOrca = findViewById(R.id.txtOrcaCli);
        txtDesc = findViewById(R.id.txtDescCli);
        Intent it = getIntent();

        btnSoli.setOnClickListener(v ->{
            if(Verifica()==1){
                InsertSessao ins = new InsertSessao();
                int fot = it.getIntExtra("ftCpf", 0);
                Log.i("StringTeste", String.valueOf(fot));
                ins.execute(fot);
                Toast.makeText(this, "Solicitado", Toast.LENGTH_SHORT).show();
                this.finish();
            }
            else{
                return;
            }
        });
    }

    public class InsertSessao extends AsyncTask<Integer, Void, Void>{
        @Override
        protected Void doInBackground(Integer... str) {
            Connection connection = null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection(url, "devstack@bancoonline", "jesus@123");
                if(connection!=null){
                    Statement statement = connection.createStatement();
                    String query = String.format("insert into sessao(ClienteCPF, ClienteCPF_Dig, ClienteNome, ClienteCelular, Descricao, FotografoCPF, StatusSe) values(%s,%s,'%s',%s,'%s',%s, 'Pendente')",
                            txtCpf.getText(), txtDig.getText(), txtNome.getText(),txtCel.getText(), txtDesc.getText(), str[0]);
                    Log.i("StringTeste", query);
                    statement.execute(query);
                    statement.close();

                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            Log.i("dadosMysql","SUCCESS");
            return null;
        }
    }

    public int Verifica(){
        if(txtDesc.length() == 0 && txtDig.length() == 0 && txtCpf.length() == 0 && txtEmail.length() == 0 && txtCel.length() == 0 && txtNome.length() == 0 && txtOrca.length() == 0){
            Toast.makeText(this,"Preencha todos os campos", Toast.LENGTH_LONG).show();
            return 0;
        }
        else if(txtCel.length() != 10){
            Toast.makeText(this,"Verifique se você escreveu o numero corretamente", Toast.LENGTH_LONG).show();
            return 0;
        }
        else if(txtCpf.length() != 9){
            Toast.makeText(this,"Verifique se você escreveu o CPF corretamente", Toast.LENGTH_LONG).show();
            return 0;
        }
        return 1;
    }
}