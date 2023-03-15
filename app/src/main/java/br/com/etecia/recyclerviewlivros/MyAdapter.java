package br.com.etecia.recyclerviewlivros;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {


    private Context mContext; //É a classe onde estou
    private List<Livro> mData; //O objeto que irá representar os dados

    public MyAdapter(Context mContext, List<Livro> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        LayoutInflater MyInflater = LayoutInflater.from(mContext);
        view = MyInflater.inflate(R.layout.modelo_layout, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView txtTitulo;
        ImageView imgLivro;
        CardView idCardView;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        txtTitulo = itemView.findViewById(R.id.txtTitulo);
        imgLivro = itemView.findViewById(R.id.imgLivro);
        idCardView = itemView.findViewById(R.id.idCardView);


        }
    }

}
