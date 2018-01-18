package com.gt.axis.web;

import com.gt.api.exception.SignException;
import com.gt.api.util.sign.SignHttpUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AxisWebApplicationTests {

	@Test
	public void contextLoads() {
		System.out.println("==========================quan=======================");
		String url = "http://member.yifriend.net/memberAPI/member/findMemberByIds";
		String signKey = "MV8MMFQUMU1HJ6F2GNH40ZFJJ7Q8LNVM";
		Map<String,Object> params = new HashMap<>();
		params.put("busId",562);
		params.put("ids","130,140");
		String result = null;
		try {
			result = SignHttpUtils.WxmppostByHttp(url, params, signKey);
			System.err.println(result);
		} catch (SignException e) {
			e.printStackTrace();
		}
	}

}
