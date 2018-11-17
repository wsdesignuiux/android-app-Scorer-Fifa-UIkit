package adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import e.wolfsoft1.scorer_fifa_uikit.R;
import model.Scorer_Model;

public class Scorer_Adapter extends RecyclerView.Adapter<Scorer_Adapter.MyViewHolder> {

    private Context context;
    private ArrayList<Scorer_Model> countryModelArrayList;

    public Scorer_Adapter(Context context, ArrayList<Scorer_Model> countryModelArrayList) {
        this.context = context;
        this.countryModelArrayList = countryModelArrayList;
    }

    @NonNull
    @Override
    public Scorer_Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_scorer, parent, false);


        return new Scorer_Adapter.MyViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull Scorer_Adapter.MyViewHolder holder, int position) {
        Scorer_Model modelfoodrecycler = countryModelArrayList.get(position);

        holder.groupid.setText(modelfoodrecycler.getGroupid());
//code of replacing text
        if (position == 2) {
            holder.score.setText("-");
        }
        if (position == 3) {
            holder.score.setText("-");
        }
        if (position == 4) {
            holder.score.setText("-");
        }
    }

    @Override
    public int getItemCount() {
        return countryModelArrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {


        TextView score;
        TextView live1;

        TextView groupid;

        public MyViewHolder(View itemView) {
            super(itemView);


            groupid = itemView.findViewById(R.id.groupid);
            score = itemView.findViewById(R.id.score);
            live1 = itemView.findViewById(R.id.live1);


        }
    }
}
