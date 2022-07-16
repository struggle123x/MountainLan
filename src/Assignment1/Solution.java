package Assignment1;

public class Solution {

    /**
     * A method that can achieve the rank based on the lost time.
     * @param lostArray
     */
    public void sortLost(Lost[] lostArray){
        for(int i = 0;i < lostArray.length - 1;i++){
            for(int j = 0;j < lostArray.length - i - 1;j++){
                if(Integer.parseInt(lostArray[j].getDate()) > Integer.parseInt(lostArray[j + 1].getDate())){
                    Lost temp = lostArray[j];
                    lostArray[j] = lostArray[j + 1];
                    lostArray[j + 1] = temp;
                }
            }
        }
    }

    /**
     * 通过输入丢失时间，来找到可能符合要求的物品
     * @param lostArray
     * @param keyword
     * @return returns the probably satisfactory lost things.
     */
    /*
    public Lost[] selectByKeyword(Lost[] lostArray,String keyword){
        Lost[] tempArray =new Lost[lostArray.length];
        for(int i = 0;i < lostArray.length;i++){
            if(lostArray[i].getDate().equals(keyword)){
                tempArray[i] = lostArray[i];
            }
        }

        return tempArray;
    }
*/

    public Lost selectByKeyword(Lost[] lostArray,String keyword){
        Lost temp = new Lost();
        for(int i = 0;i < lostArray.length;i++){
            if(lostArray[i].getDate().equals(keyword)){
                temp = lostArray[i];
            }
        }
        return temp;
    }

}
