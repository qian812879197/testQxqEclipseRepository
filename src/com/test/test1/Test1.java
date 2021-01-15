package com.test.test1;

public class Test1 {
	
	public static void main(String[] args) {
		String aa = "jdkndad=[[h,sk???????******&&&&&######ds,d,f],[dd,dd,dd,d]]";
		String aa1 = aa.replaceAll("\\?", "%3F").replaceAll("\\&", "%26").replaceAll("\\#", "%23");
		System.out.println(aa1);
		String aa2 = aa1.replaceAll("%3F", "?").replaceAll("%26", "&").replaceAll("%23", "#");
		System.out.println(aa2);
	}

}
