package com.zarinpal.libs.bottomsheet;

import android.support.v4.app.FragmentManager;
import android.view.View;

/**
 * Created by ImanX.
 * bottom-sheet | Copyrights 2017 ZarinPal Crop.
 */

public class BottomSheetTransparentModal extends BottomSheetModal {

    public BottomSheetTransparentModal(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getLayout() {
        return R.layout.bottom_sheet_test;
    }

    @Override
    public void getView(View view) {

    }

    @Override
    public boolean isMakeTransparent() {
        return true;
    }
}
