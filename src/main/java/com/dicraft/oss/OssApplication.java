package com.dicraft.oss;

import lombok.extern.log4j.Log4j2;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@Log4j2
@MapperScan(value = {"com.dicraft.oss.modules.sys.system.mapper",
        "com.dicraft.oss.modules.sys.config.mapper",
        "com.dicraft.oss.modules.sys.depart.mapper",
        "com.dicraft.oss.modules.exam.mapper",
        "com.dicraft.oss.modules.paper.mapper",
        "com.dicraft.oss.modules.sys.user.mapper",
        "com.dicraft.oss.modules.qu.mapper",
        "com.dicraft.oss.modules.repo.mapper",
        "com.dicraft.oss.modules.user.book.mapper",
        "com.dicraft.oss.modules.user.exam.mapper"
})
@SpringBootApplication
public class OssApplication {

    public static void main(String[] args) {
        SpringApplication.run(OssApplication.class, args);
    }

}
