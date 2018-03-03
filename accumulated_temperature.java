package Dot;

public class accumulated_temperature {
    String message;
    String cod;
    int city_id;
    double calctime;
    accumulated_temperature_List[] list=new accumulated_temperature_List[3];

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public double getCalctime() {
        return calctime;
    }

    public void setCalctime(double calctime) {
        this.calctime = calctime;
    }

    public accumulated_temperature_List[] getList() {
        return list;
    }

    public void setList(accumulated_temperature_List[] list) {
        this.list = list;
    }
}
