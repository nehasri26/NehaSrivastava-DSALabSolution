package driver;
import java.util.ArrayList;
import service.FindLongetPath;
import service.Node;

public class MainClassTree {

	public static void main(String[] args) {
		//Tree creation
		Node root = new Node(100);
		root.left =  new Node(20);
		root.right =  new Node(130);
		root.left.left =  new Node(10);
		root.left.right =  new Node(50);
		root.left.left.left=  new Node(5);
		root.right.left =  new Node(110);
		root.right.right =  new Node(140);
		
		ArrayList<Integer> outputArr = new ArrayList<>();
		outputArr = FindLongetPath.longestPath(root);
		
	    int arrSize = outputArr.size();
	     
	    System.out.print(outputArr.get(arrSize - 1));
	    for(int i = arrSize - 2; i >= 0; i--)	    
	    {
	        System.out.print("->" + outputArr.get(i));
	    }
	}

}
