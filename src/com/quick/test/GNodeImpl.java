package com.quick.test;

import java.util.List;

public class GNodeImpl implements GNode {

	// member variables
	private String name;
	private GNode[] children;

	private final static GNode[] NULL_GNode_ARRAY = new GNode[0];

	// 2-arg parametrized constructor
	public GNodeImpl(String name, GNode[] children) {
		super();
		this.name = name;
		this.children = children;
	}

	@Override
	public GNode[] getChildren() {

		if(null != children && 0 == children.length){
			return new GNode[0];
		}
		return children;
	}

	@Override
	public String getName() {
		return name;
	}
}