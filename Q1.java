
public static double averagePositive(ArrayList<Integer> values){
	double total = 0.0;
	int count = 0;
	double number = 0;
	int s = values.size();
	if (s == 0){
        return total;
	}
	else {
		for (int i = 0; i < s; i++) {
		    number = (double)values.get(i);
		    if(number > 0){
			    count += 1;
			    total += number;
		    }
		}
		return total / count;
	}
}
