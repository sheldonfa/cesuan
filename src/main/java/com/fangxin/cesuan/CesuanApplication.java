package com.fangxin.cesuan;

import com.fangxin.cesuan.utils.IdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class CesuanApplication {

	public static void main(String[] args) {
		SpringApplication.run(CesuanApplication.class, args);
	}

	//统一初始化idWorker
	@Bean
	public IdWorker idWorker(){
		return new IdWorker();
	}
}
