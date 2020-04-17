package com.example.demo.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Rate;

@Controller
@RefreshScope
public class RateController {
	
	@Value("${rate}")
	public String rate;
	
	@Value("${lanecount}")
	public String laneCount;
	
	@Value("${tollStart}")
	public String tollStart;
	
	@Value("${connstring}")
	private String connstring;

	@RequestMapping("/rate")
	public ResponseEntity<Rate> getRate() {
		Rate rate_o = new Rate(rate,laneCount,tollStart,connstring);
		
		return new ResponseEntity<Rate>(rate_o,HttpStatus.OK);
		
	}
}
