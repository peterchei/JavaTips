package Collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Set;



public class FindDups {

	public static void main(String[] args) {
		
		//String array with duplicated values
		String[] data = new String[] { "1","2","4", "5", "1"};
		
		// List can have duplicated values
		List<String> dataList = Arrays.asList(data);
		
		// Set contains unique values
		Set<String> distinctData =  dataList.stream().collect(Collectors.toSet());
		
		
		System.out.println(distinctData);
		
		distinctData.stream().parallel().forEach(e -> {
			
		System.out.println(e);
	
		}
				);

	}

}
