package com.techisquad.tribalsports.postdemo;

import android.os.AsyncTask;
import android.util.Log;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class HttpGetAsyncTask extends AsyncTask<String,Void,Void> {


    GetApiCallbackResult getCallback;

    public HttpGetAsyncTask(GetApiCallbackResult result){
        this.getCallback=result;
    }


    @Override
    protected Void doInBackground(String... params) {


        try {
            // avoid creating several instances, should be singleon
            //OkHttpClient client = new OkHttpClient();
            OkHttpClient client = new OkHttpClient.Builder()
                    .connectTimeout(10, TimeUnit.SECONDS)
                    .writeTimeout(10, TimeUnit.SECONDS)
                    .readTimeout(30, TimeUnit.SECONDS)
                    .build();

            Request.Builder requestBuilder = new Request.Builder();


            client.newCall(requestBuilder.url(params[0]).build()).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    e.printStackTrace();
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {

                    //I have converted that into String.ab bs jo karna hai String se karlo.that's it.Read once
                    //ask doubt...
                    // ye oth get ke lite tha POST ke liye bhi kuch hai aisa sa easy ?
                    //yes absolutely yehi library hai .
                    //bt first see one more get example..let m check .give 2min

                    final String responseStr = response.body().string();

                    Log.e("TAG", "Response fetched for posts : " + responseStr);

                    if (responseStr != null && !responseStr.isEmpty()) {

                        Log.d("TAG", "Response is : " + responseStr);
                        getCallback.onResponseReceived(responseStr);

                        // We parsed here
//                            User[] userData = new Gson().fromJson(responseStr, User[].class);
//
//                            for (User user : userData) {
//                                Log.d("Result is ", user.getId() + ":" + user.getName());
//                            }
                    }
                }
            });

        } catch (Exception e) {

            Log.d("TAG", "Exception in reading response");

        }

        return null;

    }

    @Override
    protected void onPostExecute(Void result){
        super.onPostExecute(result);
    }

}
