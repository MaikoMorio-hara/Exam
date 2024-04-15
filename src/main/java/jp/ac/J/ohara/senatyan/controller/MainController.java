package jp.ac.J.ohara.senatyan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//メニュー
@Controller
public class MainController {
	@GetMapping("/top/")
	public String index(Model model) {
	//	model.addAttribute("message","こんにちは");
		return "top";
	}
//	@GetMapping("/add/")
//	public ModelAndView add(ScheduleBook scheduleBook, ModelAndView model) {
//		model.addObject("schedulebook", scheduleBook);
//		model.setViewName("add");
//		return model;
//	}
//	@PostMapping("/add/")
//	public String add(@Validated @ModelAttribute @NonNull ScheduleBook scheduleBook, RedirectAttributes result, ModelAndView model, RedirectAttributes redirectAttributes) {
//		try {
//			this.scheduleBookService.save(scheduleBook);
//			redirectAttributes.addFlashAttribute("exception", "");
//		}catch(Exception e){
//			redirectAttributes.addFlashAttribute("exception", e.getMessage());
//		}
}
