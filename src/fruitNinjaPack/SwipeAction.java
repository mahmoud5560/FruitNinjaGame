package fruitNinjaPack;

import java.util.ArrayList;

public class SwipeAction implements Subject {

	Player player = Player.getInstance();
	private Objects fruit;
    public SwipeAction(Objects fruit) {
        this.fruit = fruit;
    }
    private ArrayList<Observer> list = new ArrayList<Observer>(); 


    @Override
    public void register(Observer o) {
        list.add(o);
    }

    @Override
    public void unregister(Observer o) {
        list.remove(o);
    }
    @Override
    public void notifyObservers(int counter) {
      for(Observer observer : list){
          observer.update(counter);
      }
    }
    public void increase(){
       player.setScore(player.getScore()+fruit.getScore());
        notifyObservers(player.getScore());
    }
    
}

