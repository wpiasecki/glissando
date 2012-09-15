
/**
 * Class representation of a command originated from the script.
 * It basically will be used agains the org.jfugue.Player object.
 * 
 * Kudos to this guy: 
 * http://www.canoo.com/blog/2011/12/08/the-art-of-groovy-command-expressions-in-dsls/
 * For the idea of Instruction objects
 * 
 * @author will
 *
 */
@groovy.transform.ToString
class Instruction 
{
	String command
	def args
}