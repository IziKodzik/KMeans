package KMens;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Group {

	@Override
	public String toString() {
		return "Group{" +
				"list=" + list +
				", centroid=" + centroid +
				" " + list.size() + "}\n";
	}

	List<Flower> list = new ArrayList<>();
	Centroid centroid;

	public void createCentroid(int size){


		Double[] v = new Double[size];
		Arrays.fill(v, 0.0);

		if(list.size()==0) {
			centroid = new Centroid(new ArrayList<>(Arrays.asList(v)));
			return;
		}


		for(int op = 0 ; op < list.size() ; ++ op){

			for(int po = 0 ; po  < list.get(op).values.size() ; ++ po)
	            v[po] += list.get(op).values.get(po);
		}
		for(int op = 0 ; op < v.length ; ++ op)
			v[op] /= list.size();

		centroid = new Centroid(new ArrayList<>(Arrays.asList(v)));

	}

}
