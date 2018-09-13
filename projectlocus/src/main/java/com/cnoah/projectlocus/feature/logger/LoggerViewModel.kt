package com.cnoah.projectlocus.feature.logger

import android.util.Log
import com.cnoah.projectlocus.data.local.model.Logger
import com.cnoah.projectlocus.data.local.repository.LoggerRepo

/**
 * ViewModel class that acts as a medium of communication between the Logger file and the
 * local database.
 */
internal class LoggerViewModel {

    private val loggerRepo = LoggerRepo()

    /**
     * Function to save the [log] information.
     */
    fun saveLog(log: Logger) {
        loggerRepo.saveLog(log)?.let {
            if (it <= 0) Log.e(TAG, "Failed to save the log: $log")
        }
    }

    companion object {
        val TAG: String = LoggerViewModel::class.java.simpleName
    }
}