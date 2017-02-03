package com.pamobo0609.demo.util;

import android.support.v7.app.AppCompatActivity;

/**
 * @author Accenture - <a href="mailto:jose.p.monge.bonilla@accenture.com">Jose Pablo Monge Bonilla</a>
 * @since 102/02/17
 */
public interface ViewModelContact {
    interface ViewModel {
        /**
         * <h1>OnDestroy</h1>
         * <p>Called when the activity is destroyed</p>
         */
        void onDestroy();

        /**
         * <h1>GetActivity</h1>
         * <p>Returns the view model's related activity</p>
         *
         * @return the view model's related activity
         */
        AppCompatActivity getActivity();

        /**
         * <h1>GetString</h1>
         * <p>Gets a String from a given res id.</p>
         *
         * @param pResId the resource id for the String.
         * @return a String resource as a String
         */
        String getString(int pResId);
    }
}
