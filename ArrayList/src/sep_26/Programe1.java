package sep_26;

import java.util.ArrayList;

public class Programe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Integer> myarrayList1 = new ArrayList<Integer>(3);
		System.out.println(myarrayList1.size());
		myarrayList1.add(1);
		myarrayList1.add(5);
		System.out.println(myarrayList1);
		myarrayList1.add(1,9);
		System.out.println(myarrayList1);
		
		ArrayList<Integer> myarrayList2 = (ArrayList<Integer>) myarrayList1.clone();
		System.out.println(myarrayList2);
		
		System.out.println(myarrayList2.isEmpty());
		
		System.out.println(myarrayList2.contains(9));
		
		System.out.println(myarrayList2.remove(2));
		System.out.println(myarrayList2);
		
	}

}
