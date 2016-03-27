grammar Hello;
hello : 'automaton' Name '{' (state | transition)* '}' ;

state : 'state' Name (('<<' 'initial' '>>' ) | ('<<' 'final' '>>' ))* 
  ( ('{' (state | transition)* '}') | ';') ;

transition : Name '-' Name '>' Name ';' ;

Name : ([a-z] | [A-Z] | '_' | '$')([a-z] | [A-Z] | '_' | '$' | [0-9])*;