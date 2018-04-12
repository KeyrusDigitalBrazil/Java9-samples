package br.com.keyrus.commerce.front;

import br.com.keyrus.commerce.services.interfaces.KeyrusService;

public class Main {

	public static void main(String[] args) {
		KeyrusService keyrusService = KeyrusService.getInstance();

		System.out.println(keyrusService.getKeyrusName());
	}

}