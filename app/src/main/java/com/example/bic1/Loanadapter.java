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

public class Loanadapter extends FirebaseRecyclerAdapter<loanmodel,Loanadapter.myviewholder>
{
    Context context;
    public Loanadapter(@NonNull FirebaseRecyclerOptions<loanmodel> options, Context context)

    {
        super(options);
        this.context=context;
    }

    @Override
    protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull final loanmodel loanmodel)
    {
        holder.name.setText(loanmodel.getName());
        holder.loanrate.setText(loanmodel.getLoanrate());
        Glide.with(holder.img.getContext()).load(loanmodel.getPurl()).into(holder.img);

        //Click to next activity
        holder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Should be change to fixed application
                Intent intent=new Intent(context,Loan.class);
                intent.putExtra("image",loanmodel.getPurl());
                intent.putExtra("Loanrate",loanmodel.getLoanrate());
                intent.putExtra("name",loanmodel.getName());
                intent.putExtra("address",loanmodel.getAddress());
                intent.putExtra("mail",loanmodel.getMail());
                intent.putExtra("tp",loanmodel.getTp());
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
        TextView name,loanrate;
        public myviewholder(@NonNull View itemView)
        {
            super(itemView);
            img=(CircleImageView)itemView.findViewById(R.id.img1);
            name=(TextView)itemView.findViewById(R.id.nametext);
            loanrate=(TextView)itemView.findViewById(R.id.ratetext);
        }
    }

    public interface ClickListener{
        void onItemClick(View view, int position);

    }


}


