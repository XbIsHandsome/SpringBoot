package cn.troubleme.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @author : 许兵
 * @time   : 2018-08-07 09:26:48
 * @E-mail : troubleme@aliyun.com
 * @Wechat ：玖弦与柒墨
 */

@SpringBootApplication
public class SpringbootApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringbootApplication.class);
    }

    public static void main(String[] args){
        SpringApplication.run(SpringbootApplication.class, args);
    }


}
