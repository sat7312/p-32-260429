package com.back.ch17

import java.io.File
import java.nio.file.Files
import java.nio.file.StandardCopyOption

fun main() {
    runCatching {
        Files.copy(File("a.txt").toPath(), File("a_copy.txt").toPath(), StandardCopyOption.REPLACE_EXISTING)
    }

}