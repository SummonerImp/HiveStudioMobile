package com.example.projetotcc;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.projetotcc.models.Fotografo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AllFotografos extends AppCompatActivity implements com.example.projetotcc.AsyncResponse {
    ListView listView;

    private static String url ="jdbc:mysql://bancoonline.mysql.database.azure.com:3306/dbhive?useSSL=true&requireSSL=false";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_fotografos);
        getSupportActionBar().hide();
        getWindow().setNavigationBarColor(getResources().getColor(R.color.bistre));
        getWindow().setStatusBarColor(getResources().getColor(R.color.bistre));

        TakeUsers users = new TakeUsers();
        users.delegate = this;
        users.execute();


    }

    public static class TakeUsers extends AsyncTask<Connection, String, List<Fotografo>>{
        public AsyncResponse delegate = null;
        @Override
        protected List doInBackground(Connection... strings) {
            Connection connection = null;
            List<Fotografo> list = new ArrayList<>();
            try {
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection(url, "devstack@bancoonline", "jesus@123");
                if(connection!=null){
                    Statement statement = connection.createStatement();
                    ResultSet resultSet = statement.executeQuery("Select * from Fotografo");
                    while (resultSet.next()){
                        Fotografo fotografo = new Fotografo();
                        fotografo.setFotografoCpf(resultSet.getInt(1));
                        fotografo.setNome(resultSet.getString(2));
                        fotografo.setCelular(resultSet.getInt(3));
                        fotografo.setTelefone(resultSet.getInt(4));
                        fotografo.setEndId(resultSet.getInt(5));
                        fotografo.setDataRegistro(resultSet.getDate(6));
                        fotografo.setPgtoHora(resultSet.getInt(8));
                        fotografo.setUsuarioId(resultSet.getInt(9));
                        fotografo.setCpfDig(resultSet.getInt(10));
                        fotografo.setNota(resultSet.getDouble(11));
                        fotografo.setTempoXp(resultSet.getInt(12));
                        list.add(fotografo);
                    }
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            Log.i("dadosMysql","SUCCESS");
            return list;
        }

        @Override
        protected void onPostExecute(List<Fotografo> fotografos) {
            delegate.loadlistFinished(fotografos);
            super.onPostExecute(fotografos);
        }
    }

    @Override
    public void loadlistFinished(List<Fotografo> list){
        listView = findViewById(R.id.allfotListView);
        listView.setAdapter(new MyAdapter(this, list));
        final Intent it = new Intent(this, Perfil_Fotografo.class);
        listView.setOnItemClickListener((adapterView, view, i, l) -> {
            Fotografo fot = (Fotografo) listView.getItemAtPosition(i);
            it.putExtra("objFot", fot);
            startActivity(it);
        });
    }

    class MyAdapter extends ArrayAdapter<Fotografo>{
        Context context;
        List<Fotografo> listFt;

        public MyAdapter(Context context, List<Fotografo> list){
            super(context, R.layout.list_photo, list);
            this.context = context;
            this.listFt = list;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View v = layoutInflater.inflate(R.layout.list_photo, parent, false);
            TextView txtNome = v.findViewById(R.id.listtxtNome);
            ImageView img = v.findViewById(R.id.listimgFotografo);
            txtNome.setText(listFt.get(position).getNome());
            img.setImageResource(R.mipmap.hivestudio_logo);
            TextView txtXp = v.findViewById(R.id.listtxtLocal);
            txtXp.setText(listFt.get(position).getTempoXp() + " anos");
            return v;
        }
    }
}