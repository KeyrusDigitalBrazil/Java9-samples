package br.com.keyrus.commerce.services.impl;

import br.com.keyrus.commerce.services.interfaces.KeyrusService;
import br.com.keyrus.commerce.services.dao.KeyrusDao;

public class DefaultKeyrusService implements KeyrusService {

	private KeyrusDao keyrusDao;

	public DefaultKeyrusService() {
		keyrusDao = new KeyrusDao();
	}

	public String getKeyrusName() {
		return keyrusDao.findKeyrusName();
	}

}