package com.back.domain.home.home.controller

import com.back.standard.extensions.logger
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import java.net.InetAddress


@Controller
class HomeController {
    private val log = logger()

    @GetMapping("/")
    @ResponseBody
    fun main(): String {
        val localHost = InetAddress.getLocalHost()

        val hostname = localHost.hostName

        println("모든 환경에서 출력")
        log.debug("개발/테스트 환경에서만 출력")

        return "main(execution : 2nd), hostname : $hostname"
    }
}