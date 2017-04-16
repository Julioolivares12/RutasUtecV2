import android.app.Fragment;
import android.app.LauncherActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.julio.rutasutecv2.R;

/**
 * Created by julio on 04-15-17.
 */

public class inicio extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        return inflater.inflate(R.layout.inicio, container, false);
    }
}
