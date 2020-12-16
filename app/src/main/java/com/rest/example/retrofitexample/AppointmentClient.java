package com.rest.example.retrofitexample;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface AppointmentClient {

    @GET("api/appointments")
    Call<List<Appointment>> getAppointments();
}
