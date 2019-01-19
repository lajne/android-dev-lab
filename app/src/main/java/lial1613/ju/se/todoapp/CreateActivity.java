package lial1613.ju.se.todoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class CreateActivity extends AppCompatActivity {
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
    }

    public void createButtonClicked(View view) {
        EditText editText = (EditText) findViewById(R.id.enteredTitle);
        String enteredTitle = editText.getText().toString();
        Data.ToDo myTodo = new Data.ToDo(enteredTitle);
        Data.todos.add(myTodo);

        System.out.println("Button clicked! :"+ Data.todos + Data.todos.size());

        finish();
    }
}
