package by.academy.classwork.lesson16;

import java.util.ArrayList;
import java.util.Arrays;

public class MainBox {

	public static void main(String[] args) {
		
		ArrayList<HeavyBox> boxes = new ArrayList<>();
        boxes.add(new HeavyBox(1,1,1,2));
        boxes.add(new HeavyBox(2,2,3,2));
        boxes.add(new HeavyBox(4,3,3,20));
        boxes.add(new HeavyBox(33,4,53,20));

        for(HeavyBox box : boxes){
            System.out.println(box);
        }
        
        System.out.println("------------");
        
        boxes.remove(boxes.size()-1);

        boxes.get(0).setWeight(222);
        for(HeavyBox box : boxes){
            System.out.println(box);
        }

        HeavyBox [] stringArray = boxes.toArray(new HeavyBox[0]);
        System.out.println(Arrays.toString(stringArray));

        boxes.clear();
        for(HeavyBox box : boxes){
            System.out.println(box);
        }

	}

}
