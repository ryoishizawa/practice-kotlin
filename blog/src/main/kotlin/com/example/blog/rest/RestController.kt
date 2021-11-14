package com.example.blog.rest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@RestController
@RequestMapping("/api")
class RestController {

    @GetMapping("/param")
    fun get(request: HttpServletRequest, response: HttpServletResponse, entity: ParameterEntity): String {
        println(entity)
        // call java class -> fails..
//        val service = RestService()
//        service.print()
        return "success"
    }
}