package com.learn.subset;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subset("","abc");
	}
	static void subset(String p,String up){
		if(up.isEmpty()) {// here only printing takes place no need to print it again in the main method.
			System.out.println(p);
			return;
		}
		
		char ch=up.charAt(0);
		for(int i=0;i<=p.length();i++) {
		   String f = p.substring(0,i);//(0,0),(0,1)
		   String s = p.substring(i,p.length());//(0,2)
		   
		   subset(f+ch+s,up.substring(1));
	}
}
}