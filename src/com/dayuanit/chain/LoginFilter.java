package com.dayuanit.chain;

public class LoginFilter implements Filter {

	@Override
	public void doFilter(FilterChain chian) {
		System.out.println("login filter before");
		chian.doFilter();
		System.out.println("login filter after");
	}

}
