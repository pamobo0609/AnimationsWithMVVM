package com.pamobo0609.demo.recyclerview.viewholder;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.pamobo0609.demo.databinding.RecyclerRowBinding;

/**
 * @author Accenture - <a href="mailto:jose.p.monge.bonilla@accenture.com">Jose Pablo Monge Bonilla</a>
 * @since 102/02/17
 */
public class LoremIpsumViewHolder extends RecyclerView.ViewHolder {

    /**
     * The binding object for the row.
     **/
    private RecyclerRowBinding mBinding;

    public LoremIpsumViewHolder(View itemView) {
        super(itemView);
        mBinding = DataBindingUtil.bind(itemView);
    }

    public RecyclerRowBinding getBinding() {
        return mBinding;
    }
}