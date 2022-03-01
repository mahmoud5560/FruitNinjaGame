package fruitNinjaPack;

import java.util.ArrayList;

public class Care_taker {
	ArrayList<Memento> savedArticles = new ArrayList<Memento>();
    public void addMemento(Memento m){
        savedArticles.add(m);
    }
    public Memento getMemento (int index){
        return savedArticles.get(index);
    }
    public Memento getlast (){
        return savedArticles.get(savedArticles.size()-1);
    }
}
