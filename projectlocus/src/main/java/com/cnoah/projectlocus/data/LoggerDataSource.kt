package com.cnoah.projectlocus.data

import com.cnoah.projectlocus.data.local.model.Logger


/**
 * DataSource interface to act as the contract between the repository and data source
 * designated to perform logger related query operations.
 */
internal interface LoggerDataSource {

    /**
     * Function to save the log to the database.
     */
    fun saveLog(log: Logger): Long?
}