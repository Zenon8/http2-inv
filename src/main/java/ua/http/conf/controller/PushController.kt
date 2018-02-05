package ua.http.conf.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.servlet.ModelAndView
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@Controller
class PushController {

    @RequestMapping(method = [(RequestMethod.GET)], value = ["/sample1"])
    fun push1(req: HttpServletRequest, resp: HttpServletResponse): ModelAndView {
        val pushBuilder = req.newPushBuilder()
        pushBuilder?.path("res/css/style.css")?.push()
        pushBuilder?.path("res/js/common.js")?.push()
        pushBuilder?.path("res/images/background.jpg")?.push()

        return ModelAndView("sample1")
    }

    @RequestMapping(method = [(RequestMethod.GET)], value = ["/sample2"])
    fun push2(req: HttpServletRequest, resp: HttpServletResponse): ModelAndView {
        val pushBuilder = req.newPushBuilder()
        pushBuilder?.apply {
            for (i in 1..400) {
                pushBuilder
                        .path("res/images/space/space_$i.jpg")
                        .addHeader("content-type", "image/jpg")
                        .push()
            }
        }
        return ModelAndView("sample2")
    }
}