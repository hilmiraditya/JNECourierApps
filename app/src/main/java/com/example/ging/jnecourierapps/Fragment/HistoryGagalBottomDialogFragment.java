package com.example.ging.jnecourierapps.Fragment;

import android.os.Bundle;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.ging.jnecourierapps.R;

public class HistoryGagalBottomDialogFragment extends BottomSheetDialogFragment {
    Button tutup_history_gagal;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Button tutup_history_gagal;
        View view = inflater.inflate(R.layout.bottomsheet_history_gagal, container, false);
        tutup_history_gagal = view.findViewById(R.id.tutup_history_gagal);
        tutup_history_gagal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HistoryGagalBottomDialogFragment.this.dismiss();
            }
        });
        return view;
    }
}