package Dot;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StationService {
    //private  Stations Station = new Stations();
    private List<Stations> Stat =new ArrayList<>(Arrays.asList(new Stations("583436dd9643a9000196b8d6", "2016-11-22T12:15:25.967Z", "2016-11-22T12:15:25.967Z",
            "SF_TEST001", "San Francisco Test Station", -122.43, 37.76, 150, 0)
    ,new Stations("RadioFm","2016-11-22T12:15:25.967Z", "2016-11-22T12:15:25.967Z","SF_TEST002","Radio FM Test Station",-122.43, 37.76, 150, 0)));

    public List<Stations> getallStat_info() {
        return Stat;
    }
    public Stations getStation(String id)
    {
        return Stat.stream().filter(t->t.getId().equals(id)).findFirst().get();
    }
    public Stations getStation_By_name(String name)
    {
        return Stat.stream().filter(t->t.getName().equals(name)).findFirst().get();
    }
    public void addStation(Stations station)
    {
        Stat.add(station);
    }
}