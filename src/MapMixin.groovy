
/**
 * Methods to ease the map/string manipulation when playing
 * the map with MusicStrings. It will be mixed into the Map class.
 * 
 * @author will
 *
 */
class MapMixin 
{
	Log log = new Log()
	
  String join() 
	{ 
		collect { Map.Entry it -> it.value }.join(" ") 
	}
	
  
  String[] getAt( IntRange range )
	{ 
    log.debug "playing from ${range.first()} to ${range.last()}"
    log.debug "${join().split(/\|/)[range]}"
    join().split(/\|/)[range] 
  }
	
  
  String[] getAt( Integer measure )
	{ 
    log.debug "getAt int ${join().split(/\|/)[measure] }"
    join().split(/\|/)[measure] 
  }
	
	
	List<String> collect() 
	{ 
		collect { Map.Entry i -> i.value } 
	}
	
  
  List<String> getAt( List list )
	{ 
    log.debug "getAt list $list"
    findAll { key, value -> key in list }.collect()
  }
  
}
