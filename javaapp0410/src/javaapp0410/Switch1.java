package javaapp0410;

public class Switch1 {

	public static void main(String[] args) {
		final String SEOUL = "����";
		final String GOYANG = "���";
		final String PAJU = "����";
		final String YANGJU = "����";
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("������ �Է�(����, ���, ����, ����) : ");
		String city = sc.nextLine();
		switch(city){
			case SEOUL : System.out.println("����");
			break;
			case GOYANG : System.out.println("���");
			break;
			case PAJU : System.out.println("����");
			break;
			case YANGJU : System.out.println("����");
			break;
			default : System.out.println("�߸��� ����");
			break;
		}
		sc.close();

	}
}
