package lial1613.ju.se.todoapp;

import java.util.ArrayList;

public class Data {
    public static ArrayList<ToDo> todos = new ArrayList<>();
    static {
        todos.add(new Todo("Do A"));
        todos.add(new Todo("Do B"));
        todos.add(new Todo("Do C"));
    }
    public static class ToDo{
        public String title;
        public ToDo(String title) { this.title = title; }
        @Override
        public String toString() { return "Todo: "+title; }
    }

}
