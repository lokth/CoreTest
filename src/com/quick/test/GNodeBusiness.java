package com.quick.test;

import java.util.ArrayList;

public class GNodeBusiness {

	/**
	 * 
	 * @param gNode
	 * @return
	 */
	public ArrayList<GNode> walkGraph(GNode gNode){

		ArrayList<GNode> al = new ArrayList<GNode>();
		al.add(gNode);

		System.out.println("Name : " + gNode.getName());

		if(gNode.getChildren().length != 0){
			GNode gn[] = gNode.getChildren();
			for(GNode gnf : gn){
				walkGraph(gnf);
			}
		}
		return al;
	}

	/**
	 * 
	 * @param gNode
	 * @return
	 */
	public ArrayList paths(GNode gNode) {

		ArrayList<ArrayList<GNode>> al = new ArrayList<ArrayList<GNode>>();

		for(int i=0; i<gNode.getChildren().length; i++){
			ArrayList<GNode> lstGNode = new ArrayList<GNode>();
			lstGNode.add(gNode);
			lstGNode = addNodeToList(lstGNode, gNode.getChildren()[i]);	
			al.add(lstGNode);
		}

		ArrayList<GNode> alAB = new ArrayList<GNode>();
		return al;
	}

	ArrayList addNodeToList(ArrayList al, GNode gNode) {

		for(int i=0; i<=gNode.getChildren().length; i++){
			ArrayList<GNode> lstGNode = new ArrayList<GNode>();
			lstGNode.addAll(al);
			lstGNode.add(gNode);
			if(gNode.getChildren()[i].getChildren().length != 0){
				lstGNode = addNodeToList(lstGNode, gNode.getChildren()[i]);
			}
			return lstGNode;
		}
		return al;
	}
}