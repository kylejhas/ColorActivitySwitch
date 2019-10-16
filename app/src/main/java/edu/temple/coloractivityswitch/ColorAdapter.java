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
    private String[] colors;

    public ColorAdapter(Context context, String[] colors) {
        this.context = context;
        this.colors = colors;
    }

    @Override
    public int getCount() {

        return colors.length;
    }

    @Override
    public Object getItem(int i) {

        return colors[i];
    }

    @Override
    public long getItemId(int i) {

        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        TextView textView = new TextView(context);

        String colorVal = colors[i];

        textView.setText(colorVal);

        switch(colors[i]){
            case "Rojo":
                textView.setBackgroundColor(Color.parseColor("Red"));
                break;
            case "Azul":
                textView.setBackgroundColor(Color.parseColor("Blue"));
                break;
            case "Verde":
                textView.setBackgroundColor(Color.parseColor("Green"));
                break;
            case "Amarillo":
                textView.setBackgroundColor(Color.parseColor("Yellow"));
                break;
            case "Purpura":
                textView.setBackgroundColor(Color.parseColor("Purple"));
                break;
            case "Cian":
                textView.setBackgroundColor(Color.parseColor("Cyan"));
                break;
            case "Negro":
                textView.setBackgroundColor(Color.parseColor("Black"));
                break;
            case "Blanco":
                textView.setBackgroundColor(Color.parseColor("White"));
                break;
            case "Gris":
                textView.setBackgroundColor(Color.parseColor("Gray"));
                break;
            default:
                textView.setBackgroundColor(Color.parseColor(colors[i]));
                break;
        }


        return textView;
    }
}
