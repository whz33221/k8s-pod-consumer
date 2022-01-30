package com.whz.k8spod.swaggertest.fegin;


import com.whz.k8spod.swaggertest.entity.Order;
import io.swagger.annotations.Api;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 开发者账号
 * @author yechuyi
 * 分页查询开发者账号接口
 */
@Api(tags = "消费者调用测试")
@FeignClient(name = "ITestService",url = "http://springboot-app01:8080")
public interface ITestService {


	@GetMapping("/orders")
	public List<Order> get();

}
