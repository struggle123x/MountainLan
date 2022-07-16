package Assignment1;

import java.util.Scanner;

public class Test {

    public static void main(String [] args){

        String keyword;

        Solution solve = new Solution();
        Scanner input = new Scanner(System.in);
        BookLost book1 = new BookLost("《三体》","刘慈欣","小何","20211214","菜鸟驿站","衍生");
        BookLost book2 = new BookLost("《兄弟》","余华","小李","20220103","莘莘食堂","太极操场");
        BookLost book3 = new BookLost("《哈姆莱特》","莎士比亚","小高","20220503","五教","5601");
        CardLost card1 = new CardLost( 2021215000,"小余","国际","20220601","中心食堂","兴业六");
        CardLost card2 = new CardLost( 2021211234,"小张","光电","20210930","千喜鹤食堂","春华秋实广场");
        CardLost card3 = new CardLost( 2021212345,"小陈","经管","20220229","八教","宁静五");

        Lost[] array = {book1,book2,book3,card1,card2,card3};

        //排序
        solve.sortLost(array);

        //输入关键字进行查找
        System.out.print("请输入物品丢失时间： ");
        keyword = input.nextLine();

        System.out.println("请到" + solve.selectByKeyword(array,keyword).getRetrievalPlace() + "领取您丢失的物品");





    }
}
