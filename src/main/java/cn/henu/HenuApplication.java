package cn.henu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("cn.henu.dao") //配置mybatis扫描的mapper路径

@EnableTransactionManagement
public class HenuApplication {
    public static void main(String[] args) {
        SpringApplication.run(HenuApplication.class, args);
    }
}
