package memoizrlabs.com.modularstructure;

//import com.example.J7;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import memoizrlabs.com.two.ActivityTwo;
import memoizrlabs.com.two.Two;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Foo foo = new Foo();
//        foo.doSomething();
        Two bar = new Two();
        bar.printSomething();
//        J7 val = new J7();
//        val.doJ7();
        Intent intent = new Intent(this, ActivityTwo.class);
        startActivity(intent);
    }
}
