package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.DictionaryEntity;

public interface DictionaryRepository extends JpaRepository<DictionaryEntity, String>{
	public DictionaryEntity findbyWord(String word);
}
