package Dot;

public class Stations {
    String id;
    String created_at;
    String updated_at;
    String external_id;
    String name;
    double longitude;
    double latitude;
    int altitude;
    int rank;

    public Stations(String s, String s1, String s2, String sf_test001, String san_francisco_test_station, double v, double v1, int i, int i1) {

        this.id=s;
        this.created_at=s1;
        this.updated_at=s2;
        this.external_id=sf_test001;
        this.name=san_francisco_test_station;
        this.longitude=v;
        this.latitude=v1;
        this.altitude=i;
        this.rank=i1;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getExternal_id() {
        return external_id;
    }

    public void setExternal_id(String external_id) {
        this.external_id = external_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
