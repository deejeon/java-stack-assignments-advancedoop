package com.danieljeon.dll;

public class DLLTest {

	public static void main(String[] args) {
		DLL dll = new DLL();
		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(30);
		Node n4 = new Node(40);
		Node n5 = new Node(50);
		Node n6 = new Node(60);
		Node n7 = new Node(70);
		
		dll.push(n1);
		dll.push(n2);
		dll.push(n3);
		dll.push(n4);
		dll.push(n5);
		dll.push(n6);
		dll.pop();
		dll.insertAt(n7, 5);
		dll.removeAt(0);
		
		dll.printValuesForward();
		dll.printValuesBackward();
		
		System.out.println(dll.contains(10));
		System.out.println(dll.contains(50));
		System.out.println(dll.contains(60));
		
		System.out.println(dll.size());
		
		DLL dllEmpty = new DLL();
		System.out.println(dllEmpty.contains(10));
		System.out.println(dllEmpty.size());
	}

}
