package javacore15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ZooClub {

	private static ZooClub zooclub;
	private Map<Person, List<Animal>> zooClubMembers = new HashMap<>();

	public static synchronized ZooClub getZooClub() {
		if (zooclub == null) {
			zooclub = new ZooClub();
		}
		return zooclub;
	}

	public void addClubMember() {
		System.out.println("¬вед≥ть ваше ≥м€");
		Scanner scanner = new Scanner(System.in);
		String namePerson = scanner.next();
		System.out.println("¬вед≥ть ваш в≥к");
		scanner = new Scanner(System.in);
		int agePerson = scanner.nextInt();
		Person personClubMember = new Person(namePerson, agePerson);
		zooclub.zooClubMembers.put(personClubMember, new ArrayList<>());
	}

	public void addAnimalToClubMember() {
		System.out.println("¬вед≥ть ≥м€ вашоњ тваринки");
		Scanner scanner = new Scanner(System.in);
		String nameAnimal = scanner.next();

		System.out.println("¬вед≥ть тип вашоњ тваринки");
		scanner = new Scanner(System.in);
		String typeAnimal = scanner.next();

		Animal animal = new Animal(typeAnimal, nameAnimal);

		System.out.println("¬вед≥ть ≥м€ члена клуба щоб добавити тваринку");
		scanner = new Scanner(System.in);
		String scanName = scanner.next();

		Iterator<Entry<Person, List<Animal>>> iterator = zooClubMembers.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<Person, List<Animal>> next = iterator.next();
			if (next.getKey().getName().equals(scanName)) {
				List<Animal> value = next.getValue();
				value.add(animal);
				next.setValue(value);
			}
		}
	}

	public void removeAnimalFromClubMember() {
		System.out.println("¬вед≥ть ≥м€ члена клуба щоб видалити тваринку");
		Scanner scanner = new Scanner(System.in);
		String scanName = scanner.next();

		System.out.println("¬вед≥ть ≥ндекс тварники €ку потр≥бно видалити");
		scanner = new Scanner(System.in);
		int scanInt = scanner.nextInt();

		Iterator<Entry<Person, List<Animal>>> iterator = zooClubMembers.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<Person, List<Animal>> next = iterator.next();
			if (next.getKey().getName().equals(scanName)) {
				List<Animal> value = next.getValue();
				value.remove(scanInt);
				next.setValue(value);
			}
		}

	}

	public void removeClubMember() {
		System.out.println("¬вед≥ть ваше ≥м€");
		Scanner scanner = new Scanner(System.in);
		String namePerson = scanner.next();
		Iterator<Entry<Person, List<Animal>>> iterator = zooClubMembers.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<Person, List<Animal>> next = iterator.next();
			if (next.getKey().getName().equals(namePerson)) {
				zooclub.zooClubMembers.remove(next.getKey());
			}
		}
	}

	public void removeAnimalFromAllClubMembers() {
		System.out.println("¬вед≥ть тип тваринки €ку потр≥бно видалити");
		Scanner scanner = new Scanner(System.in);
		String typeAnimal = scanner.next();

		Iterator<Entry<Person, List<Animal>>> iteratorRunMap = zooClubMembers.entrySet().iterator();

		while (iteratorRunMap.hasNext()) {
			Entry<Person, List<Animal>> next = iteratorRunMap.next();
			List<Animal> valueOfAnmimalList = next.getValue();
			Iterator<Animal> iteratorRunAnimals = valueOfAnmimalList.iterator();
			while (iteratorRunAnimals.hasNext()) {
				Animal animalValue = iteratorRunAnimals.next();
				if (animalValue.getType().equalsIgnoreCase(typeAnimal)) {
					iteratorRunAnimals.remove();
				}
			}

		}
	}

	public void showZooClub() {
		System.out.println(zooclub);
	}

	public void exit() {
		System.exit(0);
	}

	@Override
	public String toString() {
		return "ZooClub [zooClubMembers=" + zooClubMembers + "]";
	}
}
