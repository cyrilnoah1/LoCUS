package com.cnoah.projectlocus.data.local.room.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.cnoah.projectlocus.data.local.model.Logger

import com.cnoah.projectlocus.data.local.model.Logger.Companion.LogType as Type

/**
 * Data Access Object to perform SQLite database query operations,
 * and provide appropriate responses.
 */
@Dao
internal interface LoggerDao {

    /**
     * Function to retrieve all the logs from the database.
     */
    @Query("SELECT * from Logger")
    fun getLogs(): List<Logger>

    /**
     * Function to retrieve a list of logs based on its [Type].
     */
    @Query("SELECT * from Logger where log_type = :logType")
    fun getLogsByType(logType: Int): List<Logger>

    /**
     * Function to save to logs to the database.
     * <br/>
     * This function returns a [Long] value based on the outcome of the operation.
     * The value is greater than zero for success and zero for failure.
     */
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun saveLog(log: Logger): Long
}