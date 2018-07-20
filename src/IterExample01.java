import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class IterExample01 {
	public static void main(String[] args) {
		//Iterator에 대한 설명
		//Collection객체(ArrayList,HashSet 등등..)에서 데이터를 뽑아서 사용하기 위함

		//ArrayList의 경우(데이터 출력)------------------------>
		ArrayList<String> aList = new ArrayList<>();
		//10개의 데이터를 넣었음
		for (int i = 0; i < 10 ; i++) {
			aList.add(i + " ");
		}

		//출력
		//get을 이용해 데이터를 빼올 수 있다!
		for (int i = 0; i < aList.size() ; i++) {
			System.out.print(aList.get(i));
		}
		//----------------------------------------------------<


		System.out.print("\n\n줄바꿈\n\n");


		//HashSet의 경우(데이터 출력)--------------------------->
		HashSet<String> aSet = new HashSet<>();
		//10개의 데이터를 넣었음
		for (int i = 0; i < 10 ; i++) {
			aSet.add(i + " ");
		}

		//출력
		//Iterator를 생성후 출력
		Iterator<String> iter = aSet.iterator();
		while (iter.hasNext()){
			System.out.print(iter.next());
		}
		//----------------------------------------------------<


		//HashSet은 Iterator을 사용해서 데이터를 뽑아낸다고 쳐도 ArrayList의 경우는
		//왜 필요할까?  >> 다음장으로  IterExample02



	}
}
