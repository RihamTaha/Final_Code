package Dot;

public class Fore16_List {

    city city= new city();
    String cod;
    double message;
    int cnt;
   daily_list [] list=new daily_list[6];


    public Dot.city getCity() {
        return city;
    }

    public void setCity(Dot.city city) {
        this.city = city;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public double getMessage() {
        return message;
    }

    public void setMessage(double message) {
        this.message = message;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public daily_list[] getList() {
        return list;
    }

    public void setList(daily_list[] list) {
        this.list = list;
    }
}
