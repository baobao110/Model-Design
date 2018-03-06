package com.dayuanit.chain;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
	
	private static List<Filter> list = new ArrayList<>();
	private int index = 0;
	
	public void doFilter() {
		if (index >= list.size()) {
			System.out.println("filter over");
			return;
		}
		
		Filter filter = list.get(index);
		index ++;
	
		filter.doFilter(this);
		System.out.println(">>>>>>>>>>>>>>>>>>>>");
		
	}
	
	public void addFilter(Filter filter) {
		list.add(filter);
	}

}
