package io.github.apwlq.schoolmealinfo

import java.io.*
import java.util.*


fun main()  {
    print("[점심]\n${getLunch()}")
    val prop = Properties()
    val file = File("assets/config/drawing.properties")
    FileInputStream(file).use { fileInputStream ->
        InputStreamReader(fileInputStream, "UTF-8").use { inputStreamReader ->
            prop.load(inputStreamReader)
        }
    }
    genImage("${prop["lunch"].toString()}\n${getLunch()}")
}
//🗕🗗🗙