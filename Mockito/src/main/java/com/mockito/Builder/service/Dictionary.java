package com.mockito.Builder.service;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {

	
	private Map<String,String> words=new HashMap<String, String>();
	
	public void add(String words_dict,String meaning)
	{
		words.put(words_dict, meaning);
		
	}
	
	public String getMeaning(String word_dict)
	{
		return words.get(word_dict);
	}
}
