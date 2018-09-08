package ai.bonobo.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ShoppingItemAdapter adapter;

    List<ShoppingItem> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        itemList = new ArrayList<>();
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        //vertical recycler view
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        itemList.add(new ShoppingItem(1,"EGGS", 4.5));
        itemList.add(new ShoppingItem(2,"tommatoes", 5.25));

        adapter = new ShoppingItemAdapter(this,itemList);
        recyclerView.setAdapter(adapter);
    }
}
