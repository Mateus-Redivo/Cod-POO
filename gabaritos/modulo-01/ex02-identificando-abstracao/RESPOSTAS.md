# Gabarito — Identificando abstração

Não existe uma única resposta certa aqui; o que importa é a justificativa fazer sentido para o problema. Esta é uma resolução razoável, para comparar.

## Domínio 1: Calculadora de IMC

**Entram**: `nome` (para identificar de quem é o resultado na tela), `peso` (usado direto na fórmula), `altura` (usado direto na fórmula).

**Ficam de fora**: `CPF` (o cálculo de IMC não precisa identificar unicamente a pessoa no mundo real, só exibir um resultado), `cargo` (não influencia peso, altura nem o cálculo).

## Domínio 2: Sistema de RH

**Entram**: `nome`, `CPF` (identificação legal obrigatória para folha de pagamento), `endereço` (correspondência, benefícios de transporte), `cargo`, `salário`.

**Ficam de fora**: `tipo sanguíneo` (não é relevante para gestão de pessoal), `time de futebol` (irrelevante para o problema, por mais que seja um dado real sobre a pessoa).

## Domínio 3: Prontuário de hospital

**Entram**: `nome`, `idade` (influencia diagnóstico e dosagem), `peso` e `altura` (dosagem de medicamento, IMC clínico), `tipo sanguíneo` (crítico em emergências e transfusões), `alergias` (crítico para não prescrever algo perigoso).

**Ficam de fora**: `cargo` e `salário` (não influenciam tratamento médico), `cor favorita` (irrelevante em qualquer domínio sério).

## Pergunta final

1. **`nome`** apareceu nos três domínios. Isso acontece porque identificar "de quem" estamos falando é útil em praticamente qualquer sistema que lide com pessoas, independente do problema específico: é o tipo de atributo que quase nunca é "abstraído para fora".
2. **`tipo sanguíneo`** é um bom exemplo de atributo exclusivo de um domínio (só aparece no hospital). Isso mostra que abstração não é uma propriedade da PESSOA em si (ela sempre tem um tipo sanguíneo, o dado sempre existe no mundo real), é uma propriedade da RELAÇÃO entre a pessoa e o problema que o sistema resolve. O mesmo dado real pode ser essencial num domínio e totalmente irrelevante em outro.
