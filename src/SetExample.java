import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	public static void main(String[] args) {
		//Set 설명

		//HashSet - 중복데이터를 허용하지 않고 저장 순서를 유지 하지 않음!
		Set hashS = new HashSet();

		//LinkedHashSet - 중복데이터를 허용하지 않고 저장 순서를 기억함!
		Set linkS = new LinkedHashSet();

		//TreeSet - 중복데이터를 허용하지 않고 저장된 데이터를 오름차순으로 정렬해서 기억!
		Set treeS = new TreeSet();


		//각각의 객체에 100사이의 정수 20개를 넣고 테스트
		for (int i = 0; i < 20; i++) {
			int a = (int) (Math.random() * 100) + 1;
			hashS.add( a + " ");
			linkS.add( a + " ");
			treeS.add( a + " ");
		}

		System.out.println("HashSet");
		System.out.println(hashS);
		System.out.println("LinkedHashSet");
		System.out.println(linkS);
		System.out.println("TreeSet");
		System.out.println(treeS);


	}

}
