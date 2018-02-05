package ua.http.conf.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.servlet.ModelAndView
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@Controller
class LoadController {

    @RequestMapping(method = [(RequestMethod.GET)], value = ["/load_1"])
    fun load1(req: HttpServletRequest, resp: HttpServletResponse): ModelAndView {
        return ModelAndView("load1")
    }

    @RequestMapping(method = [(RequestMethod.GET)], value = ["/load_2"])
    fun load2(req: HttpServletRequest, resp: HttpServletResponse): ModelAndView {
        return ModelAndView("load2")
    }


    @RequestMapping(method = [(RequestMethod.GET)], value = ["/load_3"])
    fun load3(req: HttpServletRequest, resp: HttpServletResponse): ModelAndView {
        return ModelAndView("load3")
    }


    @RequestMapping(method = [(RequestMethod.GET)], value = ["/load_4"])
    fun load4(req: HttpServletRequest, resp: HttpServletResponse): ModelAndView {
        return ModelAndView("load4")
    }


    @RequestMapping(method = [(RequestMethod.GET)], value = ["/load_5"])
    fun load5(req: HttpServletRequest, resp: HttpServletResponse): ModelAndView {
        return ModelAndView("load5")
    }


    @RequestMapping(method = [(RequestMethod.GET)], value = ["/load_6"])
    fun load6(req: HttpServletRequest, resp: HttpServletResponse): ModelAndView {
        return ModelAndView("load6")
    }
}
