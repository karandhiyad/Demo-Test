package com.example.demotest;

import static com.example.demotest.MainActivity.dialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.demotest.databinding.SwitchSampleBinding;

import java.util.ArrayList;

public class SwitchAddAdapter extends RecyclerView.Adapter<SwitchAddAdapter.viewHolder> {

    Context context;
    ArrayList<SwitchModel> switchModels;

    public SwitchAddAdapter(Context context, ArrayList<SwitchModel> switchModels) {
        this.context = context;
        this.switchModels = switchModels;
    }

    @NonNull
    @Override
    public SwitchAddAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.switch_sample,parent,false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SwitchAddAdapter.viewHolder holder, int position) {
        SwitchModel switchModel = switchModels.get(position);

        holder.binding.txSwitchNumber.setText(switchModel.getSwitchNumber());
        holder.binding.txname.setText(switchModel.getSwitchName());

        holder.binding.igAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return switchModels.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder {
        SwitchSampleBinding binding;
        Button btnSave,btnClose;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            binding = SwitchSampleBinding.bind(itemView);

            btnSave = dialog.findViewById(R.id.btnSave);
            btnClose = dialog.findViewById(R.id.btnClose);

            btnSave.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });

            btnClose.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialog.dismiss();
                }
            });
        }
    }
}
