package step00_과제2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*   풀지 못함.
 * [문제15] 2자리의 난수를 발생하여 발생된 숫자를 맞추는 게임 프로그램
         난수발생) 
                   1. int a=(int)(Math.random()*100) : 0 - 99 사이의 난수
                   2. ① import java.util.Random;
                      ② Random 변수1 = new Random();
                      ③ int 변수2 = 변수1.nextInt(최대값); 
                               ==>  0 ~ (최대값 - 1)사이의 임의의 수

[실행결과]

*** 난수가 발생하였습니다.맞추어 보세요.*** 
숫자 입력 : 50
컴퓨터의 숫자가 더 큽니다.

숫자 입력 : 90
컴퓨터의 숫자가 더 작습니다.
          :
          :

숫자 입력 : 83
추카추카...xx번만에 맞추셨습니다. 
다시 할까요(Y/y): n

**수고 하셨습니다 **
 */
public class work15 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		System.out.println(" *** 난수가 발생하였습니다. 맞추어 보세요. ***");
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("숫자 입력 : ");
		int a1=Integer.parseInt(br.readLine());
		int a=(int)(Math.random()*100+1);
		int cnt=0;
		
		for(int i=0; i<100; i++) {
			if(a==a1) {  System.out.println("추카추카.."+cnt+"번 만에 맞추셨습니다.");
		} if(a<a1) {System.out.println("컴퓨터의 숫자가 더 작습니다.");
		} else { System.out.println("컴퓨터의 숫자가 더 큽니다.");
		}
		System.out.println("다시 할까요?(Y/y) : ");
		String b=br.readLine();
		if(b=="n") { System.out.println("수고하셨습니다.");
		}

}}}
