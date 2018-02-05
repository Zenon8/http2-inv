package ua.http.conf.filter

import javax.servlet.Filter
import javax.servlet.FilterChain
import javax.servlet.ServletRequest
import javax.servlet.ServletResponse
import javax.servlet.annotation.WebFilter

@WebFilter(urlPatterns = ["/*"])
class PushFilter : Filter {

    override fun doFilter(req: ServletRequest, resp: ServletResponse, chain: FilterChain) {
//        val httpRequest: HttpServletRequest = req as HttpServletRequest
//        val requestURI = httpRequest.requestURI
//        val pushBuilder = httpRequest.newPushBuilder()
//
//        when (requestURI) {
//            "index.html" -> {
//                pushBuilder?.path("res/style.css")?.push()
//                pushBuilder?.path("res/images/tiger.jpg")?.push()
//            }
//            else -> pushBuilder?.path("/nature.png")?.push()
//        }
        chain.doFilter(req, resp)
    }
}