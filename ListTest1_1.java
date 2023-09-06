package collection1;

import java.util.ArrayList;

public class ListTest1_1 {

	public static void main(String[] args) {

		// 자료의 개수를 고정하지 않은 상태에서 저장하는 자료구조는 List (인터페이스)

		// List 인터페이스를 구현한 ArrayList가 있다.
		// ArraList 객체를 만들기
		
							//generic 포괄적인 <> , 기본형을 객체로 감싼 타입
							//wrapper 클래스인 Integer, Double
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
//		System.out.println(arrayList);
//		arrayList.add(arrayList);
		// 오브젝트: 최상위의 클래스
		
		arrayList.add(30);
//		System.out.println(arrayList);

		arrayList.add(40);
//		System.out.println(arrayList);

		arrayList.add(50);
//		System.out.println(arrayList);

		arrayList.add(60);
//		System.out.println(arrayList);
		
		arrayList.add(100);
//		System.out.println(arrayList);

//		System.out.println(arrayList.size());

//		System.out.println(arrayList.get(0));

		int tot=0;
		
//		for (int i = 1; i < arrayList.size(); i++) {
////			System.out.println(arrayList[i]); 불가능
//			System.out.println(arrayList.get(i));
////			int value = arrayList.get(i);		 불가능
////			tot += value;                        불가능
//			
//		}
		
		for(int value : arrayList ) {
			tot += value;
		}
		
		System.out.println(tot);
	}
}
