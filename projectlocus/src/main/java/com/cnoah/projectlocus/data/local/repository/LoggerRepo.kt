package com.cnoah.projectlocus.data.local.repository

import com.cnoah.projectlocus.data.LoggerDataSource
import com.cnoah.projectlocus.data.local.dataSource.RoomDataSource
import com.cnoah.projectlocus.data.local.model.Logger


/**
 * Repository to act as the single source of truth for the ViewModels when performing the
 * query operations related to logging functionality.
 */
internal class LoggerRepo : LoggerDataSource {

    /**
     * Saving the [log] information to the database.
     */
    override fun saveLog(log: Logger): Long? = RoomDataSource.saveLog(log)
}