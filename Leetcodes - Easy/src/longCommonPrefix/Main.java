package longCommonPrefix;

public class Main {

	public static void main(String[] args) {
		Solution  longCom = new Solution();
		
		System.out.println(longCom.longPrefix(new String[] {"flower","flow","flight"}));
		System.out.println(longCom.longPrefix(new String[] {"dog","racecar","car"}));
	}

}
