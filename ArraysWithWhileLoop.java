public class ArraysWithWhileLoop extends WhileAndDoWhile{
static String [] subjects = {"math","computer science","history","geographay"};
static int [] numbers ={3,7,9,4,2};
static char [] alphabets = {'a','c','e'};

    public void printStringArray() {
        //write implementation to print elements of array using while loop
       int i = 0;
        while (i<subjects.length) {
            System.out.println(subjects[i]);
              i++;
        }

        }

//    @Override
   public void printIntegerArray() {
        int i =0;
        while (i<numbers.length) {
            System.out.println(numbers[i]);
                    i++;
        }
   }
//
//    @Override
        public void printCharArray () {
            int i =0;
           while (i<alphabets.length) {
               System.out.println(alphabets[i]);
               i++;

            }

       }

        @Override
        public void searchStringArray(String word){
        int i = 0;
        while (i<subjects.length){
            if (subjects [i]==word ){
                System.out.println("Here I am you found me");
            }
            else {
                System.out.println("you entered wrong input");
            }
            i++;
        }

        }

        @Override
        public void searchIntegerArray (int number){
        int i =0;
        while (i<numbers.length){
            if (numbers [i] ==number){
                System.out.println("Here I am you found me");

            }
            else {
                System.out.println("you entered wrong input");
            }
            i++;
        }

        }

        @Override
        public void searchCharArray (char letter){
            int i =0;
            while (i<subjects.length){
                if (alphabets[i]==letter){
                    System.out.println("Here I am you found me");
                }
                else {
                    System.out.println("you entered wrong input");
                }
                i++;
            }

        }

    /*Write implementation for other 5 methods which you declared
      in abstract class here as well using "WHILE LOOP"

      *** for search methods: if word is not found print message "you entered wrong input"
          and if word is found print message "Here I am you found me"  ****

     */
        public void printVowels (String vowelArray){
            //write code here to print vowel array using While loop

        }


               public static void main (String[]args){
                   ArraysWithWhileLoop arrays = new ArraysWithWhileLoop();
                   arrays.printStringArray();
                   arrays.printIntegerArray();
                   arrays.printCharArray();
                   arrays.searchStringArray("math");
                   arrays.searchIntegerArray(3);
                   arrays.printCharArray();
                   // System.out.println(subjects[0]);
                   //Declare array having vowel elements
                   //call method printVowels(String vowelArray)
                   //call all other methods here
               }

}