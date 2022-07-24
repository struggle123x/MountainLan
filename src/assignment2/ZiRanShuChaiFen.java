package assignment2;

import java.util.*;

public class ZiRanShuChaiFen {

    public static int number, count = 0, sum = 0;
    public static ArrayList<Integer> arrayList = new ArrayList<Integer>();
    public static Set<String> set = new HashSet<String>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Iterator<String> iterator = set.iterator();

        System.out.print("请输入要拆分的自然数： ");
        number = input.nextInt();

        method(0);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(count);

    }

    public static void method(int a) {
        if (a == number) {
            if (arrayList.size() == 1) return;//把他本身删去
            count++;
            String s = "";
            for (int i = 0; i < arrayList.size(); i++) {
                s = s + arrayList.get(i);
            }

            set.add(s);
            return;
        }

        for (int i = 1; i <= number; i++) {
            if (a + i > number)
                continue;
            if (arrayList.size() == 0 || arrayList.get(arrayList.size() - 1) <= i) {
                arrayList.add(i);
                a += i;
                method(a);
                arrayList.remove(arrayList.size() - 1);
                a -= i;
            }
        }
    }
}

