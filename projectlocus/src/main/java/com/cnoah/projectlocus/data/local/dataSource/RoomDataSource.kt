package com.cnoah.projectlocus.data.local.dataSource

import com.cnoah.projectlocus.data.LoggerDataSource
import com.cnoah.projectlocus.data.local.LocusDatabase
import com.cnoah.projectlocus.data.local.model.Logger
import kotlinx.coroutines.experimental.DefaultDispatcher
import kotlinx.coroutines.experimental.runBlocking
import kotlinx.coroutines.experimental.withContext


/**
 * Room Data Source that performs the Room database query operation by making use of the
 * respective Data Access Objects.
 */
internal object RoomDataSource : LoggerDataSource {

    private val TAG: String = RoomDataSource::class.java.simpleName
    private var loggerDb = LocusDatabase.getDatabase()

    /**
     * Function to save to provided [log] information in the database.
     */
    override fun saveLog(log: Logger): Long? = runBlocking {
        return@runBlocking withContext(DefaultDispatcher) {
            loggerDb.loggerDao().saveLog(log)
        }
    }

}