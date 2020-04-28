package KMens;

import java.util.ArrayList;
import java.util.List;

public
	class Flower{

	String name;
	List<Double> values;


	@Override
	public String toString() {
		return "Flower{" +
				"name='" + name + '\'' +
				", values=" + values +
				"}\n";
	}

	public Flower(String[] data){

		values = new ArrayList<>();
		for(int op = 0 ; op < data.length-1 ; ++ op ){
			values.add(Double.parseDouble(data[op]));
		}
		name = data[data.length-1];

	}

}
