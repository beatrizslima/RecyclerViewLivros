package br.com.etecia.recyclerviewlivros;

import android.content.Context;
import android.content.Intent;
import android.util.Size;
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
    //private List<Livro> mData;

    private List<Livro> lstLivro;  //O objeto que irá representar os dados

    public MyAdapter(Context mContext, List<Livro> mData) {
        this.mContext = mContext;
        this.lstLivro = lstLivro;
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
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.txtTitulo.setText(lstLivro.get(position).getTitulo());
        holder.imgLivro.setImageResource(lstLivro.get(position).getImg());

        holder.idCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, ApresentaLivroActivity.class);

                intent.putExtra("Titulo", lstLivro.get(position).getTitulo());
                intent.putExtra("Categoria", lstLivro.get(position).getCategoria());
                intent.putExtra("Descricao", lstLivro.get(position).getDescricao());
                intent.putExtra("Imagem", lstLivro.get(position).getImg());

                mContext.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
            }
        });
    }

    public int getItemCount() {

        return lstLivro.size();
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
