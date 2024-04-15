package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.DictionaryEntity;
import com.repository.DictionaryRepository;

@Service
public class DictionaryService {
	
	@Autowired
	private DictionaryRepository dr;
	
	public DictionaryEntity addWord(DictionaryEntity d) {
		return dr.save(d);
	}
	
	public DictionaryEntity updateWord(DictionaryEntity d) {
		return dr.save(d);
	}
	
	public DictionaryEntity getMeaning(String word) {
		return dr.findbyWord(word);
	}
	
	public List<DictionaryEntity> findAll(){
		return dr.findAll();
	}
	
	public DictionaryEntity delete(DictionaryEntity d) {
		dr.delete(d);
		return d;
	}
	
	

}
