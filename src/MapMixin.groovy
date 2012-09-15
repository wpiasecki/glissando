
/**
 * Methods to ease the map/string manipulation when playing
 * the map with MusicStrings. It will be mixed into the Map class.
 * 
 * @author will
 *
 */
class MapMixin 
{
	Log log
	
  def join() 
	{ 
		collect { Map.Entry it -> it.value }.join(" ") 
	}
	
  
  def getAt( IntRange range )
	{ 
    log.debug "playing from ${range.first()} to ${range.last()}"
    log.debug "${join().split(/\|/)[range]}"
    join().split(/\|/)[range] 
  }
	
  
  def getAt( Integer measure )
	{ 
    log.debug "getAt int ${join().split(/\|/)[measure] }"
    join().split(/\|/)[measure] 
  }
	
  
  def getAt( List list )
	{ 
    log.debug "getAt list $list"
    findAll { key, value -> key in list }
  }
  
}