package Dot;

public class Alias {
    String time;
    location location = new location();
    data []data= new data[3];

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Dot.location getLocation() {
        return location;
    }

    public void setLocation(Dot.location location) {
        this.location = location;
    }

    public Dot.data[] getData() {
        return data;
    }

    public void setData(Dot.data[] data) {
        this.data = data;
    }
}
