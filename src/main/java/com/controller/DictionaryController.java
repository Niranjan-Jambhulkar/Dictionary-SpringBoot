package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.DictionaryEntity;
import com.service.DictionaryService;

@RestController
public class DictionaryController {
	
	@Autowired
	private DictionaryService ds;
	
	@PostMapping("/dt")
	public DictionaryEntity addWord(@RequestBody DictionaryEntity d) {
		return ds.addWord(d);
	}
	
	@PutMapping("/dt")
	public DictionaryEntity update(@RequestBody DictionaryEntity d) {
		return ds.updateWord(d);
	}
	
	@GetMapping("/dt")
	public List<DictionaryEntity> getAll() {
		return ds.findAll();
	}
}
