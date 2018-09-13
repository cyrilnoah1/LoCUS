package com.cnoah.projectlocus.data.local.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * The [Logger] model acts as the [Entity]/Table for the storage of log information inside the
 * local database.
 */
@Entity
internal data class Logger(
        @ColumnInfo(name = TIMESTAMP) val timeStamp: String,
        @ColumnInfo(name = MESSAGE) val message: String,
        @ColumnInfo(name = CLASS_PATH) val classPath: String,
        @ColumnInfo(name = LOG_TYPE) val logType: Int
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0

    companion object {

        const val ID = "id"
        const val TIMESTAMP = "timestamp"
        const val MESSAGE = "message"
        const val CLASS_PATH = "class_path"
        const val LOG_TYPE = "log_type"

        /**
         * Enumerated class the determine the [LogType] of the log being stored.
         */
        enum class LogType { DEBUG, ERROR, INFORMATION, WARNING, WTF }
    }
}