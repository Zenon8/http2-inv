package ua.http.conf.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.servlet.ModelAndView
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class PushController {

    @RequestMapping(method = [(RequestMethod.GET)], value = ["/push"])
    fun push1(req: HttpServletRequest, resp: HttpServletResponse): ModelAndView {
        val pushBuilder = req.newPushBuilder()
        pushBuilder?.apply {
            for (i in 1..250) {
                pushBuilder
                        .path("res/images/space/space_$i.jpg")
                        .addHeader("content-type", "image/jpg")
                        .push()
            }
        }
        return ModelAndView("push")
    }

    @RequestMapping(method = [(RequestMethod.GET)], value = ["/push1"])
    fun push2(req: HttpServletRequest, resp: HttpServletResponse): ModelAndView {
        
        val pushBuilder = req.newPushBuilder()
        pushBuilder?.apply {
            for (i in 1..250) {
                pushBuilder
                        .path("res/images/space/space_$i.jpg")
                        .addHeader("content-type", "image/jpg")
                        .push()
            }
        }
        return ModelAndView("push")
    }
}