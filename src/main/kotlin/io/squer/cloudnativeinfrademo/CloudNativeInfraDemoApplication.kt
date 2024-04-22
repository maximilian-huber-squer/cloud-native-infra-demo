package io.squer.cloudnativeinfrademo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CloudNativeInfraDemoApplication

fun main(args: Array<String>) {
	runApplication<CloudNativeInfraDemoApplication>(*args)
}
