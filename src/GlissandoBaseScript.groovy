import groovy.lang.Script;


/**
 * The basic methods that the music script can use.
 * 
 * Each method creates a new Instruction object, which will
 * be executed upon finishing the script execution. 
 * 
 * The 'instructions' and 'log' variable are available in the
 * binding, and so will be here.
 * 
 * @author will
 *
 */
abstract class GlissandoBaseScript extends Script
{
	def play( String score ) 
	{
		instructions << new PlayInstruction( score: score )
	}
	
	
	/**
	 * Play a map object. Each key in the map will be used as a music 
	 * piece.
	 * 
	 * @param scoreMap
	 * @return a map containing two closures which can be used as
	 * operation on top of the Instruction created: it can either set
	 * a starting measure, a starting measure AND a finishing measure,
	 * OR a finishing measure.
	 */
	def play( Map scoreMap )
	{
		log.debug "gfugue player.play map: $scoreMap"
		
		def instruction = new PlayInstruction( score: scoreMap.join() )
		
		log.debug "scoreMap.join: ${scoreMap.join()}"
		
		instructions << instruction
		
		log.debug "base script.play instructions: $instructions"
		
		def to = { Integer end -> instruction.to = end }
		def from = { Integer start -> instruction.from = start; [to: to] }
		
		[from: from, to: to]
	}
	
	
	/**
	 * Joins a list with spaces and play
	 * 
	 * @param list a collection of musicStrings
	 * @return the PlayInstruction object, but you shouldn't use it
	 * for anything
	 */
	def play( List list ) 
	{
		play list.join(" ")
	}
	
	
	/**
	 * Joins every entry in the map into a single MusicString and
	 * writes it in a file
	 * 
	 * @param map song
	 * @param fileName 
	 * @return the instruction object. But you shouldn't use it for 
	 * anything.
	 */
	def saveMidi( Map map, String fileName ) 
	{
		instructions << new Instruction(command: 'saveMidi', args:[map.join(), new File(fileName) ])
	}
	
	
	/**
	 * Every missing method will be saved into a instruction and will
	 * be ran against a org.jfugue.Player object.
	 * 
	 * @param method the method from the Player class which will be invoked
	 * @param args the arguments for the method
	 * @return the instruction object. But you shouldn't use it for 
	 * anything.
	 */
	def methodMissing( String method, args ) 
	{
		instructions << new Instruction(command: method, args: args)
	}
	
	
	/**
	 * Every non-existant property resolves as String 
	 * @param prop the property
	 * @return the properties' name
	 */
	def propertyMissing(String prop) { prop }
	
}