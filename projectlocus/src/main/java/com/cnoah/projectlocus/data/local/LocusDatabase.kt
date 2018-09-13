package com.cnoah.projectlocus.data.local

import androidx.room.Room
import com.cnoah.projectlocus.data.local.room.LoggerDatabase
import com.cnoah.projectlocus.feature.Locus

/**
 * Singleton to provide the [Room] database object.
 */
internal object LocusDatabase {

    private const val DB_NAME = "locus"

    private var database: LoggerDatabase? = null

    /**
     * Function to provide the [Room] database object.
     */
    fun getDatabase(): LoggerDatabase {

        Locus.getAppContext()?.let {

            if (database == null) {
                database = Room.databaseBuilder(it, LoggerDatabase::class.java, DB_NAME).build()
            }

            // Exclusively stating the database object as not-null
            // as it is initialized above for the first time.
            return database!!
        }

        // Throwing an exception if the library is not initialised.
        throw NullPointerException(
                """Library not initialised:
                |Initialise the Locus library by calling Locus.init().
                """.trimMargin()
        )
    }
}