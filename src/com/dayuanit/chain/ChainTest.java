package com.dayuanit.chain;

public class ChainTest {
	
	public static void main(String[] args) {
		FilterChain chain = new FilterChain();
		
		chain.addFilter(new OrderFilter());
		chain.addFilter(new LoginFilter());
		chain.addFilter(new URLFilter());
		
		
		chain.doFilter();
	}

}
