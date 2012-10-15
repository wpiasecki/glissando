
/*  w - semibreve - whole duration 
    h - mínima - half duration
    q - semínima - quarter duration
    i - colcheia - eighth duration
    s - semicolcheia - sixteenth duration
    t - fusa - thirty-second duration
    x - semifusa - sixty-fourth duration
    n - quartifusa - 1/128th duration
  R|r - pausa
  
  Grave 40
  Largo 45
  Larghetto 50
  Lento 55
  Adagio 60
  Adagietto 65
  Andante 70
  Andantino 80
  Moderato 95
  Allegretto 110
  Allegro (default) 120
  Vivace 145
  Presto 180
  Pretissimo 220

*/


tempo = Andante


/*
 * Movimento 1
 */
def mov1 = [:]

mov1.Intro = """
  | | | | | | | | | | | | | | | |
"""

mov1.A = """
    | | ri ri ri a3q | d4h. d4q | d4hi ri rq | 
    rh ri f#4q | b3h. b3q | b3hi ri rq |
    
    rh rq e4q | a3h a4q f#4 | b4q f#4q g4q d5i c#5i |
    b4q g3q a3h | d4q rq rq g3q | g4q f#4q f4q e4q |
    
    d4q c#4h c4q | b3q e4q a3q rq | rq b3h a3i g3i | f#3q g3h g#3q a3w |
    d4h. rq | 
"""
    
mov1.B = """ rh b4q g4q | a4q rq d5i b4i a4i g4i | f#4i. g#4s a#4i b4i e4i f#4s g4s a4i a3i |
    
    d4q rq ri d5i a4i f#4i | d4q rq ri d4i b3i g3i | d4q c#4q b3q e4q |
    a3q rq rh | rw | rw | 
    
    a4i e4i c#4i a3i rq | ri a4i f#4i d4i a4q g4i g4i | f#4q a4q rh | d4q e4q c#4q d4i e4i |
    f#4i g4i f#4i e4i f#4q e4i d4i | a4q b4i ri rh | 
"""
    
mov1.C = """ ri d5i a4i f#4i d4q rq |
    
    ri d5i b4i c#5i d5q rq | d5i c#5i b4i a4i g4i f#4i e4q | d4q rq rq ri a3i |
    d4i b3i c#4i ri rq ri a3i | d4i b3i c#4i ri rh | rq ri f#4i b4i g#4i a#4i f#4i |
    
    b4q rq rq ri a4i | d5i b4i c#5i ri rq ri c#4i | f#4i d4i g4i e4i a4i f#4i b4i g4i | 
    c#5q d5q b4h | e4q a3q d4h | b3q e4q a3q d4i ri |
    
    b4q g4q a4q e4q | g4q e4q a4h | d4q. ri d5q d5q | 
"""
    
mov1.D = """ g4q. g4i g4q g4q | g4h. f4q | f4h f4q f4q |
    
    d4h a3q rq | rh rq a4q | d#4h d#4q e4q | 
    c#4q. c#4i c#4q d4q | e4q rq rq ri e4i | e4q. e4i e4i ri ri e4i |
    
    e4q. e4i e4i ri e4q | e4q. e4i a3q ri a4i | a4q. a4i a4i ri ri a4i |
    a4q. a4i a4i ri a4q | d4q. d4i d#4q e4q | a3h a4h |
    
    a3q. ri rh | 
"""
    
mov1.E = """ rh c5q c5q | b4q. b4i b4q b4q | e4q rq rq g4q | 
    g4h. f#4q | f4h f4q e4q | eb4h eb4q d4q | c#4h d4q rq | rw |
    
    rw | rw | rq a4h a4q | d#4h d#4q e4q | 
    e#4h e#4q f#4q | a3q. a4i f4q d4q | a4q ri d4i a4q rq |
    
    rq ri c5i bb4i a4i g4i f4i | f4q g4q a4q b4q | a4q a3q rh |
    ri f4i f4i eb4i d4q rq | eb4i eb4i d4i c4q rq | rq g4h e4q | f4q. e4i d4h |
    
    d4h d4h | d4h e4h | f#4h g#4q g#4q | 
"""

mov1.F = """ a4q a3q rh | rh rq a4q | c#5q d5q e5q b4q | c#5q d5q e5q ri d5i
    
    d4q. d4i d4i ri ri d4i | d4q. d4i d4i ri rq | rq g4q e5q b4i g4i |
    f4q e4q d4q c#4q | d4h d4q rq | rh rq f#4q | f4q e4q a4q rq | rh rq b4q |
    
    b4q. f#4i b4q rq | rh rq b4q | a4q g4q d5q rq | rw |
    d5q b4q f#4q d4q | d5h. rq | rh g4q a4q | 
"""
    
mov1.G = """ f#4q ri d4i e4i d4i d4i c#4i |

    d4q rq g4q a4q | f#4q ri f#4i g4i f#4i f#4i e4i | f#4q rq b3q c#4q |
    a#3q ri a#4i b4i a4i a4i g#4i | a4q rq ri b3s b3s b4i a4i | rh a4q b4q |
    
    g4q rq c4q d4q | b3q rq ri g4i d5i b4i | g4q rq ri g4i c5i a4i |
    b4q rq rh | ri d5i g4i b4i e4i g4i a4i. a4s | d4q rq rh |
    
    ri a4i d4i f#4i b3i d4i e4i. e4s | 
"""

mov1.H = """ a3i ri rq rh | ri b4s a4s g4s f#4s e4s g4s a4s b4s a4s g4s f#4s e4s d4s f#4s |
    g4s a4s b4s a4s g4i f#4i e4q a4q | rq ri a4i b4q. b4i | e4q a4q rh |
    
    rh ri d5s c#5s b4s a4s g4s b4s | c#5s d5s e5i rq ri b4s a4s g#4s f#4s e4s g4s | a4i ri rq g4q a4q |
    f#4q g4q a4q b4q | c5q. g4i c5q. g4i | 
    
    c5q. f4i c5q. f4i | c5q rq f4q d4q | g3h a3q rq |
    b4q g4q a4i g4i f#4i e4i | d4q d4q d5i c#5i b4q | b4q a4i g4i f#4i. g#4s a#4i b4i |
    
    g4s e4s f#4s g4s a4i a3i d4q rq | rh rq a4q | d4q. d4i d4q rq | 
    rh rq b4q | e4q. e4i e4q rq | rw | rw | 
    
    rh a4h | d4h. d4q | d4h rh | | | | 
"""

mov1.K = """ 
    | | | | | rh rq d4q | 
    d4q. f4i e4q c5i b4i | a4i g#4i a4q b4q e4i f#4i | g4i a4i g4i f#4i g4q e4i f#4i | g4i f#4i e4i g4i a4q g4i a4i |
    
    bb4i a4i bb4i g4i f4i a4i a3q | a3q a3q a3h | a3h a3h |
    a3q f4h g4q | e4q c#5h d5q | a4q a4h a4q |
    
    a4q a3q d4q f#4q | a4q f#4h g4q | e4q a4h a4q |
    f#4q a4h a4q a4q | a4h f4q f4q. f4i c5q d4q | d4q. d4i a4q rq |
    
    rh rq a3q | d4q c5h a4q | a4q d4q g4q g#4q |
    a4h a3q a3q | d4q rq ri d4i d4i d4i | d4q rq ri a4i a4i d5i |
    
    d5q. rq ri d4i d4i d4i | d4q ri d5i a4q. d5i | a4h a4i ri rq |
    rq ri a4i a4q. a4i | d4i ri ri a4i a4q. a4i | d4i ri ri d4i d4h | d4h. d4q | d4q ri rh |
    
"""

play mov1 to A
play mov1 from 100 to 101
play mov1 to 20
play mov1 from F to G

//play mov1[ 193..-1 ]
//saveMidi mov1, "baixo_coro2_mov1.mid"


/*
 * Movimento 2
 */
mov2 = [:]

/* tom de sol [G] */
mov2.Intro = """
  | | | | | | | |
"""

mov2.A = """
    rq b4h | a4q rq rq | rh rq | b4q a4q d5i d4i | g4q rq rq |
    
    rh rq | rq e4q. e4i | g4i e4i b4i b4i c5i b4i | a4q e4q rq | rh rq |
    d4i a3i a4i a4i g4i f#4i | e4q b4q rq | e4i e4i f#4q g4q | g4q rq rq |
"""

mov2.B = """
  ri b4i c4q d4q | e4h b4q | d4i f#4i g4i a4i b4i g4i | f#4q a4h | d4q rq rq |
  rh. | rh. | rh. | g4q b3q d4q | f#4q a3q c4q |
  
  e4h e4q | a3h. | d4q d5i c#5i b4i a4i | g4q a4q a3q | f#4q e4q a3q |
  f#4q e4q a3q | d4q rq rq | rh. | 
"""

mov2.C = """
  rh. | rh. | rh. | rh. |
  
  rh. | rh. | rh. | rh. | rh. | rh. | 
  rq rq b4i g4i | e4i c#4i f#4i g#4i a#4i | b4q rq a3i c#4i | d4i f#4i g4i e4i f#4q | 
"""

mov2.D = """
  b3q rq rq | 
  
  rh. | rh. | rh. | rh. | c5q a4q f#4q | eb4q d4q rq |
  rh. | rq a4q f#4q | d#4q c5q a4q | g4q g4q rq | rh. | rh. | rh. |
  
  ri b3i c#4i d#4i e4i f#4i | g4h. | g3h g#3q | f3h. | b3q rq rq | rq f#4h |
  d4q rq c5q | c5q a4q rq | f#4q e4q a3q | d4q rq | c5q a4q rq | rh. |
  
  g4i. b4s c5q d5i c5i | b4i g4i c5q rq | b4i a4i g4i e4i a4q | rq g4q c4q | d4h d4q | 
"""

mov2.E = """
  g3q rq rq |
  ri g4i a4q b4q | c5q. a4i bb4q | b4i g4i a4q bb4i g4i | d4q rq rq | ri g4i f4q d4q |
  
  eb4q c4q bb4q | a4i f4i g4i eb4i c5q | c5i ab4i bb4i g4i eb5q | eb5i d5i c5q c#5q | d5q rq rh |
  | | | | 
  
  | | | |
  rq d5i c5i bb4q. a4i | g4q. g#4i a4i ri rq | rq bb4i a4i g4q. f4i | g4q. g#4i a4i rs rq |
  
  rh d4i e4i f#4i g#4i | a#4i f#4i b4i b3i g4i e4i a4q |
"""

mov2.F = """
  d4q rq d4q e4i. e4s | f#4h e4q d4q |
  a3q a4i a4i a4q d4i f#4i | a4q f#4q e4q rq | rw | rw |
  
  d4q e4i. e4s f#4q g4i. g4s | a4q b4i. b4s c#5q d5q | d5q. d5i d5q c#5q | b4q a4q a4q g4q |
  f#4q b4i b4i f#4q b4i b4i | f#4q b4q rh | c#4q f#4i f#4i c#4q f#4i f#4i c#4q f#4q rh |
  
  | | | |
  | | | |
   
  | | | |
  rh a4q b4i. b4s | c5q d#5i. d#5s e5q rq | rw |
  
  d5i c#5i b4i a4i g4i f#4i e4i a4i | d5q b4i g4i d5q b4i g4i | d5h d5q d5q | d5w |
"""

/* em 12 por 8 */
mov2.G = """
  d4q rq rh | | | |
  
  rh* rq* g4q* g4i* | a4q.* b4q* b4i* c5q.* c#5q.* | d5i* c#5i* b4i* a4i* f#4i* d4i* e4q.* f#4q.* |
  g#4q.* a4q.* f#4q* d4i* e4q* c4i* | b3i* c#4i* d#4i* e4i* f#4i* g4i* a4q.* f#4q* d4i* | b4q.* g4q* g#4i* a4q.* a3q.* |
  
  d4q* ri* rq.* rh.* | | |
  rh.* rq.* d5q.* | bb4q.* ab4q.* g4q.* f4q.* | e4h.* d#4h.* |
  
  c#4h.* b3q* ri* rq* ri* | | | 
  | rh.* rq* ri* g4i* a4i* b4i* | c5q.* b4q* ri* rq* ri* g4i* f#4i* g4i* |
  
  e4i* d4i* c#4i* g4i* a4i* b4i* c5q.* b4i* a4i* g4i* | a4h.* d4q* ri* d4i* e4i* f#4i* | g4q.* f#4q* ri* rq.* d4i* e4i* f#4i* |
  a4q* c4i* d4q* f#4i* a4q* g4i* f#4q* d4i* | e4q* c5i* a4q.* g4q* ri* rq.* | rw.* |
  
  | rq.* g4q* g4i* a4q.* b4q* b4i* | c#5q.* d5q* d4i* g4h.* |
  g4q* ri* rh.* | | |
  
  | | | |
  | | | | |
"""

//play mov2.G
//saveMidi mov2, "baixo_coro2_mov2.mid"



/*
 * Movimento 3
 */
mov3 = [:]

mov3.A = """ |
  | | | 
  | | | |
  | | | | |
  | rh rq c#4q | c4h c4q rq | rh rq c#4q |
  
  c4h. c4q | c4q rq rh | e4q e4h e4q |
  e4h- e4-i ri rq | e4q e4h a4q | a4h- a4-i ri a4q |
  
  f#4q g4q f#4q | d4q f#4q rq | ri d5i d5q d4q | ri d5i d5q d4q | b4q f#4q a4q |
  e4q g4q d4i a4i | d5i d4i e4q. b4i | a4q rq rq | rq rq ri a4i | f#4q c#4q e4q |
  
  b3q d4q a3q- | a3-i a4i b4q. b3i | e4q rq rq | rh. | rq g4q g4q |
  g4q. g4i f#4q- | f#4-i f#4i b3q. b3i | e4h e4q | 
"""

mov3.B = """ 
  a3q rq a4q | a4q a4q a4q |
  
  a4q a3q rq | a4q a4q a4q | a4h f#4q | f#4q rq rq |
  rh. | rh. | c4q e4q g4q | d4q f4q rq | bb4q. bb4i a4q- |
  
  a4-i a4i d4h | rq rq f4q- | f4-i f4i e4q. e4i | d4q d5q b4q |
  a4h f#4q | 
"""

mov3.C = """
  c#4q rq rq | rq c#5h- | c#5-i ri a4h- | a4-q rq a4q |
  
  f#4q f#4q f#4q | a4q a4q rq | f#4q f#4q f#4q |
  a4q a4q rq | ri d5i d5q d4q | ri b4i b4q b3q |
  
  rq rq c#5q- | c#5-i c#5i a4q f#4q | c#5q rq c#5q- |
  c#5-q a4h | b#3h b#3q | c#4q rq c#4q d#4q | e#4q g4q b4q c#5i c#5i | d5q b4q d5q b4i b4i |
  
  d5q b4i b4i a#4q b4i b4i | c#5q f#4q rh | rq g4q e4q rq | rq c#5q b4q f#4q | b3q d#4q f#4q g4q |
  a4h rq c5q | a4q c5q b4q d#5q | e5q b4q g#4q e4q | b4h a4h |
  
  rh a3q b3q | c#4q e4q g4q a4i a4i | bb4q g4q bb4q g4i g4i | b4q g4i g4i b4q g#4i g#4i |
  a4q a3q c5q a4q | c#5q a4q c#5q a#4q | b4q b4q d#5q b#4q b#4q | c#5h b4q b4q |
  
  e#4h a4q f#4q | c#5h c#4h | f#4h- f#4-i ri rq |
"""

mov3.D = """
  | 
  | | | |
  | | |
  
  | | | | | | |
  | | b4q g4i a4i b4q c5q | g4q f#4q d4q a#4q | b4q c5q b4i a4i g4i f#4i |
  
  e4q a4q d4q d5q | b4q e4q a4i ri a4q | d5w- | d5-h. f#4q |
  d4q a4q f#4q d5q | c#5q. a4i a4q a4q- | a4-q a4q e5h- | e5-w |
  
  e5q rq rh | rw |
"""

mov3.E = """ 
  | 
  rh rq ri a4s a4s | b4i b4i ri b4s b4s c#5i c#5i ri c#5s c#5s |
  
  d5i c#5i b4q a4q ri a4s a4s | d5i d4i ri d4s d4s g4i g4i ri g4s g4s |
  f#4i f#4i rq rh | | | 
  
  rh rq ri d4i | d5q- d5-s c#5s a4s b4s c5q- c5-s b4s g#4s a4s | b4i a4i g#4i a4i b4i b#4i c#5q |
  d5s c#5s b4s a4s g#4i a4i b4i b#4i c#5i c#4i | f#4q rq rq d4q | d5q c#5q b4q b4q | a4q. a4i a4q rq | rq a4q b4q c5q |
  
  f4h e4h | a3q a4q d5h- | d5-h. d4q | rq ri d4i g4i a4s g4s d4i e4s f#4s |
  g4i a4s g4s d4i e4s f#4s g4i d4i ri d4i | b4i c#5s b4s a4i a4i d5i e5s d5s c#5i b4i | 
      a4s b4s a4s g#4s a4s g#4s f#4s e#4s f#4s g#4s f#4s e#4s f#4s e4s d4s c#4s |
  
  d4i b3i c#4i a4i e4i ri e4i | a4i b4s a4s e4i f#4s g4s a4i b4s a4s e4i f#4s g4s | 
      a4i e4i ri e4i f#4i g#4i a#4i c#5i- | c#5-i b4i g4i e4i a4q. a4i |
  d4q rq rh | | | |
  
  rq ri b4i- b4-i a4i f#4i d4i | g4q. g4ii f#4i d#4i b3i | e4q. d4i g4q. f#4i |
  b4q bb4q a4i a4i rq | 
"""

mov3.F = """
  rh rq a4q | d5h. f#4q |
  
  d4q a4q f#4q d5q | b4q. b3i b3q rq |
  rh rq a4q | g4hi ri c5q |
  
  g4w- | g4-i ri c#4q c#4i c#4i  d4i e4i |
  f#4i g4i e4i d4i e4i f#4i g4i a4i | f#4i g4i a4i b4i c5i d5i b4i a4i | g4i f#4i e4i d4i c4i d4i b3i a3i |
  
  g3q g3q g3q rq | | | 
  | | |
  
  | g4i bb4i c5i bb4i a4i c5i d5i c5i | bb4i rq rh |
  | c5q a4q f4q d4q | bb4q g4q a4h |
  
  d4q rq rq eb4q | eb5q c5q ab4q rq | rh rq a4q |
"""

mov3.G = """
  c#4q d4q a4q ri c5i | b4q e4q a4q ri a4i | e4q a4q d4q ri g#4i |
  
  a4i g4i f#4q g4i f4i e4q | d4q g#4q a4q a4q | a4h. a4q |
  a4h. a4q | a4h. a4q | a4q a4q a4q. a4i |
"""

mov3.H = """
  b4q ri b4s b4s d5i d4i ri d5s d5s | g#4i g#4i ri g#4i a4i b4i c5i a4s a4s |
  b4i b4i ri b4s b4s c5i c5i ri c5s c5s | d5i d4i ri d4s d4s e4i e4i ri e4s e4s |
  
  f#4i f#4i ri f#4s f#4s g4i. f#4s g4s a4s g4s f#4s | e4i a4s g4s a4s b4s a4s g4s f#4i a4i g4i f#4i |
  e4q a4q d4q b3q | e4i f#4i g4i a4i b4i g#4i a4i a4i- |
  
  a4-i g#4i ri a4q a#4i ri b4i- | b4-i b#4i ri c#5q a4i ri d5i- |
  d5-i a4i ri d5q a4i ri d4s d4s | e4i e4i ri e4s e4s f#4i f#4i ri f#4s f#4s |
  
  g4i f#4i e4i g4i a4i g4i f#4i a4i | b4i a4i g4i b4i e5h |
  a4q rq rh | rq b4q a4q a4q | rq g#4q a4q a4q |
  
  rq e4q f#4q g#4q | a4q b4q c5q b4q | a4h a3h | d4q d4q d4q d4q |
  d4q d4q d4q d4q | d4q c5i c5i b4q g4q | d4w | d4q rq rh |
  
"""

//play mov3.from(159)
//saveMidi mov3, "baixo_coro2_mov3.mid"

//play [mov1.join(), mov2.join(), mov3.join()]

//play mov3, from: 159, to: 162
//play mov3

play mov3 from 159 to 162

play mov3 to 17


