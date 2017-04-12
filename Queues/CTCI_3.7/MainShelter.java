package stacks;

import java.util.LinkedList;

public class MainShelter {
	LinkedList<Dog> dogs = new LinkedList<Dog>();
	LinkedList<Cat> cats = new LinkedList<Cat>();
	private int order = 0;

	// enqueue
	public void enqueue(Animal a) {
		a.setOrder(order++);
		if (a instanceof Dog)
			dogs.add((Dog) a);
		else if (a instanceof Cat)
			cats.add((Cat) a);
	}

	// dequeueAny
	public Animal dequeueAny() {
		if (dogs.size() == 0)
			return dequeueCats();
		else if (cats.size() == 0)
			return dequeueDogs();
		else {
			Dog dog = dogs.peek();
			Cat cat = cats.peek();
			if (dog.isOlderThan(cat))
				return dequeueDogs();
			else
				return dequeueCats();
		}
	}

	// dequeueCat
	private Animal dequeueCats() {
		return cats.poll();
	}

	// dequeueDog
	private Animal dequeueDogs() {
		return dogs.poll();
	}

}
