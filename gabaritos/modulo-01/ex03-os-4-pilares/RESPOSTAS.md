# Gabarito — Os 4 pilares num sistema descrito

## 1. Abstração

Frase: "não importa a raça exata, a cor da pelagem ou o peso do animal: só nome, idade, dono, tipo e data de check-in."

Essa é a decisão explícita de abstração: o problema (hospedagem no hotel) define o que entra no modelo (nome, idade, dono, tipo, check-in) e o que fica de fora (raça, cor, peso), mesmo esses dados existindo de verdade no animal real.

## 2. Encapsulamento

Frase: "Ninguém de fora do sistema deveria conseguir colocar a idade de um animal como um número negativo."

Isso é exatamente o papel do encapsulamento: o objeto (o animal) precisa proteger seus próprios dados, recusando um valor inválido em vez de confiar que quem está de fora vai sempre passar um valor correto.

## 3. Herança

Frase: "cada um tem uma rotina de cuidado diferente [...], mas todos compartilham dados básicos em comum (nome, idade, dono, data de check-in)."

Isso descreve uma classe mãe (algo como `Animal`, com os dados em comum) e classes filhas especializadas (`Cachorro`, `Gato`, `Passaro`), cada uma reaproveitando o que é comum e acrescentando sua própria rotina de cuidado.

## 4. Polimorfismo

Frase: "o sistema executa a rotina de cuidado certa para cada animal, sem o funcionário precisar dizer manualmente qual animal é de qual tipo."

Esse é o comportamento polimórfico clássico: um único comando ("cuidar de todos") é aplicado a uma lista de animais de tipos diferentes, e cada objeto sabe executar a SUA própria versão da rotina, sem que quem chamou o comando precise verificar o tipo de cada um antes.
