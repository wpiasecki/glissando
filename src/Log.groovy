

/**
 * Home brewed log. Not very pro. But so far it doesn't need
 * to do anymore.
 * 
 * @author will
 *
 */
class Log { 
  def debug = false
  def debug(args) { if (debug) println "[DEBUG] $args"; args } 
}
