package com.example.ging.jnecourierapps;

import android.app.Dialog;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.View;

public class ProfileLogoutBottomDialogFragment extends BottomSheetDialogFragment {
    @Override

    public void setupDialog(final Dialog dialog, int style) {
        super.setupDialog(dialog, style);
        View contentView = View.inflate(getContext(), R.layout.bottomsheet_profile_logout, null);
        dialog.setContentView(contentView);
    }
}