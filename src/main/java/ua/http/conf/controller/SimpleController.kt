package ua.http.conf.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@Controller
class SimpleController {

    @RequestMapping("/httpsample")
    fun getHttpSample(req: HttpServletRequest, resp: HttpServletResponse): String {

        val push = req.newPushBuilder()

        push?.path("/resources/images/logo.png")?.push()
        push?.path("/resources/images/background.jpg")?.push()
        push?.path("/resources/css/style.css")?.push()


        val a = req.newPushBuilder()
        a?.path("/res/images/background.jpg")?.push()
        return "Simple HTTP/2 message = $a"
    }

    @RequestMapping("/httpsample1")
    fun getHttpSample1(req: HttpServletRequest, resp: HttpServletResponse): String {

        val push = req.newPushBuilder()

        push?.path("res/images/logo.png")?.push()
        push?.path("res/images/background.jpg")?.push()
        push?.path("res/css/style.css")?.push()

        return "Simple HTTP/2 message = $push"
    }

    @RequestMapping("/httpsample2", produces = ["*/*"], method = [(RequestMethod.GET)])
    fun getHttpSample2(req: HttpServletRequest, resp: HttpServletResponse): String {

        val push = req.newPushBuilder()

        push?.path("res/images/logo.png")?.push()
        push?.path("res/images/background.jpg")?.push()
        push?.path("res/css/style.css")?.push()


        return "Simple HTTP/2 message = $push"
    }

    @RequestMapping("/httpsample3", produces = ["*/*"], method = [(RequestMethod.GET)])
    fun getHttpSample3(req: HttpServletRequest, resp: HttpServletResponse): String {

        val push = req.newPushBuilder()

        push?.path("res/images/logo.png")?.method("GET")?.push()
//        push?.path("res/images/background.jpg")?.method("GET")?.push()
        push?.path("res/css/style.css")?.push()


        return "main2"
    }

    @RequestMapping("/main1")
    fun getMain1(req: HttpServletRequest, resp: HttpServletResponse): String {
//        val push = req.newPushBuilder()
//        push?.path("res/images/logo.png")?.push()
//        push?.path("res/images/background.jpg")?.push()
//        push?.path("res/css/style.css")?.push()

        return "main2"
    }
}



