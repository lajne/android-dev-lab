package lial1613.ju.se.todoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class PickTodoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_todo);
        Intent intent = getIntent();
        final String sender = intent.getStringExtra("sender");
        System.out.println("sender: " + sender);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(new ArrayAdapter<Data.ToDo>(
                this,
                android.R.layout.simple_list_item_1,
                Data.todos
        ));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(sender.equals("select")) {
                    Intent intent = new Intent(PickTodoActivity.this, ViewTodoActivity.class);
                    String title = ((TextView) view).getText().toString();
                    intent.putExtra("todoIndex", title);
                    startActivity(intent);
                } else {
                    Intent intent = new Intent(PickTodoActivity.this, DeleteActivity.class);
                    String title = ((TextView) view).getText().toString();
                    intent.putExtra("todoIndex", title);
                    intent.putExtra("todoPos", position);
                    startActivity(intent);
                }
            }
        });
    }
    @Override
    public void onRestart() {
        super.onRestart();
        //Refresh view
        recreate();

    }
}
