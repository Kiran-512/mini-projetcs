import java.util.*;

class DictionaryApp{
	
	//driver method
    public static void main(String args[]){
		
        System.out.println("\n <=*=*=*=*=*=*= My Personal Dictiory =*=*=*=*=*=*=>\n");
        int choice=-1;
				
        DictionaryWork dictionary =new DictionaryWork();

        do {
            System.out.println("*--------------------------------------*\n*  Please enter the choice:            *\n*  1.View all Dictionary               *\n*  2.Insert new word                   *\n*  3.Search word                       *\n*  4.Delete the word                   *\n*  5.Total words in the dictionary     *\n*  0.To exit the app                   *\n*--------------------------------------*");
           
            try {
				//scanner class object
				Scanner sc=new Scanner(System.in);
                choice = sc.nextInt();//throw Inputmismatch
				
                switch (choice) {
                    case 1:
						dictionary.display();
                        break;
						
                    case 2: 
						System.out.println("Please enter the word to add in the dictionary:");
                        String word=sc.next();
						word=word.toLowerCase();
                        System.out.println("Please enter the meaning for above word:");
                        String meaning = sc.next();
                        dictionary.insertWord(word,meaning);
                        break;
                    case 3:
                        System.out.println("Please enter the word to search in dictionary:");
                        String key=sc.next();
                        boolean res = dictionary.searchWord(key);
                        if(res==false){
							System.out.println("\n *=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");
							System.out.println(" Sorry! You haven't added this word, \n Please add this word by using insert a word option ");
							System.out.println("\n *=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
						}
						break;
						
                    case 4:
                        System.out.println("Please enter the word to delete from dictionary:");
                        String del = sc.next();
                        dictionary.deleteWord(del);
                        break;
						
                    case 5: 
                        dictionary.wordcount();
                        break;
						
                    case 0:
                        break;
                
                    default:
                        System.out.println("Invalid Input");
                        break;
                }  
			} catch(Exception e) {
                System.out.println("Invalid Input!");	
				}				
        } while (choice!=0);
		
		System.out.println("Thank you! Do visit again!");
				
    }
}