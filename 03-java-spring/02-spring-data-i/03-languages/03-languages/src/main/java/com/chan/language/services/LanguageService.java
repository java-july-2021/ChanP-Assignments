package com.chan.language.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.chan.language.models.Language;
import com.chan.language.repositories.LanguageRepository;

@Service
public class LanguageService {
	private final LanguageRepository langRepo;
	public LanguageService(LanguageRepository repo) {
		this.langRepo = repo;
	}
	
	public List<Language> allLanguages() {
		return this.langRepo.findAll();
	}
	
	public Language findLanguage(Long id) {
		return this.langRepo.findById(id).orElse(null);
	}
	
	public Language createLanguage(Language nLang) {
		return this.langRepo.save(nLang);
	}
	
	public Language updateLanguage(Language upLang) {
		return this.langRepo.save(upLang);
	}
	
	public void deleteLanguage(Long id) {
		this.langRepo.deleteById(id);
	}
}
