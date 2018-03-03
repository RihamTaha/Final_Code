package Dot;

public class Application_1 {
        String base;
        int visibility;
        int id;
        String name;
        int cod;
        int dt;
    coord  coord ;
    weather[] weather= new weather[4] ;
    sys sys=new sys();
    main main=new main();
    clouds clouds;
    wind wind = new wind();

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getDt() {
        return dt;
    }

    public void setDt(int dt) {
        this.dt = dt;
    }

    public Dot.coord getCoord() {
        return coord;
    }

    public void setCoord(Dot.coord coord) {
        this.coord = coord;
    }

    public Dot.weather[] getWeather() {
        return weather;
    }

    public void setWeather(Dot.weather[] weather) {
        this.weather = weather;
    }

    public Dot.sys getSys() {
        return sys;
    }

    public void setSys(Dot.sys sys) {
        this.sys = sys;
    }

    public Dot.main getMain() {
        return main;
    }

    public void setMain(Dot.main main) {
        this.main = main;
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
}
