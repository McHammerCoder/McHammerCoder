grammar Hello;
domain : ( subdomain | WS );
subdomain : Label (Dot Label)+;

Dot : '.';
WS : ' ';
Label : ( Let_dig Ldh_string ) | Let_dig;

fragment Letter : [a-z] | [A-Z];
fragment Digit : [0-9];
fragment Let_dig : Letter | Digit;
fragment Let_dig_hyp : Let_dig | '-';
fragment Ldh_string : Let_dig_hyp Ldh_string | Let_dig;
