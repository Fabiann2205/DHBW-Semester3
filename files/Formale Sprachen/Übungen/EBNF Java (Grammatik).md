# EBNF Java - Grammatik (11.10.2023)

```
<programm> -> <klasse>+

<klasse> -> "class" <identifier> "{" <deklaration>* "}"

<deklaration> -> <variablendeklaration> | <methodendeklaration> | <schnittstelle>

<variablendeklaration> -> <typ> <identifier> ";"

<typ> -> "int" | "double" | "boolean" | "String" | "char" | "long" | "float" | "void" | <identifier> | <generischer_typ>

<generischer_typ> -> <identifier> "<" <typ> ">"

<methodendeklaration> -> (<annotations>? "public" | "private" | "protected") <typ> <identifier> "(" <parameterliste>? ")" "{" <anweisung>* "}"

<parameterliste> -> <parameter> ("," <parameter>)*

<parameter> -> <typ> <identifier>

<annotations> -> "@" <identifier> ( "(" (<annotation_parameter> ("," <annotation_parameter>)* )? ")" )*

<annotation_parameter> -> <identifier> "=" <konstantenausdruck>

<anweisung> -> <zuweisung> | <bedingung> | <schleife> | <ausgabe> | <rückgabe> | <deklaration> | <switch> | <forschleife> | <do_while> | <try_catch_finally> | <throw> | <synchronized_block> | <lambda> | <throw> | <continue> | <break> | <for_each> | <assert> | <neue_anweisung>

<zuweisung> -> <identifier> "=" <ausdruck> ";"

<bedingung> -> "if" "(" <ausdruck> ")" "{" <anweisung>* "}" ("else" "{" <anweisung>* "}")?

<schleife> -> "while" "(" <ausdruck> ")" "{" <anweisung>* "}"

<ausgabe> -> "System.out.println" "(" <ausdruck> ")" ";"

<rückgabe> -> "return" <ausdruck> ";"

<deklaration> -> <variablendeklaration> | <konstantendeklaration>

<konstantendeklaration> -> "final" <typ> <identifier> "=" <ausdruck> ";"

<switch> -> "switch" "(" <ausdruck> ")" "{" <case>* <default>? "}"

<case> -> "case" <zahl> ":" <anweisung>*

<default> -> "default" ":" <anweisung>*

<forschleife> -> "for" "(" <variablendeklaration> | <zuweisung> | ";" | <ausdruck>? ";" <ausdruck>? ")" "{" <anweisung>* "}"

<do_while> -> "do" "{" <anweisung>* "}" "while" "(" <ausdruck> ")" ";"

<try_catch_finally> -> "try" "{" <anweisung>* "}" ("catch" "(" <typ> <identifier> ")" "{" <anweisung>* "}")? "finally" "{" <anweisung>* "}"

<throw> -> "throw" <ausdruck> ";"

<synchronized_block> -> "synchronized" "(" <ausdruck> ")" "{" <anweisung>* "}"

<lambda> -> <parameterliste> "->" <ausdruck>

<schnittstelle> -> "interface" <identifier> "{" <methodendeklaration>* "}"

<continue> -> "continue" ";"

<break> -> "break" ";"

<for_each> -> "for" "(" <typ> <identifier> ":" <identifier> ")" "{" <anweisung>* "}"

<assert> -> "assert" "(" <ausdruck> ("," <ausdruck>)? ")";"

<neue_anweisung> -> "new" <identifier> "(" <ausdruckliste>? ")" ";"

<ausdruckliste> -> <ausdruck> ("," <ausdruck>)*

<ausdruck> -> <term> (("+" | "-") <term>)*

<term> -> <faktor> (("*" | "/") <faktor>)*

<faktor> -> <identifier> | <zahl> | "(" <ausdruck> ")"

<identifier> -> [a-zA-Z_][a-zA-Z0-9_]*

<zahl> -> [0-9]+

```