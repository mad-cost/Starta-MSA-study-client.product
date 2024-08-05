package com.spring_cloud.eureka.client.product;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope // 설정 파일이 변경되었을 때 애플리케이션을 재시작하지 않고도 새로운 설정을 적용할 수 있게 해준다.
@RestController
public class ProductController {

  @Value("${server.port}") // 애플리케이션이 실행 중인 포트를 주입받습니다.
  private String serverPort;

  @Value("${message}")
  private String message;

  @GetMapping("/product")
  public String getProduct(
  ) {
    return "Product info!!!!! From port : " + serverPort + "and message : " + message ;
  }


}
