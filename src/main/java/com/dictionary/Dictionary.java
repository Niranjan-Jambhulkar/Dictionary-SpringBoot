package com.dictionary;

import java.util.Objects;
import com.dictionary.*;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name ="mydictionary")
public class Dictionary {
	@Id
	private String word;
	private String meaning;
	


	public Dictionary(String word, String meaning) {
		super();
		this.word = word;
		this.meaning = meaning;
	}


	public Dictionary() {
		super();
	}


	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getMeaning() {
		return meaning;
	}

	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}

	@Override
	public int hashCode() {
		return Objects.hash(word);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dictionary other = (Dictionary) obj;
		return Objects.equals(word, other.word);
	}

	@Override
	public String toString() {
		return "Dictionary [word=" + word + ", meaning=" + meaning + "]";
	}
	
	
}
