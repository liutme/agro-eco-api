package com.lzr.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//(exclude = {DataSourceAutoConfiguration.class})// 排除DataSourceAutoConfiguration此类的autoconfig。启动以后就可以正常运行。这是因为添加了数据库组件，所以autoconfig会去读取数据源配置，而我新建的项目还没有配置数据源，所以会导致异常出现。
@MapperScan("com.lzr.api.mapper")

public class AgroEcoApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(AgroEcoApiApplication.class, args);
    }
}
