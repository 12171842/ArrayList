package arrayList;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		for (int i = 0; i < 100; i = i + 2) {
			numbers.add(i);
		}
		System.out.println(numbers);

		ArrayList<Long> numbers1 = new ArrayList<>();
		numbers1.add(0, (long) 0);
		numbers1.add(1, (long) 1);
		numbers1.add(2, (long) 0);
		for (int i = 0; i < 50; i++) {
			numbers1.set(2, (numbers1.get(0) + numbers1.get(1)));

			System.out.println(numbers1.get(2));

			numbers1.set(0, numbers1.get(1));
			numbers1.set(1, numbers1.get(2));
		}
	}

}
