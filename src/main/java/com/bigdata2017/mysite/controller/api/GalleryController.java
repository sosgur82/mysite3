package com.bigdata2017.mysite.controller.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("gallery")
public class GalleryController {
	@RequestMapping("")
	public String index() {
		return "gallery/index";
	}
}