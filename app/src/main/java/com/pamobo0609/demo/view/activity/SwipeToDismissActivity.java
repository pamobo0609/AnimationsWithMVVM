package com.pamobo0609.demo.view.activity;

import android.databinding.DataBindingUtil;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.design.widget.SwipeDismissBehavior;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.pamobo0609.demo.R;
import com.pamobo0609.demo.databinding.ActivitySwipeToDismissBinding;

public class SwipeToDismissActivity extends AppCompatActivity {

    /**
     * The activity binding object
     **/
    private ActivitySwipeToDismissBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_swipe_to_dismiss);
        // Add the behavior for the CardView dismissing
        final SwipeDismissBehavior<CardView> swipe = new SwipeDismissBehavior();

        swipe.setSwipeDirection(SwipeDismissBehavior.SWIPE_DIRECTION_START_TO_END);

        swipe.setListener(new SwipeDismissBehavior.OnDismissListener() {
                    @Override public void onDismiss(View view) {
                        Snackbar.make(mBinding.activitySwipeToDismiss, R.string.msg_swiped, Snackbar.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onDragStateChanged(int state) {}
                });

        CoordinatorLayout.LayoutParams coordinatorParams = (CoordinatorLayout.LayoutParams) mBinding.cvMain.getLayoutParams();

        coordinatorParams.setBehavior(swipe);
    }

}
