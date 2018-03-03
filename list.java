package Dot;

public class list {

    main main = new main();
    weather[] weather = new weather[4];
    clouds clouds;
    wind wind = new wind();
    sys sys = new sys();
    int dt;
   String dt_txt;

    public Dot.main getMain() {
        return main;
    }

    public void setMain(Dot.main main) {
        this.main = main;
    }

    public Dot.weather[] getWeather() {
        return weather;
    }

    public void setWeather(Dot.weather[] weather) {
        this.weather = weather;
    }

    public Dot.clouds getClouds() {
        return clouds;
    }

    public void setClouds(Dot.clouds clouds) {
        this.clouds = clouds;
    }

    public Dot.wind getWind() {
        return wind;
    }

    public void setWind(Dot.wind wind) {
        this.wind = wind;
    }

    public Dot.sys getSys() {
        return sys;
    }

    public void setSys(Dot.sys sys) {
        this.sys = sys;
    }

    public int getDt() {
        return dt;
    }

    public void setDt(int dt) {
        this.dt = dt;
    }

    public String getDt_txt() {
        return dt_txt;
    }

    public void setDt_txt(String dt_txt) {
        this.dt_txt = dt_txt;
    }
}