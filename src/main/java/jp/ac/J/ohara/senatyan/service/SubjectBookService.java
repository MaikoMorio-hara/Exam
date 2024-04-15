package jp.ac.J.ohara.senatyan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import jp.ac.J.ohara.senatyan.model.SubjectBook;
import jp.ac.J.ohara.senatyan.repository.SubjectBookRepository;

@Service
@Transactional
public class SubjectBookService {

	@Autowired
	private SubjectBookRepository repository;


	/**
	 * ユーザー一覧の取得
	 * @return List<SubjectBook>
	 */
	public List<SubjectBook> getSubjectList() {
	    List<SubjectBook> entityList = this.repository.findAll();
	    return entityList;
	}

	/**
	 * 詳細データの取得
	 * @param @NonNull Long index
	 * @return  SubjectBook
	 */
	public SubjectBook get(@NonNull Long index) {
		SubjectBook subjectBook = this.repository.findById(index).orElse(new SubjectBook());
		return subjectBook;
	}

	/**
	 * データの保存
	 * @param SubjectBook subjectBook
	 */
	public void save(@NonNull SubjectBook subjectBook) {
		this.repository.save(subjectBook);
	}

	/**
	 * データの削除
	 * @param @NonNull Long index
	 */
	public void delete(@NonNull Long index) {
		this.repository.deleteById(index);
	}
}
