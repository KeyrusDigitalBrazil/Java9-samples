package br.com.keyrus.commerce.services.interfaces;

import br.com.keyrus.commerce.services.impl.DefaultKeyrusService;

public interface KeyrusService {

	static KeyrusService getInstance() {
		return new DefaultKeyrusService();
	}
	
	String getKeyrusName();

}