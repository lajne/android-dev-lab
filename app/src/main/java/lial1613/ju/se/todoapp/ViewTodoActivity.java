package lial1613.ju.se.todoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ViewTodoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_todo);
        Intent intent = getIntent();
        String todoTitle = intent.getStringExtra("todoIndex");
        System.out.println("title: " + todoTitle);
        TextView textView = (TextView) findViewById(R.id.todoTitle);
        textView.setText(todoTitle);
    }
}
