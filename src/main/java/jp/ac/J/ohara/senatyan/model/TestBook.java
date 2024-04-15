package jp.ac.J.ohara.senatyan.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
	

@Data
@Entity
@Table(name = "TEST")
public class TestBook {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	//学生番号
	@Column(length = 10, nullable = false)
	private String STUDENT_NO;
	
	//科目コード
	@Column(length = 3, nullable = false)
	private String SUBJECT_CD;
	
	//学校コード
	@Column(length = 10, nullable = false)
	private String SCHOOL_CD;
	
	//回数
	@Column(length = 10, nullable = false)
	private String NO;
	
	//得点
	@Column(length = 10, nullable = true)
	private String POINT;
	
	//クラス番号
	@Column(length = 5, nullable = true)
	private String CLASS_NUM;
}