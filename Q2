public static ArrayList<Integer> uniqueUnion(ArrayList<Integer> list1, ArrayList<Integer> list2) {
	ArrayList<Integer> list3 = new ArrayList<Integer>();
   	int number = 0;
   	for (int num1:list1){
		int position = list3.indexOf(num1);
		if (position == -1){
	        list3.add(num1);
	    }
    }
   	 for (int i = 0; i < list2.size(); i++) {
	    	number = list2.get(i);
	    	int index = list3.indexOf(number);
	    	if (index == -1){
	        	list3.add(number);
	    }
    }
    return list3;
}
