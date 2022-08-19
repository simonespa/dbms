package core;

import java.io.InputStream;
import java.io.Reader;

import dataStructures.Query;
import dataStructures.ResultSet;

import parser.ParseException;
import parser.Parser;

public class Dbms implements Runnable {
	Parser parser;
	private boolean alive = true;

	public Dbms(InputStream is) {
		parser = new Parser(is);
	}

	public Dbms(Reader reader) {
		parser = new Parser(reader);
	}

	public synchronized boolean isAlive() {
		return alive;
	}

	public synchronized void setAlive(boolean alive) {
		this.alive = alive;
	}

	public void run() {
		Query query;
		while (isAlive()) {
			try {
				query = parser.query();
				Object o = query.execute();
				if (o instanceof ResultSet)
					System.out.println(o);
			} catch (Exception e) {
				e.printStackTrace();
				break;
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to my DBMS...");
		Dbms dbms = new Dbms(System.in);
		Thread t = new Thread(dbms);
		t.start();
	}
}
