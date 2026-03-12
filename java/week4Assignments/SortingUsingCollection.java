package week4Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class SortingUsingCollection {

	public static void main(String[] args) 
	{

        String[] arr = { "HCL", "Wipro", "Aspire Systems", "CTS" };

        List<String> list = new ArrayList<String>();

        for (String chars : arr) {
            list.add(chars);
        }

        Collections.sort(list);

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i));
            if (i != 0) {
                System.out.print(", ");
            }
        }
}

}
