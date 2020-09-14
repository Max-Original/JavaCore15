package javacore15;

import java.util.Scanner;

public class Application {

	public static void menu() {
		
		System.out.println("Натисніть 1 щоб додати учасника клубу");
		System.out.println("Натисніть 2 щоб додати тваринку до учасника клубу");
		System.out.println("Натисніть 3 щоб видалити тваринку від учасника клубу");
		System.out.println("Натисніть 4 щоб видалити учасника з клубу");
		System.out.println("Натисніть 5 щоб видалити конкретну тваринку зі всіх власників");
		System.out.println("Натисніть 6 щоб вивести на екран зооклуб");
		System.out.println("Натисніть 7 щоб вийти з програми");
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
