package com.groupmaster.chatapp.data

import android.content.Context
import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader

data class Contact(val name: String, val phone: String)

class CSVReader(private val context: Context) {
    fun readCSV(inputStream: InputStream): List<Contact> {
        val contacts = mutableListOf<Contact>()
        val reader = BufferedReader(InputStreamReader(inputStream))
        reader.forEachLine { line ->
            val tokens = line.split(",")
            if (tokens.size >= 2) {
                contacts.add(Contact(tokens[0].trim(), tokens[1].trim()))
            }
        }
        reader.close()
        return contacts
    }
}
