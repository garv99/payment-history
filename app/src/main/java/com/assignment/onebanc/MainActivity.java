package com.assignment.onebanc;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.assignment.onebanc.response.Requests;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements Callback<Requests> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ApiBuilder controller = new ApiBuilder();
        controller.start(this);
    }

    @Override
    public void onResponse(Call<Requests> call, Response<Requests> response) {

            if(response.isSuccessful()) {
                Requests changesList = response.body();
                RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
                Adapter adapter = new Adapter(changesList);
                recyclerView.setHasFixedSize(true);
                recyclerView.setLayoutManager(new LinearLayoutManager(this));
                recyclerView.setAdapter(adapter);
            } else {
                System.out.println(response.errorBody());
            }
    }

    @Override
    public void onFailure(Call<Requests> call, Throwable t) {
        t.printStackTrace();
    }
}