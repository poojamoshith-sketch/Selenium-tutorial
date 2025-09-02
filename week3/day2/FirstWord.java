package week3.day2;

public class FirstWord {

	public static void main(String[] args) {
		
		String s = "Hello world";
		String t = "fly me to the moon";
		String u = "luffy is still joyboy";
		
		String[] split = s.split(" ");
		String[] split1 = t.split(" ");
		String[] split2 = u.split(" ");

		int len1 = split[split.length - 1].length();
		int len2 = split1[split1.length - 1].length();
		int len3 = split2[split2.length - 1].length();
		
		System.out.println("Length of last word in s:"+len1);
		System.out.println("Length of last word in t:"+len2);
		System.out.println("Length of last word in u:"+len3);
	
		

	}

}
