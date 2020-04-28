package KMens;

import java.util.ArrayList;
import java.util.List;

public class Algorithm {

	public static List<Group> process(int k,List<Flower> flowers){

		List<Group> result = new ArrayList<>();
		int i = 0;
		for(; i < k ; ++ i){

			result.add(new Group());
			result.get(i).list.add(flowers.get(i));

		}
		for(; i < flowers.size() ; ++ i){

			int rand = (int) ( Math.random()*k);
			result.get(rand).list.add(flowers.get(i));

		}

		double rem = 0;
		for(;;){

			for (Group g : result )
				g.createCentroid(flowers.get(0).values.size());

			double sum = 0;

			for(Group g : result) {

				for(Flower f : g.list){

					sum += calc(g.centroid.values ,f.values);
				}
				g.list = new ArrayList<>();

			}
			System.out.println(sum + " TSUM");
			for(int op = 0 ; op < flowers.size() ; ++ op){

				Dist cur = new Dist();
				cur.val = -1;

				for(int po = 0 ; po < k ; ++ po){

					double dist = calc(flowers.get(op).values,result.get(po).centroid.values);
					if(cur.val < 0 || cur.val > dist){
						cur.val = dist;
						cur.to = po;

					}

				}

				result.get(cur.to).list.add(flowers.get(op));


			}

			if(rem == sum)
				break;
			rem = sum;

		}

		return result;

	}


	private static double calc(List<Double> o1,List<Double> o2) {

		double result = 0;

		for(int op = 0 ; op < o1.size() ; ++ op){

			result += Math.pow(o1.get(op) - o2.get(op),2);

		}

		return result;

	}


	private static class Dist{

		double val;
		int to;

	}




}
