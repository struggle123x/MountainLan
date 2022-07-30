package Assignment3;

import java.util.LinkedList;

public class AnimalShelf {
    LinkedList<int[]> cat = new LinkedList<int[]>();
    LinkedList<int[]> dog = new LinkedList<int[]>();

    public AnimalShelf() {

    }

    /**
     * 判断种类，如何入队。
     *
     * @param animal
     */
    public void enqueue(int[] animal) {
        if (animal[1] == 0)
            cat.addLast(animal);
        else if (animal[1] == 1)
            dog.addLast(animal);
    }

    /**
     * 挑选所有动物中最老的
     * @return
     */
    public int[] dequeueAny() {
        //如果cat和dog都为空，则直接返回空
        if (cat.isEmpty() && dog.isEmpty())
            return new int[]{-1, -1};
        //如果cat空，dog非空，返回去掉dog首个元素的集合
        else if (cat.isEmpty() && (!dog.isEmpty()))
            return dog.removeFirst();
        //如果dog空，cat非空，返回去掉cat首个元素的集合
        else if (dog.isEmpty() && (!cat.isEmpty()))
            return cat.removeFirst();
        //如果cat和dog都非空，取出各个的首个元素，比较后返回
        else  {
            int[] catHead = cat.getFirst();
            int[] dogHead = dog.getFirst();

            if (catHead[0] <= dogHead[0])
                return dog.removeFirst();
            else
                return cat.removeFirst();
        }
    }

    /**
     * 选狗
     * @return
     */
    public int[] dequeueDog() {
        if (!dog.isEmpty()) {
            return dog.removeFirst();
        } else {
            return new int[]{-1,-1};
        }
    }

    /**
     * 选猫
     * @return
     */
    public int[] dequeueCat() {
        if (!cat.isEmpty()) {
            return cat.removeFirst();
        } else {
            return new int[]{-1,-1};
        }
    }

}
