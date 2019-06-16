package android.example.doctormobile;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

public class OptionButtonAdapter extends ArrayAdapter<OptionButton> {
    public OptionButtonAdapter(Activity context,@NonNull ArrayList<OptionButton> objects){
        super(context, 0,  objects);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_user_pannel, parent, false);
        }
        OptionButton currentBtn = getItem(position);

        return listItemView;
    }
}
