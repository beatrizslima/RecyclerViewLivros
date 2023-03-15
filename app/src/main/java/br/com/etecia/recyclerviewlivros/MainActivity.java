package br.com.etecia.recyclerviewlivros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Livro> lstLivro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyAdapter adapter = new MyAdapter(getApplicationContext(),);

        //criando a base de dados para carregamento da lista
        lstLivro = new ArrayList<>();
        lstLivro.add(new Livro("A Trança","Laetitia Colombani", "Fenômeno de vendas internacional conta a história entrelaçada " + "de três mulheres em continentes diferentes, mas com a mesma sede de liberdade", R.drawable.a_tranca));
    }
}