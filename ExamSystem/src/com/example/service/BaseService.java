package com.example.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class BaseService {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public abstract void create() throws IOException;
}
