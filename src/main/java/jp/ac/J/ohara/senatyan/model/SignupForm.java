package jp.ac.J.ohara.senatyan.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class SignupForm {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	//学生番号
	@NotBlank
	private String NO;
	
	//パスワード
	@NotBlank
	private String password;
	
}
