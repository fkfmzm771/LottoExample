import java.util.*;

public class IterExample02 {
	public static void main(String[] args) {
		//Iterator에 대한 설명
		//굳이 왜 사용하는지 물으면 '다형성(Polymorphis)'때문에 사용!
		//다형성이란?  객체지향 개념에서의 다형성이란 '여러 가지 형태를 가질 수 있는 능력'을 의미
		//우리가 배운 '오버로딩'과 '오버라이딩'이 대체적인 다형성의 한 형태
		//더 쉽게 설명하면 코드의 재 사용성을 높힌다는것!


		//01번 예제를 Iterator을 인수로 받는 메소드를 생성해서 출력해 보겠다
		//Iterator 생성
		Iterator<String> iter;

		//두개의 객체를 더 추가 하였다
		ArrayList<String> aList1 = new ArrayList<>();
		LinkedList<String> aList2 = new LinkedList<>();

		HashSet<String> aSet1 = new HashSet<>();
		LinkedHashSet<String> aSet2 = new LinkedHashSet<>();

		//각각 10개의 데이터를 넣었음
		for (int i = 0; i < 10; i++) {
			aList1.add(i + " ");
			aList2.add(i + " ");
			aSet1.add(i + " ");
			aSet2.add(i + " ");
		}

		//출력
		iterExam(iter = aList1.iterator());
		iterExam(iter = aList2.iterator());
		iterExam(iter = aSet1.iterator());
		iterExam(iter = aSet2.iterator());
	}

	//인수를 Iterator형식으로 통일 시켜서 출력하는 함수를 생성
	public static void iterExam(Iterator<String> iter) {
		while (iter.hasNext()) {
			System.out.print(iter.next());
		}
		System.out.print("줄바꿈\n\n");
	}

	//이런 식으로 메소드의 인수를 통일시켜 불필요한 코드를 생략 할 수 있다!
}
