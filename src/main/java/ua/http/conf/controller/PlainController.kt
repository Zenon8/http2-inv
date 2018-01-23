package ua.http.conf.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.servlet.ModelAndView
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@Controller
class PlainController {

    @RequestMapping(method = [(RequestMethod.GET)], value = ["/plant"])
    fun sample(req: HttpServletRequest, resp: HttpServletResponse): ModelAndView {
        val pushBuilder = req.newPushBuilder()
        pushBuilder?.apply {
//            pushBuilder.path("res/images/logo.png").push()
//            pushBuilder.path("res/images/background.jpg").push()
//            pushBuilder.path("res/images/header_1.jpg").push()

            pushBuilder.path("res/css/style.css").push()
            for (i in 1..400) {
                pushBuilder
                        .path("res/images/tiger/tiger_$i.jpg")
                        .addHeader("content-type", "image/jpg")
                        .push()
            }
        }
        return ModelAndView("main2")
    }
}
