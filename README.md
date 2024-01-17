# Desenvolvimento do Aplicativo Android - App Cardápio Online

## Introdução

Bem-vindo ao projeto de desenvolvimento do aplicativo Cardápio Online! Este projeto tem como objetivo criar uma solução para melhorar o atendimento e a experiência do cliente em um restaurante. Siga as instruções abaixo para criar a aplicação Android.

## Problemática

O restaurante enfrenta desafios, como falta de ordem nos pedidos, demora no atendimento, erros nos pedidos e caos em períodos de grande movimento. A solução proposta é desenvolver um aplicativo de cardápio online para agilizar o processo de pedidos, melhorar a qualidade da comida e inovar no atendimento personalizado.

## Funcionalidades Propostas

1. O cliente faz o pedido via aplicativo, utilizando a senha da mesa fornecida e a internet gratuita do local.
2. O cardápio é dividido em seções: entradas, pratos principais, bebidas e sobremesas.
3. O aplicativo realiza a soma/subtração dos pratos selecionados/deselecionados pelo cliente.
4. Cada prato possui um tempo médio de preparo visível no cardápio.
5. O cliente pode digitar suas preferências em um campo de texto.
6. Ao finalizar o pedido, o cliente confirma clicando no botão "Realizar Pedido".

## Desenvolvimento da Aplicação Android

### Layout

- Utilize uma paleta de cores alinhada à temática do restaurante.
- Insira o título centralizado no topo, com margens e padding a critério.
- Adicione as seções na ordem especificada pelo estabelecimento.
- A seção de entradas deve conter quatro tipos de comidas de preparo rápido.
- Cada item do cardápio deve conter:
    1. Título
    2. Subtítulo
    3. Seção com nomes dos pratos
    4. Quatro opções de pratos
    5. Seção com nomes de bebidas
    6. Checkbox para duas opções de bebidas com preços
    7. TextView para exibição do total a ser gasto
    8. Botão "Finalizar Pedido"

### Funcionalidades

- Adicione elementos de checkbox para realizar a soma entre os pratos marcados.
- Implemente a subtração para desmarcação de pratos anteriormente selecionados.
- Utilize ViewGroup para construir o menu, seguindo as boas práticas de programação front-end.
- Implemente a lógica para calcular o total, exibindo-o ao usuário.
- Adicione um botão "Realizar Pedido" com um Toast longo informando que o pedido foi enviado.

### Tratamento de Erros

- Trate a situação em que o usuário tenta finalizar o pedido sem selecionar nenhum produto, exibindo um Toast curto indicando a necessidade de selecionar ao menos um produto.

### Back-end e Front-end

- Programe tanto o back-end quanto o front-end da aplicação, seguindo as convenções de código Android e adotando boas práticas aprendidas nas aulas.

## Plataformas Utilizadas

Escolha uma das opções de entrega:
1. **Somente o Front:** Desenhe a tela da aplicação sem programação, apenas visual.
2. **Somente o Back:** Desenvolva a base de programação sem a interface visual.
3. **Completo:** Desenvolva toda a aplicação, contemplando front-end e back-end.

## Entrega do Trabalho

Escolha entre as opções de entrega:
1. **PDF:** Capturas de tela em sequência com explicações em texto, contendo data e hora.
2. **Vídeo com narração:** Vídeo de 3 a 7 minutos explicando o aplicativo desenvolvido, com qualidade 1280 x 720 pixels e data/hora visíveis.

## Tópicos de Avaliação

Os tópicos de avaliação variam de acordo com a escolha do aluno:
- Concordância com as convenções de código Android (0,5 pontos) - Back ou Front.
- Harmonização de cores e usabilidade (0,5 pontos) - Front.
- Organização do código com relação à indentação (0,5 pontos) - Back ou Front.
- Organização dos elementos visuais (0,5 pontos) - Front.
- Realização dos cálculos em concordância com as requisições do usuário (0,5 pontos) - Back.
- Tratamento de dados em caso de crash da aplicação (0,5 pontos) - Back.

**Observação:** A versão completa da aplicação terá um peso maior na pontuação total.