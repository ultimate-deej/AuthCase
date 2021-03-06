package com.matsyuk.authcase.data.network;

import com.matsyuk.authcase.domain.main.SomeModel;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * @author e.matsyuk
 */
public interface SomeApi {

    @GET("/api/get")
    Observable<SomeModel> getData();

}
