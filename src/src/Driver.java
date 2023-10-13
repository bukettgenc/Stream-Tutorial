package src;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver {

	// Stream nesne referansları ile çalıştığından, ilkel veri tipleri ile çalışmaz
	// intermediate method geriye değer döndürür
	// terminate method sonlandırır
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("İstanbul");
		arrayList.add("Ankara");
		arrayList.add("Adana");

//		Stream<String> stream = arrayList.stream();
//		Stream<String> stream2 = stream.filter(new Predicate<String>() {
//
//			@Override
//			public boolean test(String t) {
//				// TODO Auto-generated method stub
//				return t.startsWith("A");
//			}
//		});
//
//		Stream<String> stream3 = stream2.map(new Function<String, String>() {
//
//			@Override
//			public String apply(String t) {
//				// TODO Auto-generated method stub
//				return t.toUpperCase();
//			}
//		});
//
//		Stream<String> stream4 = stream3.sorted(new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				// TODO Auto-generated method stub
//				return o1.compareTo(o2);
//			}
//		});
//
//		stream4.forEach(new Consumer<String>() {
//
//			@Override
//			public void accept(String t) {
//				System.out.println(t);
//			}
//		});
		
		//Bunları ard arda çağırabiliriz
		arrayList.stream()
		.filter((s)->s.startsWith("A"))
		.map((s)->s.toUpperCase())
		.sorted((s1,s2)->s1.compareTo(s2))  //tam tersi sıralamak istiyorsak s2.compareTo(s2) olmalı
		.forEach(System.out::println);
		
		ArrayList<Ogrenci> arrayList2=new ArrayList<Ogrenci>();
		arrayList2.add(new Ogrenci(1,"Ali can",16));
		arrayList2.add(new Ogrenci(1,"Zeynep Güler",14));
		arrayList2.add(new Ogrenci(1,"Seyhan Koşar",9));
		List<Ogrenci> collect=arrayList2.stream().filter((o)->o.getAd().startsWith("A"))
				.collect(Collectors.toList());
		collect.forEach(System.out::println);

	}

}
