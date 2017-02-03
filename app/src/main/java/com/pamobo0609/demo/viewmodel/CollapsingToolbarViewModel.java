package com.pamobo0609.demo.viewmodel;

import android.content.Context;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.pamobo0609.demo.R;
import com.pamobo0609.demo.databinding.ActivityCollapsingToolbarBinding;
import com.pamobo0609.demo.util.ViewModelContact;
import com.pamobo0609.demo.view.activity.CollapsingToolbarActivity;

/**
 * @author Accenture - <a href="mailto:jose.p.monge.bonilla@accenture.com">Jose Pablo Monge Bonilla</a>
 * @since 102/02/17
 */
public class CollapsingToolbarViewModel implements ViewModelContact.ViewModel {

    /**
     * The related activity context.
     */
    private Context mContext;

    /**
     * The binding object of the related activity.
     */
    private ActivityCollapsingToolbarBinding mBinding;

    /**
     * <h1>CollapsingToolbarViewModel</h1>
     * <p>Default constructor for this view model.</p>
     *
     * @param pContext the related {@link Context}
     * @param pBinding the {@link ActivityCollapsingToolbarBinding} object.
     */
    public CollapsingToolbarViewModel(Context pContext, ActivityCollapsingToolbarBinding pBinding) {
        this.mContext = pContext;
        this.mBinding = pBinding;
    }

    @Override
    public void onDestroy() {
        this.mContext = null;
        this.mBinding = null;
    }

    /**
     * <h1>GetActivity</h1>
     * <p>Returns the related activity.</p>
     *
     * @return the related {@link AppCompatActivity}
     */
    @Override
    public AppCompatActivity getActivity() {
        return (CollapsingToolbarActivity) mContext;
    }

    /**
     * <h1>GetString</h1>
     * <p>Returns a String resource as a String</p>
     *
     * @param pResId the resource id for the String.
     * @return the resource as a String
     */
    @Override
    public String getString(int pResId) {
        return mContext.getString(pResId);
    }

    /**
     * <h1>ShowInfo</h1>
     * <p>Shows a dummy SnackBar</p>
     *
     * @param v the caller view
     */
    public void showInfo(View v) {
        Snackbar.make(mBinding.activityCollapsingToolbar, R.string.msg_info_snack, Snackbar.LENGTH_LONG).show();
    }
}