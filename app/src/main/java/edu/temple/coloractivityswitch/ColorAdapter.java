package edu.temple.coloractivityswitch;

import android.content.Context;
import android.graphics.Color;
import android.provider.CalendarContract;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ColorAdapter extends BaseAdapter {
    private Context context;
    private String[] displayColors;
    private String[] actualColors;

    public ColorAdapter(Context context, String[] displayColors, String[] actualColors) {
        this.context = context;
        this.displayColors = displayColors;
        this.actualColors = actualColors;
    }

    @Override
    public int getCount() {

        return displayColors.length;
    }

    @Override
    public Object getItem(int i) {

        return displayColors[i];
    }

    @Override
    public long getItemId(int i) {

        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        TextView textView = new TextView(context);

        String displayColor = displayColors[i];
        String backgroundColor = actualColors[i];

        textView.setText(displayColor);

        textView.setBackgroundColor(Color.parseColor(backgroundColor));


        return textView;

    }
}
