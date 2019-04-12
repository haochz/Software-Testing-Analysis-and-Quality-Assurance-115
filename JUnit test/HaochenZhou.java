public class HaochenZhou {
	
	String getFullName() {
		return "Haochen Zhou";
	}
	
	String getFirstName() {
		return "Haochen";
	}
	
	String getLastName() {
		return "Zhou";
	}
	
	String getUCInetID() {
		return "haochz3";
	}
	
	int getStudentNumber() {
		return 23567813;
	}
	
	String getRotatedFullName(int shift) {
		String name = "Haochen Zhou";
	//	String name = "Iftekhar Ahmed";
		int len = name.length();
		
		if(shift==0) {
			return name;
		}
		else if(shift>0) {
			int n2 = shift%len;
			String new_name = name.substring(n2,len)+name.substring(0,n2);
			return new_name;
		}
		else {
			int n3 = len-(-shift%len);
			String new_name2 =name.substring(n3,len)+name.substring(0,n3);
			return new_name2;
		}
	}

	public static void main(String args[]) {
		HaochenZhou j = new HaochenZhou();
		System.out.println(j.getFullName());
	    System.out.println(j.getFirstName());
	    System.out.println(j.getLastName());
	    System.out.println(j.getUCInetID());
	    System.out.println(j.getStudentNumber());
	    System.out.println(j.getRotatedFullName(3));
		System.out.println(j.getRotatedFullName(-3));
	}
	
}
