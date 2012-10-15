
/**
 * Methods to ease the string manipulation when playing
 * MusicStrings. It will be mixed into the String class.
 *
 * @author will
 *
 */
class StringMixin
{
	String[] getAt( IntRange range )
	{
		split(/\|/)[range]
	}
}
