package com.example.ging.jnecourierapps.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.ging.jnecourierapps.Adapter.HistoryAdapter;
import com.example.ging.jnecourierapps.Adapter.TaskAdapter;
import com.example.ging.jnecourierapps.R;

public class HistoryFragment extends Fragment {

    SwipeRefreshLayout mySwipeRefreshLayout;
    RecyclerView historyList;
    HistoryAdapter historyAdapter;
    View viewTemp;


    @Override
    public void onStart() {
        super.onStart();
        mySwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                Log.i("PULLL", "PULLL");

                final Toast toast = Toast.makeText(getActivity(), "Updating...", Toast.LENGTH_LONG);
                toast.show();


                final Handler delay = new Handler();
                delay.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Log.i("PULL TIME", "1000ms");
                        mySwipeRefreshLayout.setRefreshing(false);
                        toast.cancel();
                    }
                }, 4000);


            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_history, container, false);
        viewTemp = view;

        historyAdapter = new HistoryAdapter(getContext());


        historyList = view.findViewById(R.id.historyList);
        historyList.setLayoutManager(new LinearLayoutManager(getActivity()));
        historyList.setItemAnimator(new DefaultItemAnimator());
        historyList.setAdapter(historyAdapter);


        mySwipeRefreshLayout = view.findViewById(R.id.historyRefresh);

        return view;
    }
}
