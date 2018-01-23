package ua.http.conf.config

class WebAppInitializer {

    fun getRootConfigClasses(): Array<Class<*>> {
        return arrayOf(WebConfig::class.java)
    }

    fun getServletConfigClasses(): Array<Class<*>> {
        return arrayOf(DispatcherServletConfig::class.java)
    }

    fun getServletMappings(): Array<String> {
        return arrayOf("/")
    }
}
