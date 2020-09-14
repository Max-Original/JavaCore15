package javacore15;

import java.util.Scanner;

public class Application {

	public static void menu() {
		
		System.out.println("�������� 1 ��� ������ �������� �����");
		System.out.println("�������� 2 ��� ������ �������� �� �������� �����");
		System.out.println("�������� 3 ��� �������� �������� �� �������� �����");
		System.out.println("�������� 4 ��� �������� �������� � �����");
		System.out.println("�������� 5 ��� �������� ��������� �������� � ��� ��������");
		System.out.println("�������� 6 ��� ������� �� ����� �������");
		System.out.println("�������� 7 ��� ����� � ��������");
	}
	
	public static void main(String[] args) {
			
		while (true) {
			menu();
			Scanner scanner = new Scanner(System.in);
			switch (scanner.nextInt()) {
			case 1: {
				ZooClub.getZooClub().addClubMember();
				break;
			}
			case 2: {
				ZooClub.getZooClub().addAnimalToClubMember();
				break;
			}
			case 3: {
				ZooClub.getZooClub().removeAnimalFromClubMember();
				break;
			}
			case 4: {
				ZooClub.getZooClub().removeClubMember();
				break;
			}
			case 5: {
				ZooClub.getZooClub().removeAnimalFromAllClubMembers();
				break;
			}
			case 6: {
				ZooClub.getZooClub().showZooClub();
				break;
			}
			case 7: {
				ZooClub.getZooClub().exit();
				break;
			}

			}
		}
	}
}
