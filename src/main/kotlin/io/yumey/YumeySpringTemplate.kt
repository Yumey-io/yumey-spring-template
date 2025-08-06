package io.yumey

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class YumeySpringTemplate

fun main(args: Array<String>) {
    runApplication<YumeySpringTemplate>(*args)
}
