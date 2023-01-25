package com.bootcamp.learning.anonymous;

import com.bootcamp.learning.ConcreteFromAbstract;

public class Runner {
	 static String myVariable;

	public static void main(String[] args) {
		MyInterface myInterface = new MyInterface() {

			@Override
			public void myMethod(int x) {
				System.out.print(x);
			}
		};

		System.out.println("myInterface:" + myInterface.getClass().getName());
		ConcreteFromAbstract test = new ConcreteFromAbstract();

		System.out.println("test:" + test.getClass().getName());
		test.learnSomething();

		ConcreteFromAbstract test2 = new ConcreteFromAbstract() {
			@Override
			public void learnSomething() {
				System.out.println("I am learning anonymous classes");
			}
		};
		System.out.println("test2:" + test2.getClass().getName());
		test2.learnSomething();

		Runner x = new Runner();
		Insider insider = x.new Insider() {
			public void show(String x) {
				System.out.println(this.getClass().getName());
				System.out.println(myVariable);
			}

			public Insider greet() {
				System.out.println("Hello");
				return this;
			}
		}.greet();
		insider.show("123");
		System.out.println(insider.getClass().getName());

	}

	public abstract class Insider {
		String name = "pascal";

		public abstract void show(String x);
	}

}
