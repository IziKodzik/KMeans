import KMens.Algorithm;
import KMens.Flower;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {

		int k = Integer.parseInt(args[0]);

		BufferedReader reader = new BufferedReader(new FileReader(args[1]));

		List<Flower> flowers = new ArrayList<>();

		for(String line = reader.readLine() ; line != null ; line = reader.readLine()){

			flowers.add(new Flower(line.split(",")));

		}

		System.out.println((Algorithm.process(k, flowers)));


	}

}
