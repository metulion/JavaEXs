package application;

import javafx.application.Application;
import java.util.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ALG_EX_01   {

	public static void main(String[] args) {
		int [] tempArray = {5,3,2,1,5,7,3,2,5};
		duplicateValueChecker(tempArray);
	
	
	}

	public static void duplicateValueChecker(int[] tempArray) {
		int counter =0;
		List<Integer> list = new LinkedList<Integer>();
		Set<Integer> resultSet = new HashSet<Integer>();
		for (int i=0 ; i< tempArray.length ; i++) {
			if ( !list.contains(tempArray[i]) ) {
				list.add(tempArray[i]);
			}
			else {
				resultSet.add(tempArray[i]);
			}
		}
	
		if (resultSet.isEmpty()) {
			System.out.println("YOQ");
		}
		else  {
			for (Integer number : resultSet) {
				counter = counter +1;
				System.out.print(number);
				if (!(counter >= resultSet.size())) {
					System.out.print(",");
				}
				
			}
		}
		
	}
}