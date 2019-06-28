package valid_parenthesis;

public class Checker {

	  
	      
	    /* Returns true if matching */
	    static boolean isMatchingPair(char checker1, char checker2) 
	    { 
	       if (checker1 == '(' && checker2 == ')') 
	         return true; 
	       else if (checker1 == '{' && checker2 == '}') 
	         return true; 
	       else if (checker1 == '[' && checker2 == ']') 
	         return true; 
	       else
	         return false; 
	    } 
	      
	    /* Returns true if the string is properly closed and nested */
	    static boolean areParenthesisProperlyClosed(String lisp) 
	    { 
	    	char[] charArray = lisp.toCharArray();
	       Stack st=new Stack(); 
	       
	       for(int i=0;i<charArray.length;i++) 
	       { 
	            
	          if (charArray[i] == '{' || charArray[i] == '(' || charArray[i] == '[') 
	            st.push(charArray[i]); 
	       
	          if (charArray[i] == '}' || charArray[i] == ')' || charArray[i] == ']') 
	          { 
	                   
	             if (st.isEmpty()) 
	               { 
	                   return false; 
	               }  
	       
	             else if ( !isMatchingPair(st.pop(), charArray[i]) ) 
	               { 
	                   return false; 
	               } 
	          } 
	            
	       } 
	          
	        
	       if (st.isEmpty()) 
	         return true; //balanced
	       else
	         {   //not balanced
	             return false; 
	         }  
	    }  
	      
	    public static void main(String[] args)  
	    { 
	        String textToBeChecked = "{([])}";
	          if (areParenthesisProperlyClosed(textToBeChecked)) 
	            System.out.println("Valid LISP"); 
	          else
	            System.out.println("Invalid LISP");   
	    } 
	  
	} 