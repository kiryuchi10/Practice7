package com.javaex.ex02;

public class Duck extends Bird {
	private String name;
	
	public Duck() {
	}
	public void setName(String name) {
		this.name=name;
    }
	public String getName() {
		return name;
	}
	public void sing() {
	    System.out.printf("오리(%s)가 소리냅니다.",name);
	    System.out.println();
    }

    public void fly() {
    	System.out.printf("오리(%s)가 날지않습니다.",name);
    	System.out.println();
    }
    
    public void showName() {
    	System.out.printf("오리의 이름은 %s 입니다.",name);
    	System.out.println();
    	
    }

}
