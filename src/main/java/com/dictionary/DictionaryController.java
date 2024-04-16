package com.dictionary;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DictionaryController {
	
	@Autowired
	DictionaryRepository dr;
	
	@GetMapping ("/dic")
	public List<Dictionary> getAll(){
		return dr.findAll();
	}

}
