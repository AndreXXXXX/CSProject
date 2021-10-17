import java.util.Scanner;
import java.util.ArrayList;
public class Driver {
	
	public static void main(String[]args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		// creates an arraylist that will be used to hold colleges later
		
	String[]arr = { "Harvard","Stanford", "MIT","Caltech","Columbia","Princeton","Yale","Georgia Tech","Virginia Tech",
			"UIUC","UCSD","UCLA","UCI","UC Berkeley",
		         "Purdue","University of Michigan","University of Chicago","Dartmouth","Brown","UPenn","Cornell","UCSB",
		         "UCR","UC Merced","UC Davis","UCSC","Harvey Mudd",
		         "Pomona","Texas A&M","Tulane","Brandeis","Boston University",
		         "Johns Hopkins","NYU","Northwestern","Northeastern","Duke","Vanderbilt","Rice" };

	// a list of all colleges
	
	int[]test = {35,35,36,36,35,35,34,33,31,32,33,35,29,33,31,33,34,
			34,34,34,34,30,27,22,28,29,34,33,29,32,32,32,34,32,34,33,34,34,34

	// a list of all corresponding ACT scores
			
	};
	
		Scanner ss = new Scanner(System.in);
        System.out.println("Enter your ACT score here");
        System.out.println("=========================");
        int score = ss.nextInt();
        
        //reads what the user inputs

        if ( score == 36 ) {
            for ( int i = 0; i < test.length; i++ ) { // traverses the list of all ACT scores
            	if ( test[i] == 36  ) { // finds the index where it is equal to 36
            		list.add(arr[i]); /* finds corresponding index in the school array
            		                     and adds it to the arraylist */ 
            	}
            }
            System.out.println("========================================");
            System.out.println("Colleges with an average ACT score of 36:");
            System.out.println(list); // prints out the arraylist
        }
        
        if ( score == 35 ) {
        	for ( int i = 0; i < test.length; i++ ) {
            	if ( test[i] == 35 ) {
            		list.add(arr[i]);
            	}
            }
        	System.out.println("========================================");
        	System.out.println("Colleges with an average ACT score of 35:");
            System.out.println(list);
        }
        
        if ( score == 34 ) {
        	for ( int i = 0; i < test.length; i++ ) {
            	if ( test[i] == 34 ) {
            		list.add(arr[i]);
            	}
            }
        	System.out.println("========================================");
        	System.out.println("Colleges with an average ACT score of 34:");
            System.out.println(list);
        }
        if ( score >= 32 && score <= 33 ) {
        	for ( int i = 0; i < test.length; i++ ) {
            	if ( test[i] >= 32 && test[i] <= 33 ) {
            		list.add(arr[i]);
            	}
            }
        	System.out.println("====================================================");
        	System.out.println("Colleges with an average ACT score between 32 and 33:");
            System.out.println(list);
        }
        
        if ( score >= 25 && score < 32 ) {
        	for ( int i = 0; i < test.length; i++ ) {
            	if ( test[i] >= 25 && test[i] < 32 ) {
            		list.add(arr[i]);
            	}
            }
        	System.out.println("====================================================");
        	System.out.println("Colleges with an average ACT score between 25 and 31:");
            System.out.println(list);
        }
        
        if ( score < 25 && score > 0 ) {
        	for ( int i = 0; i < test.length; i++ ) {
            	if ( test[i] < 25 ) {
            		list.add(arr[i]);
            	}
            }
        	System.out.println("===================================================");
        	System.out.println("Colleges with an average ACT score of less than 25:");
            System.out.println(list);
        }
        
        if ( score > 36 || score < 1 ) {
        	System.out.println("==========================");
        	System.out.println("Please enter a valid score");
        	
        }

	}

}
