package jp.co.sss.practice.p02.q01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Practice0201Controller {

	@RequestMapping(path = "/first")
	public String melon() {
		return "practice02/01/before_redirect";
	}

	@RequestMapping(path = "/second")
	public String watermelon() {
		return "practice02/01/after_redirect";
	}

	@RequestMapping(path = "/third")
	public String gourd() {
		return "practice02/01/after_redirect";
	}
}
