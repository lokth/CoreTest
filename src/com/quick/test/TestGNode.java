package com.quick.test;

import java.util.ArrayList;


public class TestGNode {

	public static void main(String[] args) {

		// B = parent & its children
		GNode E = new GNodeImpl("E", new GNode[0]);
		GNode F = new GNodeImpl("F", new GNode[0]);
		GNode B = new GNodeImpl("B", new GNode[]{E, F});

		// C = parent & its children
		GNode G = new GNodeImpl("G", new GNode[0]);
		GNode H = new GNodeImpl("H", new GNode[0]);
		GNode I = new GNodeImpl("I", new GNode[0]);
		GNode C = new GNodeImpl("C", new GNode[]{G, H, I});

		// D = parent & its children
		GNode J = new GNodeImpl("J", new GNode[0]);
		GNode D = new GNodeImpl("D", new GNode[]{J});

		// A = parent & its children
		GNode A = new GNodeImpl("A", new GNode[]{B, C, D});


		// to test
		/*	System.out.println(A.getName());
		System.out.println(A.getChildren().length);
		System.out.println("*******************************************************");

		// Part 1
		GNodeBusiness gNodeBusiness = new GNodeBusiness();
		List<GNode> lstGNode = gNodeBusiness.walkGraph(A);*/

		// Part 2
		GNodeBusiness gNodeBusiness1 = new GNodeBusiness();
		//System.out.println(gNodeBusiness1.paths(A));

		ArrayList lst = gNodeBusiness1.paths(A);
		for(int i=0; i < lst.size(); i++){
			ArrayList gn = (ArrayList) lst.get(i);
			for(int t=0; t < gn.size(); t++){
				GNode gn2 = (GNode) gn.get(t);
				System.out.println(gn2.getName());
			}
		}
	}
}