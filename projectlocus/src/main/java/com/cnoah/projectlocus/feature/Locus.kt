package com.cnoah.projectlocus.feature

import android.content.Context

/**
 * Initializer class to initialize to <b>LoCUS</b> library.
 */
class Locus {

    companion object {

        /**
         * <b>Application context</b> that is required for performing database operations.
         */
        private var appContext: Context? = null

        /**
         * Function to initialize the library.
         */
        fun init(applicationContext: Context) {
            appContext = applicationContext
        }

        /**
         * Function to provide the application context internally throughout the library.
         * </br>
         * The <i>application context</i> provided by this function is required to perform database
         * operations, display Toasts, and so on.
         */
        internal fun getAppContext() = appContext
    }
}