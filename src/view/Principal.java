package view;

import Controller.Fatorial;

public class Principal {

	public static void main(String[] args) {
		Fatorial fat = new Fatorial();
		int N=10;
		int res = fat.Fat(N);
		System.out.println(res);
	}
}
