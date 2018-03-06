package com.dayuanit.chain;

public class OrderFilter implements Filter {
	
	@Override
	public void doFilter(FilterChain chian) {
		System.out.println("order filter before");
		chian.doFilter();
		System.out.println("order filter after");
		
	}

}
