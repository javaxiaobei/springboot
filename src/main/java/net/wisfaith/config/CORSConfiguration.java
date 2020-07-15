package net.wisfaith.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 功能:  CORS跨域访问
 *
 * @Auther 李帅
 * @Data 2017-11-19.下午 4:41
 */
@Configuration
public class CORSConfiguration extends WebMvcConfigurerAdapter {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry
                //配置可以被跨域的路径，可以任意配置，可以具体到直接请求路径。
                .addMapping("/**")
                //允许所有的请求方法访问该跨域资源服务器，如：POST、GET、PUT、DELETE等。
                .allowedMethods("*")
                //允许所有的请求域名访问我们的跨域资源，可以固定单条或者多条内容
                .allowedOrigins("*")
                //允许所有的请求header访问，可以自定义设置任意请求头信息，如："X-YAUTH-TOKEN"
                .allowedHeaders("*");
    }
}

