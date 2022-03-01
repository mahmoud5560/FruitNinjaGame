package fruitNinjaPack;

import java.util.ArrayList;

public class Originator {
	private ArrayList<Integer> list=new ArrayList<Integer>();

    public void setArticle(ArrayList<Integer> list) {
        this.list = list;
    }
    public Memento storeInMemento(){
        return new Memento(list);
    }
    public ArrayList<Integer> restoreFromMomento(Memento memento){
        list = memento.getArticle();
        return list;
    }
}
