package net.wisfaith;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication(scanBasePackages = {
        "net.wisfaith.mapper",
        "net.wisfaith.config",
        "net.wisfaith.controller",
        "net.wisfaith.service"
})    //Spring boot必须
@MapperScan("net.wisfaith.mapper")
@EntityScan({
        "net.wisfaith.bean.User",
        "net.wisfaith.bean.ResultVO"
})
@EnableScheduling
public class Application {
    public static void main(String[] args) {


        SpringApplication.run(Application.class, args);

    }
}
