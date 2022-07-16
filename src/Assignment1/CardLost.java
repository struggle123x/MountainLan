package Assignment1;

public class CardLost extends Lost{
    private String name;//卡上的姓名
    private String college;//学院
    private int IDnumber;//学号

    public CardLost(){ }

    public CardLost(int IDnumber, String name, String college, String date, String lostPlace, String retrievalPlace ){
        super(date,retrievalPlace,lostPlace);
        this.IDnumber = IDnumber;
        this.name = name;
        this.college = college;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCollege(String college){
        this.college = college;
    }

    public String getName(){
        return this.name;
    }

    public String getCollege(){
        return this.name;
    }

    public void setIDnumber(int IDnumber) {
        this.IDnumber = IDnumber;
    }

    public int getIDnumber() {
        return IDnumber;
    }

    @Override
    public String toString() {
        return "CordLost{" +
                "name='" + name + '\'' +
                ", college='" + college + '\'' +
                ", IDnumber=" + IDnumber +
                '}';
    }
}
