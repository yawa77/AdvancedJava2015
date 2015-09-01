/******************************************************
***  Class Name CISK 342 
***  Class Author David Pollard
******************************************************
*** Purpose of the class 
* The class creates a user exception class.    
***
******************************************************
*** Date 2015/08/31
******************************************************
*** List of changes with dates. 
******************************************************
*** Look at this!
*** List all the places in the code where you did something interesting,
*** clever or elegant.  If you did good work in this program and you want
*** me to consider it in your grade, point it out here.
*******************************************************/
public class PollardProject1CISK342Exception extends Exception {

    /**
     * Creates a new instance of <code>PollardProject1CISK342Exception</code>
     * without detail message.
     */
    public PollardProject1CISK342Exception() 
    {
        
        
    }

    /**
     * Constructs an instance of <code>PollardProject1CISK342Exception</code>
     * with the specified detail message.
     *
     * @param msg the detail message.
     */
    public PollardProject1CISK342Exception(String msg) {
        super(msg);
    }
}
