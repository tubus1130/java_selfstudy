package YH_Ch21_Generics;

public class BoxMain {
	public static void main(String[] args) {
		DBox<String, Integer> box1 = new DBox<>();
		box1.set("Apple", 25);
		DBox<String, Integer> box2 = new DBox<>();
		box2.set("Orange", 33);
		DDBox<DBox<String, Integer>, DBox<String, Integer>> ddbox = new DDBox<>();
		ddbox.set(box1, box2);
		System.out.println(ddbox);
		
		DBox<DBox<String, Integer>, DBox<String, Integer>> box = new DBox<>();
		box.set(box1, box2);
		System.out.println(box);
	}
}
