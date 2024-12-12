package com.dq.springboot_recruit;
/**

*/
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.dq.springboot_recruit.mapper")
@SpringBootApplication
public class StartApplicaiton {
	public static void main(String[] args) {
		SpringApplication.run(StartApplicaiton.class, args);
	}
}
