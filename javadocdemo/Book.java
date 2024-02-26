/**@author Nitish Dwivedi
 * @version 2.0
 * @since 2024
 **/
package javadocdemo;
/**
 * @author Nitish Dwivedi
 * 
 * Class for Library Book
 */
public class Book 
{
    /**
     * @value 10 default value
     */
    static int val=10;
    /**
     * Parametrized Constructor
     * @param s Book Name
     */
    public Book(String s)
    {}
    /**
     * Issue a Book to a Student
     * @param roll Roll Numbr of a student
     * @throws Exception If Book is not available,throws Exception
     */
    public void issue(int roll)throws Exception
    {}
    /**
     * Check if book is available
     * @param str Book Name
     * @return If book is available returns true else false
     */
    public boolean available(String str)
    {
        return true;
    }
    /**
     * Get Book Name
     * @param id Book Id
     * @return Book
     */
    public String getName(int id)
    {
        return "";
    }
}
