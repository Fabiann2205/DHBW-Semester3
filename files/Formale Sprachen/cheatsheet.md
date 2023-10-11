# Cheatsheet Formale Sprachen

## Grammatik

- Die Abfolge von Substitutionen, um eine Zeichenkette zu erhalten, wird als Ableitung bezeichnet.
- V = 𝑁 ∪ 𝑇: Eine Grammatik ist ein 4-Tupel (N, T, S, P) mit
    - einer Menge von Nichtterminalsymbolen N, (Die Sachen, die vereinfacht werden: z. B. <Verb> → "singen" (<Verb> ist
      hier das Terminal) oder <Wort> → <Verb> | <Subjekt> (hier sind alle Elemente Nichtterminalsymbole))
    - einer Menge von Terminalsymbolen T, das zu N disjunkt ist, (Grundsachen, die nicht weiter vereinfacht werden, z.
      B. <Verb> → "singen" (singen ist hier das Terminal))
    - einem ausgezeichnetes Startsymbol 𝑆 ∈ 𝑁 (eines der Produktionen)
    - und einer endlichen Menge 𝑃 ⊂ 𝑉∗𝑁𝑉∗×𝑉∗ sogenannter Produktionen. (Form: <...> -> <...> <...> (also
      Definitionen))
    - Eine Sprache (für die es eine Grammatik gibt) ist eine Menge an Wörtern.
      (- eine Sprache besteht aus Buchstaben, daraus werden Wörter gebildet, welche wiederum das Vokabular bilden)
        - siehe Skript
- weitere wichtige Begriffe:
    - concatenation: Aneinanderhängen zweier Strings (∘), dabei werden beide Strings in ihre einzelnen Symbole
      aufgeteilt und diese ganzen Symbole wieder als String gespeichert
    - substring: Ein String, der aus einem Teil der Symbole eines anderen Strings besteht, ist ein Substring
        - atom = symbol: Ist der kleinste Substring einer Menge von Substrings von einem String, der nicht mehr in
          Substrings aufgeteilt werden kann → genauer definiert in alphabet
    - alphabet: bezeichnet man als Sigma, besteht aus allen atom's. BSP: B=[0,1] oder C=[a,b,c] oder D=[bc,a,f] → hier
      ist bc auch ein atom, weil es so definiert wurde (manchmal sind space und comma im alphabet, manchmal werden diese
      aber auch als meta symbole verwendet)
    - formal language: eine Sprache L im Alphabet Sigma ist ein Satz an Strings in Sigma.
    - 