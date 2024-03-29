package com.javaex.ex02;

public class Sparrow extends Bird {
		private String name;
		
		public Sparrow() {
		}
		public void setName(String name) {
			this.name=name;
	    }
		public String getName() {
			return name;
		}
	 	public void sing() {
		    System.out.printf("참새(%s)가 소리냅니다.",name);
		    System.out.println();
	    }

	    public void fly() {
	    	System.out.printf("참새(%s)가 날아다닙니다.",name);
	    	System.out.println();
	    }
	    
	    public void showName() {
	    	System.out.printf("참새의 이름은 %s 입니다.",name);
	    	System.out.println();
	    }

}
