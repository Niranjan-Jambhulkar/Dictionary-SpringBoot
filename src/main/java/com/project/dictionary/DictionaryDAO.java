package com.project.dictionary;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DictionaryDAO {
	
	@Autowired
	private DictionaryRepository dr;
	
	public List<Dictionary> getAll(){
		return dr.findAll();
	}
	
	public Dictionary getOne(String word) {
		return dr.findByWord(word);
	}
	
	public Dictionary addWord(Dictionary d) {
		return dr.save(d);
	}
	
	public Dictionary update(Dictionary d) {
		return dr.save(d);
	}
	
	public Dictionary delete(Dictionary d) {
		dr.delete(d);
		return d;
	}
}
