package Assignment1;

public class Lost {

    protected String date;//丢失日期
    protected String retrievalPlace;//领取丢失物品的地方
    protected String lostPlace;//丢失物品的地方

    public Lost(){

    }

    public Lost(String date,String retrievalPlace,String lostPlace){
        this.date = date;
        this.retrievalPlace = retrievalPlace;
        this.lostPlace = lostPlace;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate(){
        return this.date;
    }

    public String getLostPlace() {
        return lostPlace;
    }

    public String getRetrievalPlace() {
        return retrievalPlace;
    }

    public void setLostPlace(String lostPlace) {
        this.lostPlace = lostPlace;
    }

    public void setRetrievalPlace(String retrievalPlace) {
        this.retrievalPlace = retrievalPlace;
    }

    @Override
    public String toString() {
        return "Lost{" +
                "date='" + date + '\'' +
                ", retrievalPlace='" + retrievalPlace + '\'' +
                ", lostPlace='" + lostPlace + '\'' +
                '}';
    }
}
