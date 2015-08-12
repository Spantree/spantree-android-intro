package net.spantree.intro;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * @author alliecurry
 */
public class TestFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View layout = inflater.inflate(R.layout.fragment_test, container, false);

        final EditText input = (EditText) layout.findViewById(R.id.input);
        final Button button = (Button) layout.findViewById(R.id.button);
        final TextView textView = (TextView) layout.findViewById(R.id.text);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String ourText = input.getText().toString();
                textView.setText(ourText);
            }
        });

        return layout;
    }
}
