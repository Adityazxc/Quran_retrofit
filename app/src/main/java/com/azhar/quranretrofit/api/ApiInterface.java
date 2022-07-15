package com.azhar.quranretrofit.api;

import com.azhar.quranretrofit.model.Cek;
import com.azhar.quranretrofit.model.Data;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
//  15-07-22
//          Aditya Firmansyah
//  10119182
public interface ApiInterface {
    @GET("quran/id.indonesian")
    Call<Data> getData();

    @GET("quran/quran-uthmani")
    Call<Cek> getDataArabic();

    @GET("quran/{lang}")
    Call<Cek> getCek(@Path("lang") String lang);

    @GET("surah/1/id.indonesian")
    Call<Cek> getSurahTranslation(/*@Path("id")int id*/);

    // id.indonesian
}
