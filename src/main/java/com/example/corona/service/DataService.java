package com.example.corona.service;

import org.springframework.web.context.support.HttpRequestHandlerServlet;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class DataService {

    private static String VIRUS_DATA_URL = "https://raw.githubusercontent.com/CSSEGISandData/COVID-19/master/csse_covid_19_data/csse_covid_19_time_series/time_series_covid19_confirmed_global.csv";

    public void fetchVirusData() {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(VIRUS_DATA_URL))
                .build();
    }
}
