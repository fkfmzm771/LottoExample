import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LottoMain {

	//메인 메서드
	public static void main(String[] args) {
		//Lotto를 인스턴스화
		LottoMain lottoMain = new LottoMain();
		//아래 만든 lottoRandom 함수를 실행
		lottoMain.lottoRandom();
	}


	//생성한 메서드
	public void lottoRandom() {
		//String형식의 hashset객체를 생성
		Set<String> lottoSet = new HashSet<>();

		//반복문을 사용해 7개의 랜덤한 숫자를 생성
		for (int i = 0; i < 8; i++) {
			//Math.random()은 double(소수점)타입으로 반환되기 때문에 (int) 형변환을 통해 int값으로 변경
			int exam = (int) (Math.random() * 45) + 1;

			//생성된 값을 lottoSet에 추가
			//위의 셋 형식이 <String> 형식이기 때문에 숫자를 문자로 변경해 주는 작업이 필요!
			//String.valueOf() 사용해 숫자를 문자로 변환해 추가해준다!
			lottoSet.add(String.valueOf(exam));
		}  //반복문이 끝나면 7개의 랜덤한 수가 생성됨


		//lottoSet의 값을 사용하기위해 Iterator를 생성
		Iterator<String> lottoIter = lottoSet.iterator();


		//45개의 숫자를 출력하기 위한 ArrayList를 생성!
		ArrayList<String> outNum = new ArrayList<>();

		//for문을 이용해 45개의 숫자를 생성
		for (int i = 1; i <= 45; i++) {
			outNum.add(String.valueOf(i));
		}


		//Iterator의 hasNext()사용해 다음 값이 없을때까지 값을 불러와서 반복!
		while (lottoIter.hasNext()) { //총 7번 돌게됨!
			String iterE = lottoIter.next();  // 반복문이 돌때마다 next()를 사용해 값을 하나씩 뽑아온다
			for (int i = 0; i < 45; i++) {
				if (outNum.get(i).equals(iterE)) {  // outNum를 get을 이용해 하나씩 불러와 비교
					outNum.set(i, "[" + iterE + "]");      //값이 같으면 양옆에 괄호를 추가
				}
			}
		} //while값이 끝나면 괄호가 추가된 ArrayList가 생성됨!!


		//출력을 위한 for문 생성!!!!!


		for (int i = 0; i < 45; i++) { //<< 45는 위에 생성한 outNum.size()를 이용해 사용해도 같음!
			//다섯자리를 기준으로 줄바꿈
			if (i % 5 == 0) {
				System.out.println();
			}
			System.out.print(outNum.get(i) + "  ");
		}


		//끝읃!!!!!

	}


}
