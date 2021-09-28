package com.example.trabajo2;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class familiaAdapter extends RecyclerView.Adapter<familiaAdapter.ViewHolderFamilia> implements View.OnClickListener{

    ArrayList<familiaSimpson> listaFamilia;
    private View.OnClickListener listener;

    public familiaAdapter(ArrayList<familiaSimpson> listaFamilia){
        this.listaFamilia = listaFamilia;
    }

    @NonNull
    @Override
    public ViewHolderFamilia onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.plantilla_lista,null,false);
        view.setOnClickListener(this);
        return new ViewHolderFamilia(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderFamilia holder, int position) {
        holder.txtNombre.setText(listaFamilia.get(position).getNombre());
        holder.txtDescripcion.setText(listaFamilia.get(position).getDescripcion());
        holder.foto.setImageResource(listaFamilia.get(position).getFoto());
        holder.txtActor.setText(listaFamilia.get(position).getActorVoz());
    }

    @Override
    public int getItemCount() {
        return listaFamilia.size();
    }

    public void setOnClickListener(View.OnClickListener listener){
        this.listener=listener;
    }
    @Override
    public void onClick(View view) {
        if(listener != null){
            listener.onClick(view);
        }
    }

    public class ViewHolderFamilia extends RecyclerView.ViewHolder {

        TextView txtDescripcion, txtNombre, txtActor;
        ImageView foto;

        public ViewHolderFamilia(@NonNull View itemView) {
            super(itemView);
            txtNombre = (TextView) itemView.findViewById(R.id.nombre);
            txtDescripcion = (TextView) itemView.findViewById(R.id.descripcion);
            txtActor = (TextView) itemView.findViewById(R.id.actorDeVoz);
            foto = (ImageView) itemView.findViewById(R.id.imagen);
        }
    }
}
