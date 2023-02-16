package com.example.skills_6_1.networking;

public class RetrofitContent {
    private static RetrofitClient instance = null;
    private APIs apis;

    private RetrofitClient() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(APIs.BASE_URL).add
    }
}
