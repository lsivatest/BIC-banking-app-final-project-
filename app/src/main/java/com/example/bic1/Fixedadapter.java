package com.example.bic1;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

import de.hdodenhof.circleimageview.CircleImageView;

public class Fixedadapter extends FirebaseRecyclerAdapter<fixedmodel,Fixedadapter.myviewholder>
{
    Context context;
    public Fixedadapter(@NonNull FirebaseRecyclerOptions<fixedmodel> options, Context context)

    {
        super(options);
        this.context=context;
    }

    @Override
    protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull final fixedmodel fixedmodel)
    {
        holder.name.setText(fixedmodel.getName());
        holder.Fixedrate.setText(fixedmodel.getFixedrate());
        Glide.with(holder.img.getContext()).load(fixedmodel.getPurl()).into(holder.img);

        //Click to next activity
        holder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Should be change to fixed application
                Intent intent=new Intent(context,DetailsActivity.class);
                intent.putExtra("image",fixedmodel.getPurl());
                intent.putExtra("Fixedrate",fixedmodel.getFixedrate());
                intent.putExtra("name",fixedmodel.getName());
                intent.putExtra("address",fixedmodel.getAddress());
                intent.putExtra("mail",fixedmodel.getMail());
                intent.putExtra("tp",fixedmodel.getTp());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });

    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerow,parent,false);
        return new myviewholder(view);
    }

    class myviewholder extends RecyclerView.ViewHolder
    {
        CircleImageView img;
        TextView name,Fixedrate;
        public myviewholder(@NonNull View itemView)
        {
            super(itemView);
            img=(CircleImageView)itemView.findViewById(R.id.img1);
            name=(TextView)itemView.findViewById(R.id.nametext);
            Fixedrate=(TextView)itemView.findViewById(R.id.ratetext);
        }
    }

    public interface ClickListener{
        void onItemClick(View view, int position);

    }


}


