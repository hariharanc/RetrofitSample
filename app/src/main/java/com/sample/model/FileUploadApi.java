package com.sample.model;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

/**
 * Created by hariharan on 22-06-2016.
 */
public interface FileUploadApi {
    @Multipart
    @POST("media/UploadToServer.php")
    Call<ResponseBody> upload(@Part MultipartBody.Part file);
}
