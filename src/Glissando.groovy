#!/usr/bin/env groovy

import br.glissando.*
import org.jfugue.*
import org.codehaus.groovy.control.*


/**
 * This script starts the environment (mixin classes, logging, 
 * groovy shell compiler configuration), run a file passed as a
 * parameter and run the Instructions generated from the file
 * 
 * Pass '-d' as a parameter to debug stuff (home-brewed log)
 * 
 * @author will
 *
 */

log = new Log()

Map.mixin MapMixin
Map.metaClass.log = log
String.mixin StringMixin


List<Instruction> instructions = []


/*
 * 'instructions' is being passed in the binding for the Base script use.
 */
def binding = new Binding(instructions: instructions, log: log)


def compilerConfiguration = new CompilerConfiguration(scriptBaseClass: GlissandoBaseScript.class.name)

shell = new GroovyShell(this.class.classLoader, binding, compilerConfiguration)


/*
 * command-line parsing
 */
if (args) 
{
  intersect = ["--debug", '-d', '--d', '-debug'].intersect(args as List)
  if (intersect) { log.debug = true }
  args = args - intersect
  def file = args[0]
  
  script = shell.parse(new File(file))
  println "playing file $file"
  script.run()
}
else
{
  println "no file selected to play"
}


/*
 * instructions interpretation
 * FIXME: player doesn't know how to handle the third playing onward
 */
def player = new Player()

instructions.each { instruction ->

  instruction.with 
  {
    log.debug "glissando instruction: $it"
		
    switch (command) 
    {
      case 'play':
      	
        log.debug 'play'
        
        def splitedScore = score[ from..to ].join(" ")
        
        log.debug "splitedScore: $splitedScore"
        
        def tempo = binding.tempo ? "[$binding.tempo]" : '[Andante]'
        
        player.play "T$tempo $splitedScore"
        
        break
        
      default:
        
        log.debug "default: $command"
        
        player."$command"( *args )
        
        break
    }
  }
}

