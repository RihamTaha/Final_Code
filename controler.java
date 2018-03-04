package com.example.demo;

import Dot.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class controler {

    @RequestMapping(value = "/Current/find/{country}", method = RequestMethod.GET)
    public Application_1 find(@PathVariable("country") String country) {
        final String url = "http://api.openweathermap.org/data/2.5/weather?q=" + country + "&appid=f09cd168ee19b4943e8841a6ad89a042";
        RestTemplate tr = new RestTemplate();
        Application_1 r = tr.getForObject(url, Application_1.class);
        return r;
    }

    @RequestMapping(value = "/Current/Name/{country}", method = RequestMethod.GET)
    public Application_1 f(@PathVariable("country") String country) {
        final String url = "http://api.openweathermap.org/data/2.5/weather?q=" + country + ",uk&appid=f09cd168ee19b4943e8841a6ad89a042";
        RestTemplate tr = new RestTemplate();
        Application_1 r = tr.getForObject(url, Application_1.class);
        return r;
    }

    @RequestMapping(value = "/Current/ID/{CityID}", method = RequestMethod.GET)
    public Application_1 f1(@PathVariable("CityID") int ID) {
        final String url = "http://api.openweathermap.org/data/2.5/weather?id=" + ID + "&appid=f09cd168ee19b4943e8841a6ad89a042";
        RestTemplate tr = new RestTemplate();
        Application_1 r = tr.getForObject(url, Application_1.class);
        return r;
    }


    @RequestMapping(value = "/Current/geographic_coordinates/{num1}/{num2}", method = RequestMethod.GET)
    public Application_1 f2(@PathVariable("num1") int num1, @PathVariable("num2") int num2)

    {
        final String url = "http://api.openweathermap.org/data/2.5/weather?lat=" + num1 + "&lon=" + num2 + "&appid=f09cd168ee19b4943e8841a6ad89a042";

        RestTemplate tr = new RestTemplate();
        Application_1 r = tr.getForObject(url, Application_1.class);
        return r;
    }


    @RequestMapping(value = "/Current/Zip/{ZipCode}", method = RequestMethod.GET)
    public Application_1 f3(@PathVariable("ZipCode") int ZipCode) {
        final String url = "http://api.openweathermap.org/data/2.5/weather?zip=" + ZipCode + "&appid=f09cd168ee19b4943e8841a6ad89a042";
        RestTemplate tr = new RestTemplate();
        Application_1 r = tr.getForObject(url, Application_1.class);
        return r;
    }

    ////////////////////////////////////////////////////////////////////////////
    @RequestMapping(value = "/Current/Multilingual_support/{id}/{lang}", method = RequestMethod.GET)
    public Application_1 f4(@PathVariable("id") int id, @PathVariable("lang") String lang) {
        final String url = "http://api.openweathermap.org/data/2.5/weather?id=" + id + "&lang=" + lang + "&appid=f09cd168ee19b4943e8841a6ad89a042";
        RestTemplate tr = new RestTemplate();
        Application_1 r = tr.getForObject(url, Application_1.class);
        return r;
    }

    @RequestMapping(value = "/5days/City_ID/{id}", method = RequestMethod.GET)
    public Big_List Call_5days_3hour_Forecast(@PathVariable("id") int id) {
        final String url = "http://api.openweathermap.org/data/2.5/forecast?id=" + id + "&appid=f09cd168ee19b4943e8841a6ad89a042";
        RestTemplate tr = new RestTemplate();
        Big_List r = tr.getForObject(url, Big_List.class);
        return r;
    }

    @RequestMapping(value = "/Alias/{lat}/{lon}/{datetime}", method = RequestMethod.GET)
    public Alias da(@PathVariable("lat") double lat, @PathVariable("lon") double lon, @PathVariable("datetime") String datetime) {
        final String url = "http://api.openweathermap.org/pollution/v1/co/" + lat + "," + lon + "/" + datetime + ".json?appid=f09cd168ee19b4943e8841a6ad89a042";
        RestTemplate tr = new RestTemplate();
        Alias r = tr.getForObject(url, Alias.class);
        return r;
    }

    @RequestMapping(value = "/accumulated_temperature/{id}/{start}/{end}")
    public accumulated_temperature temperature(@PathVariable("id") int id, @PathVariable("start") int start, @PathVariable("end") int end) {
        final String url = "http://api.openweathermap.org/data/2.5/history/accumulated_precipitation?id=" + id + "&start=" + start + "&end=" + end + "&appid=f09cd168ee19b4943e8841a6ad89a042";
        RestTemplate tr = new RestTemplate();
        accumulated_temperature r = tr.getForObject(url, accumulated_temperature.class);
        return r;
    }

    @RequestMapping(value = "/UV/{lat}/{lon}", method = RequestMethod.GET)
    public UV uv(@PathVariable("lat") double lat, @PathVariable("lon") double lon) {
        final String url = "http://api.openweathermap.org/data/2.5/uvi?lat=" + lat + "&lon=" + lon + "&appid=f09cd168ee19b4943e8841a6ad89a042";
        RestTemplate tr = new RestTemplate();
        UV r = tr.getForObject(url, UV.class);
        return r;
    }

    @RequestMapping(value = "/Stations", method = RequestMethod.GET)

    public Stations[] st() {
        final String url = "http://api.openweathermap.org/data/3.0/stations?appid=f09cd168ee19b4943e8841a6ad89a042";
        RestTemplate tr = new RestTemplate();
        Stations[] r = tr.getForObject(url, Stations[].class);
        return r;
    }

    @RequestMapping(value = "/triggers", method = {})
    public Trigg[] Tri() {
        final String url = " http://api.openweathermap.org/data/3.0/triggers?appid=f09cd168ee19b4943e8841a6ad89a042";
        RestTemplate tr = new RestTemplate();
        Trigg[] r = tr.getForObject(url, Trigg[].class);
        return r;
    }

    //@Autowired
    private StationService Stationserv = new StationService();

    @RequestMapping("/Stations")
    public List<Stations> getallStation()
    {
       return Stationserv.getallStat_info();
    }
    @RequestMapping("/Stations/{id}")
    public Stations getStation(@PathVariable ("id") String id)
    {
        return Stationserv.getStation(id);
    }
    @RequestMapping("/Stations/{external_id}/{name}/{latitude}/{longitude}/{altitude}")
    public Stations getStation2(@PathVariable ("external_id") String external_id,@PathVariable("name") String name ,@PathVariable("latitude") double latitude ,@PathVariable("longitude") double longitude,@PathVariable("altitude") int altitude)
    {
        return Stationserv.getStation_By_name(name);
    }

    @RequestMapping(value = "/Stations", method = RequestMethod.POST)
    public void AddStation (@RequestBody Stations station)
    {
        Stationserv.addStation(station);
    }
}
