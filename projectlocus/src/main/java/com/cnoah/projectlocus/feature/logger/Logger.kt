package com.cnoah.projectlocus.feature.logger

import android.util.Log
import com.cnoah.projectlocus.common.LOG_DATE_FORMAT
import com.cnoah.projectlocus.data.local.model.Logger
import java.text.SimpleDateFormat
import java.util.*
import com.cnoah.projectlocus.data.local.model.Logger.Companion.LogType as Type

/**
 * The Logger file exposes the logging API that can be used to both store the required logs in the
 * local database and print the logs on the console.
 */


private val viewModel = LoggerViewModel()

/**
 * Log function to print and store [Type.INFORMATION] messages and its respective information.
 */
fun logI(javaClass: Class<Any>, message: String, tag: String? = null) {
    val logTag = tag ?: javaClass.simpleName
    // Printing the log to the console.
    Log.d(logTag, message)
    // Saving the log information to the local database.
    saveLogToDb(javaClass, message, Type.INFORMATION)
}

/**
 * Log function to print and store [Type.DEBUG] messages and its respective information.
 */
fun logD(javaClass: Class<Any>, message: String, tag: String? = null) {
    val logTag = tag ?: javaClass.simpleName
    // Printing the log to the console.
    Log.d(logTag, message)
    // Saving the log information to the local database.
    saveLogToDb(javaClass, message, Type.DEBUG)
}

/**
 * Log function to print and store [Type.WARNING] messages and its respective information.
 */
fun logW(javaClass: Class<Any>, message: String, tag: String? = null) {
    val logTag = tag ?: javaClass.simpleName
    // Printing the log to the console.
    Log.d(logTag, message)
    // Saving the log information to the local database.
    saveLogToDb(javaClass, message, Type.WARNING)
}

/**
 * Log function to print and store [Type.DEBUG] messages and its respective information.
 */
fun logE(javaClass: Class<Any>, message: String, tag: String? = null) {
    val logTag = tag ?: javaClass.simpleName
    // Printing the log to the console.
    Log.d(logTag, message)
    // Saving the log information to the local database.
    saveLogToDb(javaClass, message, Type.ERROR)
}

/**
 * Log function to print and store [Type.DEBUG] messages and its respective information.
 */
fun logWTF(javaClass: Class<Any>, message: String, tag: String? = null) {
    val logTag = tag ?: javaClass.simpleName
    // Printing the log to the console.
    Log.d(logTag, message)
    // Saving the log information to the local database.
    saveLogToDb(javaClass, message, Type.WTF)
}

/**
 * Function to save the respective log to the local database.
 */
private fun saveLogToDb(javaClass: Class<Any>, message: String, logType: Type) {

    val log = Logger(
            SimpleDateFormat(LOG_DATE_FORMAT, Locale.getDefault()).format(Date()),
            message,
            javaClass.`package`?.name ?: javaClass.simpleName,
            logType.ordinal
    )

    viewModel.saveLog(log)
}