package dsaTest1;

public class doesSContainsT {
	
	public static boolean checkSequence(String a, String b) {
		if(b.length()==0) {
			return true;
		}if(a.length()==0) {
			return false;
		}
		if(a.charAt(0) == b.charAt(0)){
            a = a.substring(1);
            b = b.substring(1);
        }else{
            a = a.substring(1);
        }
        
        boolean ans = checkSequence(a,b);

        return ans;
		
	}

	public static void main(String[] args) {
		String s = "kunal";
		String t = "kur";
		System.out.println(checkSequence(s,t));
		System.out.println("KUNAL");

	}

}
