# Cheatsheet Formale Sprachen

## Grammatik

- Die Abfolge von Substitutionen, um eine Zeichenkette zu erhalten, wird als Ableitung bezeichnet.
-
- V = 𝑁 ∪ 𝑇: Eine Grammatik ist ein 4-Tupel (N, T, S, P) mit
    - einer Menge von Nichtterminalsymbolen N, (Die Sachen, die vereinfacht werden: z. B. <Verb> → "singen" (<Verb> ist
      hier das Terminal) oder <Wort> → <Verb> | <Subjekt> (hier sind alle Elemente Nichtterminalsymbole))
    - einer Menge von Terminalsymbolen T, das zu N disjunkt ist, (Grundsachen, die nicht weiter vereinfacht werden, z.
      B. <Verb> → "singen" (singen ist hier das Terminal))
    - einem ausgezeichnetes Startsymbol 𝑆 ∈ 𝑁 (eines der Produktionen)
    - und einer endlichen Menge 𝑃 ⊂ 𝑉∗𝑁𝑉∗×𝑉∗ sogenannter Produktionen. (Form: <...> -> <...> <...> (also
      Definitionen))