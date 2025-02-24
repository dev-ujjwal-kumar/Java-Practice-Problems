package Java.PracticeProblems;

public class largestIntegerInString {
    static int printLargest(String s){
		int num = 0;
		int res = 0;
		
		for(int i=0; i<s.length(); i++){			
			if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
				num = (num*10) + (s.charAt(i) - '0');
			}
			else{
				res = Math.max(num, res);
				num = 0;
			}
		}
		return Math.max(num, res);
    }
    public static void main(String[] args) {
        String str = "123sshh464jjsj988";
        System.out.println(printLargest(str));   
        // for(int i=0; i<s.length(); i++){
        //     //if(Character.isDigit(s.charAt(i))) to check for digit
        //     if(s.charAt(i) >= '0' && s.charAt(i) <= '9')
        //         System.out.println(s.charAt(i));   
        // }
    }
    
}
