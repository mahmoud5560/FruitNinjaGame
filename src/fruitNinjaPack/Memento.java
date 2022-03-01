package fruitNinjaPack;

import java.util.ArrayList;

public class Memento {
	   private ArrayList<Integer> list=new ArrayList<Integer>();

	    public Memento(ArrayList<Integer> list) {
	        this.list = list;
	    }
	    public ArrayList<Integer> getArticle() {
	        return list;
	    }
}
