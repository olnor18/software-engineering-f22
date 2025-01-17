/*
 * generated by Xtext 2.26.0
 */
lexer grammar InternalFactoryLangLexer;

@header {
package xtext.factoryLang.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

GreaterThan : 'greater than';

In_progress : 'in_progress';

LessThan : 'less than';

Scannable : 'scannable';

Undefined : 'undefined';

Complete : 'complete';

Position : 'position';

Variable : 'variable';

Minutes : 'minutes';

Seconds : 'seconds';

Camera : 'camera';

Create : 'create';

Device : 'device';

Minute : 'minute';

Pickup : 'pickup';

Second : 'second';

Color : 'color';

Crane : 'crane';

Empty : 'empty';

Green : 'green';

Hours : 'hours';

Named : 'named';

Slots : 'slots';

Blue : 'blue';

Disk : 'disk';

Drop : 'drop';

Each : 'each';

Free : 'free';

Full : 'full';

Hour : 'hour';

Into : 'into';

Item : 'item';

Mark : 'mark';

Move : 'move';

Scan : 'scan';

Slot : 'slot';

That : 'that';

Then : 'then';

Wait : 'wait';

With : 'with';

Zone : 'zone';

For : 'for';

New : 'new';

Not : 'not';

Red : 'red';

As : 'as';

At : 'at';

If : 'if';

In : 'in';

Is : 'is';

Of : 'of';

To : 'to';

fragment RULE_BEGIN : ;

fragment RULE_END : ;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
