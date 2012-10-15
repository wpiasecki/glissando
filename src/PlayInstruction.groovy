
/**
 * Class representation of a command originated from the script.
 * It will run the 'play' method from the org.jfugue.Player passing
 * a score from the 'from' start point to the 'to' end point.
 * 
 * @author will
 *
 */
@groovy.transform.ToString
class PlayInstruction extends Instruction 
{
  Map score
  def from = 0
  def to = -1
  String command = 'play'
}
