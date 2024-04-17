package com.project.dictionary;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DictionaryRepository extends JpaRepository<Dictionary, String> {
	public Dictionary findByWord(String word);
}
