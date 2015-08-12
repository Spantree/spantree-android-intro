package net.spantree.intro;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        replaceFragment(new TestFragment(), R.id.container);
    }

    public void replaceFragment(final Fragment fragment, final int containerId) {
        FragmentManager manager = getFragmentManager();
        manager.beginTransaction()
                .replace(containerId, fragment)
                .commit();
    }
}
