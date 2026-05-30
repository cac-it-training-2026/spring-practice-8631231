package jp.co.sss.practice.p04.q02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpSession;

@Controller
public class Practice0402Controller {

	@RequestMapping(path = "/numguess/start", method = RequestMethod.GET)
	public String melon(HttpSession session) {

		Integer hitNumber = (int) (Math.floor(Math.random() * 9) + 1);
		return "practice04/02/numguess_start";
	}

}
