package com.zarinpal.bottomsheet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.zarinpal.libs.bottomsheet.BottomSheetTransparentModal;
import com.zarinpal.libs.bottomsheet.OnListBottomSheetItemClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final PurseBottomSheetModal purseBottomSheetModal = new PurseBottomSheetModal(getSupportFragmentManager());

        findViewById(R.id.btn_show).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new BottomSheetTransparentModal(getSupportFragmentManager()).show();
                //purseBottomSheetModal.show();

            }
        });

        purseBottomSheetModal.setOnItemClickListener(new OnListBottomSheetItemClickListener<PurseModel>() {
            @Override
            public void onListBottomSheetItemClick(PurseModel element, int position, int viewType) {
                Toast.makeText(MainActivity.this, element.getName(), Toast.LENGTH_SHORT).show();
            }
        });



    }
}
