package KMens;

import java.util.List;

public class Centroid {

	public List<Double> values;

	public Centroid(List<Double> values) {
		this.values = values;
	}

	@Override
	public String toString() {
		return "Centroid{" +
				"values=" + values +
				'}';
	}
}
