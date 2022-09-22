package org.project1;

import java.util.Iterator;

public class JavaPrograms {

	public static void main(String[] args) {
		int count = 0;
		for (int n = 1; n <= 1000; n++) {
			int a, i = 0, j = 0;
			a = n;
			while (a > 0) {
			i = a % 10;
			j = (j * 10) + (i*i*i);
			a = a / 10;
			}
			if (n == j) {
				
			System.out.println(n);
			
			}
		}
	}}


