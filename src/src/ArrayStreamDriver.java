package src;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayStreamDriver {

	public static void main(String[] args) {
//		int[] numaralar = { 2, 1, 6, 4, 7, 5, 9 };
//		Arrays.stream(numaralar).filter((x) -> x > 3).map((x) -> x * 2).sorted().forEach(System.out::println);
//
//		Stream.of("a", "g", "d", "c").findFirst().ifPresent(System.out::println);
//		System.out.println("-----");
//		// 1 dahil 10 dahil değil
//		IntStream.range(1, 10).forEach(System.out::println);
//
//		int toplam = IntStream.range(1, 101).sum();
//	
//		IntStream.range(1, 101).average().ifPresent(System.out::println);
		
		//Methodlar her veri için sırayla çalışır (Sorted hariç.Sorted en başta yatay olarak tüm elemanlar için çalışır.)
		//Sortedın filterdan sonra yazılması avantajlıdır
		Stream.of(7,4,5,6,1)
		.sorted(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				System.out.println("Test0");
				return o1.compareTo(o2);
			}
		})
		.filter(new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				System.out.println("Test1");
				return t>2;
			}
		})
		.anyMatch(new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
			System.out.println("Test2");
			//5ten sonraki değerler için tekrar filter methoduna gitmez
				return t==5;
			}
		});
	}

}
