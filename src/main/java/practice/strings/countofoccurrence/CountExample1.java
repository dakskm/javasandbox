package practice.strings.countofoccurrence;

/*
How to count occurrence of a given character in String? (solution)

If interviewer ask you to count occurrence of more than one character than you can either use an array,
hash table or any additional data structure. In order to solve this problem, you are not allowed to do so.
Your method must return count of given character, for example if input String is "Java" and given character is 'a'
then it should return 2. Bonus point if you handle case, null and empty String and come up with unit tests.
 */

public class CountExample1 {
    public static void main(String args[]) {
        System.out.println(countOfOccurrence("Dakshinamurthy", 'a'));
    }

    static int countOfOccurrence(String s, char c){
        int count = 0;

        for(int i = 0; i< s.length();i++)
            if(s.charAt(i) == c)
                count++;

        return count;
    }
}
