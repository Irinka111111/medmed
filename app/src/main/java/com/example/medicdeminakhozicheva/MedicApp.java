package com.example.medicdeminakhozicheva;

import android.provider.ContactsContract;

import com.example.medicdeminakhozicheva.*;


import java.util.List;


import  okhttp3.MultipartBody;
import retrofit2.Call;
import  retrofit2.http.Body;
import  retrofit2.http.GET;
import  retrofit2.http.Header;
import  retrofit2.http.Multipart;
import  retrofit2.http.POST;
import  retrofit2.http.PUT;
import  retrofit2.http.Part;


public interface MedicApp {
    @POST("api/sendCode")
    Call<EmailResponse> sendCode(
            @Header("email") String email
    );
    @POST("api/signin")
    Call<CodeResponse> signIn(
            @Header("email") String email,
            @Header("code") String code

    );

}
