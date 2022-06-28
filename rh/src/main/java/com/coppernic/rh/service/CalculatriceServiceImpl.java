package com.coppernic.rh.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatriceServiceImpl implements CalculatriceService {

	@Override
	public int addition(int x, int y) {
		return x+y;
	}

	@Override
	public int soustraction(int x, int y) {
		return x-y;
	}

}
