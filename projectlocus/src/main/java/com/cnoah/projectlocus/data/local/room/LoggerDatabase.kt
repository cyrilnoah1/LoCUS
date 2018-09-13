package com.cnoah.projectlocus.data.local.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.cnoah.projectlocus.data.local.model.Logger
import com.cnoah.projectlocus.data.local.room.dao.LoggerDao

/**
 * [RoomDatabase] class to provide the data access object that helps execute
 * database queries.
 */
@Database(entities = [Logger::class], version = 1)
internal abstract class LoggerDatabase : RoomDatabase() {

    /**
     * DAO to execute log related queries.
     */
    abstract fun loggerDao(): LoggerDao
}