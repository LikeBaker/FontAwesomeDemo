package co.liuzhen.fontawesomedemo;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;
import java.util.Random;

/**
 * Created by liuzhen000 on 2016/8/28.
 */
public class Adapter extends RecyclerView.Adapter {

    private Context context;
    private List<String> list;
    private Typeface iconFont;

    public Adapter(Context context, List<String> list) {
        this.context = context;
        this.list = list;
        iconFont = FontManager.getTypeface(context, FontManager.FONTAWESOME);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(View.inflate(context, R.layout.item, null));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ViewHolder viewHolder = (ViewHolder) holder;
        viewHolder.textView.setText(list.get(position));
        viewHolder.textView.setTextColor(0xff000000 | new Random().nextInt(0x00ffffff));
        viewHolder.textView.setTextSize(10 | new Random().nextInt(30));
        FontManager.markAsIconContainer(viewHolder.textView, iconFont);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.item);
        }
    }
}
