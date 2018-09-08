package ai.bonobo.recycleview;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by cardel6 on 08/09/2018.
 */
// RecyclerView.Adapter --> binds the data to the view
    // RecyclerView.ViewHolder --> holds the view
public class ShoppingItemAdapter extends RecyclerView.Adapter<ShoppingItemAdapter.ShoppingItemViewHolder> {
    private Context mCtx;
    private List<ShoppingItem> itemsList;

    public ShoppingItemAdapter(Context mCtx, List<ShoppingItem> itemsList) {
        this.mCtx = mCtx;
        this.itemsList = itemsList;
    }

    //will return our ViewHolder
    @NonNull
    @Override
    public ShoppingItemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.list_items_layout, null);
        //line 53
        ShoppingItemViewHolder holder = new ShoppingItemViewHolder(view);
        return holder;
    }

    //will bind data to our viewHolder
    @Override
    public void onBindViewHolder(@NonNull ShoppingItemViewHolder shoppingItemViewHolder, int i) {
        ShoppingItem item = itemsList.get(i);
        //bind date to UI elements
        shoppingItemViewHolder.txtViewName.setText(item.getName());
        shoppingItemViewHolder.txtViewPrice.setText(String.valueOf(item.getPrice()));
        //shoppingItemViewHolder.itemView.setImageDrawable(mCtx.getResources().getDrawable(ShoppingItem.getImage(),null))
    }
    // return the size of the list
    @Override
    public int getItemCount() {
        return itemsList.size();
    }

    //we have to create the UI elements in this class
    class ShoppingItemViewHolder extends RecyclerView.ViewHolder{
        //ImageView imageView;

        TextView txtViewName, txtViewPrice;

        //we pass here the list_items_layout View
        // we need to inflate with the layout_inflator
        //in order to do that we need the Context to create the layout_inflator
        public ShoppingItemViewHolder(@NonNull View itemView) {
            super(itemView);

           // imageView = itemView.findViewById(R.id.imageView);
            txtViewName = itemView.findViewById(R.id.textViewTitle);
            txtViewPrice = itemView.findViewById(R.id.textViewPrice);

        }
    }
}
