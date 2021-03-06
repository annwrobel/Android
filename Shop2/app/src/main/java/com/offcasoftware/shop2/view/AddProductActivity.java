package com.offcasoftware.shop2.view;

import com.offcasoftware.shop2.R;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.DatePicker;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author maciej.pachciarek on 2017-02-20.
 */

public class AddProductActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_product);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.product_available)
    public void onDataPickerClick(View view) {
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, dataPickerListener, 2017, 2, 7);
        datePickerDialog.show();
    }

    private final DatePickerDialog.OnDateSetListener dataPickerListener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(final DatePicker view, final int year, final int month, final int dayOfMonth) {

        }
    };
}
