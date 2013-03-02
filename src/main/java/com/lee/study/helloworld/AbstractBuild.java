package com.lee.study.helloworld;

/**
 * 模拟MAVEN的生命周期
 *
 */
public abstract class AbstractBuild{
    
	public void build(){
		initialize();
		compile();
		test();
		packagee();
		integrationTest();
		deploy();
	}

	protected abstract void initialize();
	protected abstract void compile();
	protected abstract void test();
	protected abstract void packagee();
	protected abstract void integrationTest();
	protected abstract void deploy();

}
