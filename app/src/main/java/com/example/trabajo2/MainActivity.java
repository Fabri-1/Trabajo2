package com.example.trabajo2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<familiaSimpson> listaPersonajes;
    RecyclerView recyclerPersonajes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaPersonajes = new ArrayList<>();
        recyclerPersonajes = (RecyclerView) findViewById(R.id.recycler);
        recyclerPersonajes.setLayoutManager(new LinearLayoutManager(this));
        llenarRecycler();

        familiaAdapter adapter= new familiaAdapter(listaPersonajes);
        adapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Actor de voz: "+listaPersonajes.get(recyclerPersonajes.getChildAdapterPosition(view)).getActorVoz(),Toast.LENGTH_SHORT).show();
            }
        });
        recyclerPersonajes.setAdapter(adapter);
    }
    private void llenarRecycler(){
        listaPersonajes.add(new familiaSimpson("Homero Simpson","Es el padre de la familia Simpson y protagonista; tiene 39 años, es obeso, calvo y con poco sentido común.","Humberto Vélez",R.drawable.homer));
        listaPersonajes.add(new familiaSimpson("Marge Simpson","Es la madre de Bart, Lisa, Maggie y esposa de Homer, tiene 34 años.","Nancy Mckenzie",R.drawable.marge));
        listaPersonajes.add(new familiaSimpson("Lisa Simpson","Es la hija del medio en la familia. Tiene 8 años, es muy madura para su edad.","Marina Huerta",R.drawable.lisa));
        listaPersonajes.add(new familiaSimpson("Bart Simpson","Es el hijo mayor, tiene 10 años de edad. Es travieso y a veces hiperactivo.","Patricia Acevedo",R.drawable.bart));
    }
}