package io.squer.cloudnativeinfrademo
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
@RestController
class GreetingController {
    @GetMapping("/")
    fun greetMe(@RequestParam("name") name: String) = "Hello, $name!"
}
