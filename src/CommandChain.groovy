
/**
 * Creates objects for the command chains
 * 
 * @author will
 *
 */
class CommandChain 
{
	/**
	 * Creates a play command chain: this method will return an object
	 * which contains the methods that can be invoked when the user has
	 * entered the 'play' method: 'from' or 'to'.
	 * When the user uses the 'to' method, it can't call a 'from' method.
	 * 
	 * @param instruction an instruction object, from where this class needs
	 * to set the user parameters
	 * @return
	 */
	static def playChain(Instruction instruction) 
	{
		new CommandFromTo( instruction:instruction )
	}
}

/**
 * This class responds to the methods "from" and "to" and
 * fills the respectives "from" and "to" fields in a PlayInstruction
 * 
 * @author will
 *
 */
class CommandFromTo
{
	PlayInstruction instruction
	
	CommandTo from(start) {
		instruction.from = start
		new CommandTo( instruction:instruction )
	}
	
	void to(end) { instruction.to = end }
}


/**
 * This class responds to the "to" command. Any other method
 * will fail. 
 * 
 * @author will
 *
 */
class CommandTo 
{
	PlayInstruction instruction
	
	/**
	 * Fill the "to" field in the instruction object with the
	 * user passed argument
	 * 
	 * @param end the endpoint of the play instruction
	 */
	void to(end) { instruction.to = end }
}