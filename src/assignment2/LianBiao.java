package assignment2;

import org.w3c.dom.Node;

import java.util.LinkedList;
import java.util.List;

/**
 * 实现双向链表
 */

public class LianBiao <T>{
    private LinkedList first;
    private LinkedList last;
    private LinkedList data;
    private int size = 0;


    public void addFirst(T value){

        LinkedList newLink = new LinkedList();
        if(first == null){
            this.last = newLink;
        }else{
            first = newLink;
        }


    }



}
