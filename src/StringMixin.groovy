
/**
 * Methods to ease the string manipulation when playing
 * MusicStrings. It will be mixed into the String class.
 *
 * @author will
 *
 */
class StringMixin
{
	def	getAt( IntRange range )
	{
		split(/\|/)[range]
	}
}
