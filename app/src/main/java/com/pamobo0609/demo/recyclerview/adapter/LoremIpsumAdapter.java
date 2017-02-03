package com.pamobo0609.demo.recyclerview.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.pamobo0609.demo.model.LoremIpsumModel;
import com.pamobo0609.demo.recyclerview.viewholder.LoremIpsumViewHolder;

import java.util.ArrayList;

/**
 * @author Accenture - <a href="mailto:jose.p.monge.bonilla@accenture.com">Jose Pablo Monge Bonilla</a>
 * @since 102/02/17
 */
public class LoremIpsumAdapter extends RecyclerView.Adapter<LoremIpsumViewHolder> {

    private ArrayList<LoremIpsumModel> mDataSet;

    public LoremIpsumAdapter(ArrayList<LoremIpsumModel> pDataSet) {
        this.mDataSet = pDataSet;
    }

    @Override
    public LoremIpsumViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(LoremIpsumViewHolder holder, int position) {
        final LoremIpsumModel lorem = mDataSet.get(position);
        holder.getBinding().setMLorem(lorem);
    }

    @Override
    public int getItemCount() {
        return mDataSet.size();
    }
}
