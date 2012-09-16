import java.awt.event.*
class Note { def n; boolean s; def p() { new org.jfugue.Player().with {play n;close()}} }
notes=['C','C#','D','D#','E'].inject([]){ l,n -> l<< Note[n:n,s:n=~/#/]}
h=300
l=0
w=60
x=0
new groovy.swing.SwingBuilder().edt {
  frame size:[notes.size()*30+30,h], 
    show:true, 
    defaultCloseOperation:javax.swing.JFrame.EXIT_ON_CLOSE, 
    { l = layeredPane() }
  notes.each { n ->
    C=java.awt.Color
    s=n.s
    p=panel bounds:(s ? [x-15,0,w-30,h-100] : [x,0,w,h]),
      background: s ? C.BLACK : C.WHITE, 
      border: lineBorder(1, color: C.BLACK)
    p.addMouseListener({ if(it.id==MouseEvent.MOUSE_CLICKED)n.p() }as MouseListener)
    if(!s)x+=w
    l.add p,s?0:1
  }
}
