package xyz.codeme.loginer;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public static String TAG = "LoginerMain";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getFragmentManager();
        Fragment loginFragment = fragmentManager.findFragmentById(R.id.fragmentContainer);
        if(loginFragment == null) {
            loginFragment = new LoginFragment();
            fragmentManager.beginTransaction()
                    .add(R.id.fragmentContainer, loginFragment)
                    .commit();
        }
    }

}
