package jp.ac.J.ohara.senatyan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jp.ac.J.ohara.senatyan.model.SignupForm;
import jp.ac.J.ohara.senatyan.model.StudentBook;
import jp.ac.J.ohara.senatyan.service.StudentBookService;


//アカウント作成
@Controller
public class SignupController {
	@Autowired
	StudentBookService studentBookService;
    @GetMapping("/signup/")
    public String getSignUp(@ModelAttribute SignupForm form, Model model) {
    	model.addAttribute("signupForm", form);
        return "signup";
    }
    
    @GetMapping("/signupcomplete/")
    public String getSignUpComplete(@ModelAttribute SignupForm form, Model model) {
    	model.addAttribute("signupForm", form);
        return "signupcomplete";
    }

    @PostMapping("/signup/")
    public String postSignUp(@ModelAttribute @Validated StudentBook studentBook,SignupForm form, BindingResult bindingResult, Model model) {
    	this.studentBookService.save(studentBook);
    	//入力を失敗した場合、ユーザー登録画面に戻る
    	if (bindingResult.hasErrors()) {
    		return getSignUp(form, model);
    	}
    	//formの中身をコンソールに表示
    	System.out.println(form);
    	
    	return "redirect:/signupcomplete/";
    }
    
}
