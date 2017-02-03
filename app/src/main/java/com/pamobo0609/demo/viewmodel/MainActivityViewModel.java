package com.pamobo0609.demo.viewmodel;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.pamobo0609.demo.R;
import com.pamobo0609.demo.databinding.ActivityMainBinding;
import com.pamobo0609.demo.util.ViewModelContact;
import com.pamobo0609.demo.view.activity.CollapsingTabsActivity;
import com.pamobo0609.demo.view.activity.CollapsingToolbarActivity;
import com.pamobo0609.demo.view.activity.MainActivity;

/**
 * @author Accenture - <a href="mailto:jose.p.monge.bonilla@accenture.com">Jose Pablo Monge Bonilla</a>
 * @since 102/02/17
 */
public class MainActivityViewModel implements ViewModelContact.ViewModel {

    /**
     * The related activity context.
     */
    private Context mContext;

    /**
     * The data binding object
     */
    private ActivityMainBinding mBinding;

    /**
     * <h1>MainActivityViewModel</h1>
     * <p>Default constructor for this view model.</p>
     *
     * @param pContext the context of the related activity
     */
    public MainActivityViewModel(Context pContext, ActivityMainBinding pBinding) {
        this.mContext = pContext;
        this.mBinding = pBinding;
    }

    /**
     * <h1>OnDestroy</h1>
     * <p>This method will me used when the activity calls it's own {@link AppCompatActivity#onDestroy()}
     * method, to nullify all variables.</p>
     */
    @Override
    public void onDestroy() {
        this.mContext = null;
        this.mBinding = null;
    }

    /**
     * <h1>GetActivity</h1>
     * <p>Returns the related activity for this view model.</p>
     *
     * @return an {@link AppCompatActivity} the view model's related activity.
     */
    @Override
    public AppCompatActivity getActivity() {
        return (MainActivity) mContext;
    }

    /**
     * <h1>GetString</h1>
     * <p>Returns a String from a given resource id.</p>
     *
     * @param pResId the resource id for the String.
     * @return a String from a given resource id.
     */
    @Override
    public String getString(int pResId) {
        return getActivity().getString(pResId);
    }

    /**
     * <h1>ShowSnackBar</h1>
     * <p>Shows the main activity's infinite instruction SnackBar.</p>
     */
    public void showSnackBar() {
        Snackbar.make(mBinding.activityMain, R.string.msg_tap_a_button, Snackbar.LENGTH_INDEFINITE).show();
    }

    /**
     * <h1>GoToCollapsingToolbar</h1>
     * <p>Takes the user to the {@link CollapsingToolbarActivity}</p>
     *
     * @param v the caller view
     */
    public void goToCollapsingToolbar(View v) {
        Intent goToCollapsing = new Intent(mContext, CollapsingToolbarActivity.class);
        mContext.startActivity(goToCollapsing);
    }

    /**
     * <h1>GoToCollapsingTabs</h1>
     * <p>Takes the user to the {@link com.pamobo0609.demo.view.activity.CollapsingTabsActivity}</p>
     *
     * @param v the caller view
     */
    public void goToCollapsingTabs(View v) {
        Intent goToTabs = new Intent(mContext, CollapsingTabsActivity.class);
        mContext.startActivity(goToTabs);
    }
}
