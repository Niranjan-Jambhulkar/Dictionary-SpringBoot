package com.project.dictionary;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DictionaryController {
	
	@Autowired
	DictionaryDAO dao;
	
	@GetMapping ("/dic")
	public List<Dictionary> getAll(){
		return dao.getAll();
	}
	
	@GetMapping ("/dic/{word}")
	public Dictionary getOne(@PathVariable String word) {
		return dao.getOne(word);
	}
	
	@PostMapping ("/dic")
	public Dictionary addWord(@RequestBody Dictionary d) {
		return dao.addWord(d);
	}
	
	@PutMapping ("/dic")
	public Dictionary update(@RequestBody Dictionary d) {
		return dao.update(d);
	}
	
	@DeleteMapping ("/dic")
	public Dictionary delete(@RequestBody Dictionary d) {
		return dao.delete(d);
	}
}
