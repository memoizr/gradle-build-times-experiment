package memoizrlabs.com.two;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        System.out.println("i'm inside activity two");
    }
}
