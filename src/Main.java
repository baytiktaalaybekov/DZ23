import java.util.*;

public class Main {
    public static void main(String[] args) {


        Random random = new Random();
       int[]num=new int[5];
        for (int i = 0; i < num.length ; i++) {
            num[i]= random.nextInt(0,2);
        Arrays.sort(num);
       }
            System.out.println(Arrays.toString(num));
        System.out.println("========================");

        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt(0, 2));
            }
            System.out.println(integers);
        Collections.sort(integers);
        System.out.println(integers);
        System.out.println("===========================");


        LinkedList<Integer>linkedList=new LinkedList<>();
        for (int i = 0; i <10 ; i++) {
            linkedList.add(random.nextInt(0,2));
        }
        System.out.println(linkedList);
        Collections.sort(linkedList);
        System.out.println(linkedList);


        }
        }
