package ua.http.conf.config

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse


open class WebConfig : WebMvcConfigurerAdapter() {

    override fun addInterceptors(registry: InterceptorRegistry?) {
        registry!!.addInterceptor(object : HandlerInterceptorAdapter() {
            @Throws(Exception::class)
            override fun preHandle(
                    request: HttpServletRequest?, response: HttpServletResponse?, handler: Any?): Boolean {
                response!!.characterEncoding = "UTF-8"
                return true
            }
        })
    }

    override fun addResourceHandlers(registry: ResourceHandlerRegistry?) {
        registry!!.addResourceHandler("/**").addResourceLocations("/resources/")
    }
}
