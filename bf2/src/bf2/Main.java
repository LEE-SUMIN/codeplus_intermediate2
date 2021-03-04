package bf2;
import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			int X = Integer.parseInt(st.nextToken());
			int Y = Integer.parseInt(st.nextToken());
			
			int min = 0;
			for(int c = 0; c <= (2 * Math.max(X, Y)); c += 2) {
				//�ݹ�ġŲ�� ����ġ�� �����ؼ� �� ���� ��°� �̵��� ��� �����ϱ�
				int a = Math.max(0, X - (c / 2));//������ ������ �ʵ��� �� ���� �� ��� 0���� �ٲ��ش�
				int b = Math.max(0, Y - (c / 2));
				
				int price = (C * c + B * b + A * a);
				if(min == 0 || price < min) {
					min = price;
				}
			}
			
			System.out.println(min);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
