package com.example.ciphermaster;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class CipherAdapter extends RecyclerView.Adapter<CipherAdapter.CipherViewHolder> {


    private Context mCtx;
    private List<Information> informationList;


    class CipherViewHolder extends RecyclerView.ViewHolder {
        TextView titleTextView, descTextView;
        CardView mCardView;

        public CipherViewHolder(@NonNull View itemView) {
            super(itemView);
            mCardView = itemView.findViewById(R.id.card_view);
            this.titleTextView = itemView.findViewById(R.id.text_View_Cipher_Name);
            this.descTextView = itemView.findViewById(R.id.text_View_Cipher_Details);
        }
    }

    public CipherAdapter(Context mCtx, List<Information> informationList) {
        this.mCtx = mCtx;
        this.informationList = informationList;
    }

    @Override
    public CipherAdapter.CipherViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.layout_list, viewGroup, false);
        return new CipherViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CipherViewHolder holder, int position) {
        final Information information = informationList.get(position);
        holder.mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mCtx, Encrypt.class );
                intent.putExtra("Title", information.getTitle());
                mCtx.startActivity(intent);
            }
        });
        holder.titleTextView.setText(information.getTitle());
        holder.descTextView.setText(information.getShortdesc());
    }

    @Override
    public int getItemCount() {
        return informationList.size();
    }


}
