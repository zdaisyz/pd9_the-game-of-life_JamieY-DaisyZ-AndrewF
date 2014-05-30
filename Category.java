/**********
 * Andrew Fan: This is Category.java, the class containing the basic data for Categories.
 * This class uses an ArrayList to store values because it's less mind boggling than a LinkedList, which is more efficient but harder to comprehend becaue there would be a Circularly Linked List of Linked Lists.
 *********/
import java.util.ArrayList;

public class Category{
    private ArrayList<String> data;
    private String name;

    public Category(){//Avoid
	data = new ArrayList<String>();
	name = "";
    }

    public Category(String name){//good constructor
	data = new ArrayList<String>();
	this.name = name;
    }

    public void add(String s){
	data.add(s);
    }

    public String remove(int index){
	String retval = data.remove(index);
	return retval;
    }

    public String get(int index){
	return data.get(index);
    }

    public String getName(){
	return name;
    }

    public String peekFirst(){
	return data.peekFirst();
    }

    public boolean isEmpty(){//This has its uses
	return data.isEmpty();
    }

    public int getSize(){
	return data.size();
    }

    //Add other required methods here. As long as it works with the project, it is fine.

    public String toString(){
	return data.toString();
    }

}