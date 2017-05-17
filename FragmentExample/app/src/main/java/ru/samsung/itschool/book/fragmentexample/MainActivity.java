package ru.samsung.itschool.book.fragmentexample;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MessageFragment fragment =  (MessageFragment)getFragmentManager().findFragmentById(R.id.fragment_detail);
        Bundle extras = getIntent().getExtras();
        if(extras != null){
            String value = extras.getString("value");
            if(value !=null && fragment != null && fragment.isInLayout()){
                fragment.setMessage(value);
            }
        }
    }
}
