package com.hackerrank.programming.interview.questions;

import java.util.Scanner;

public class MthToLastElement {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String lineOne = in.nextLine();
		String lineTwo = in.nextLine();


		int pos = Integer.parseInt(lineOne.trim());
		String[] numbers = lineTwo.split(" ");
		class Element {
			int element;
			Element next = null;
			Element previous = null;

			public int getElement() {
				return element;
			}

			public void setElement(int element) {
				this.element = element;
			}

			public Element getNext() {
				return next;
			}

			public void setNext(Element next) {
				this.next = next;
			}

			public Element getPrevious() {
				return previous;
			}

			public void setPrevious(Element previous) {
				this.previous = previous;
			}
		}
		Element startElement = new Element();
		Element element = null;
		startElement.setPrevious(null);
		startElement.setNext(element);
		for (String n : numbers) {
			 element = new Element();
			element.setElement(Integer.parseInt(n));
			element.setPrevious(startElement);
			element.setNext(null);
			startElement.setNext(element);
			startElement = element;
		}
		int index = 0;
		while (startElement.getPrevious() != null && pos > index++) {
		 if (pos == index) {
			System.out.println(startElement.getElement());
		}
		 startElement=startElement.getPrevious();
		 if(startElement.getPrevious()== null) {
			System.out.println("NIL");
		}
			

		}


	}
}
