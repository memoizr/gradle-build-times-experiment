package memoizrlabs.com.modularstructure;

//import com.example.j7;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

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
//        j7 val = new j7();
//        val.doJ7();

    }
}
