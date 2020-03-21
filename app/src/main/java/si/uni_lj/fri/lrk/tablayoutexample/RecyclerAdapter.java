package si.uni_lj.fri.lrk.tablayoutexample;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.CardViewHolder> {

    private String[] titles = {"Mercury",
            "Venus",
            "Earth",
            "Mars",
            "Jupiter",
            "Saturn",
            "Uranus",
            "Neptune"};

    private String[] details = {"The smallest planet",
            "The second brightest object in the night sky", "The only known to harbour life",
            "Named after the Roman god of war", "The largest planet in the Solar system",
            "Famous for its rings", "The coldest planet",
            "The farthest from the Sun"};

    private int[] images = {R.drawable.mercury,
            R.drawable.venus,
            R.drawable.earth,
            R.drawable.mars,
            R.drawable.jupiter,
            R.drawable.saturn,
            R.drawable.uranus,
            R.drawable.neptune};


    class CardViewHolder extends RecyclerView.ViewHolder {
        public ImageView itemImage;
        public TextView itemTitle;
        public TextView itemDetail;

        public CardViewHolder(View itemView) {
            super(itemView);

            // TODO: set the above fields, show Snackbar when a user clicks on an item
        }
    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        // TODO: Inflate the view, make a CardViewHolder and return it
        return null;
    }

    @Override
    public void onBindViewHolder(CardViewHolder viewHolder, int i) {
        // TODO: set the image, title, and details data
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}
