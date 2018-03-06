package com.dayuanit.chain;

public class URLFilter implements Filter {

	@Override
	public void doFilter(FilterChain chian) {
		System.out.println("url filter before");
		chian.doFilter();
		System.out.println("url filter after");
	}

}
