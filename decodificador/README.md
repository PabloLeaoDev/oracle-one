# Decoder - Sistema de Criptografia e Descriptografia de Textos

Este é um projeto simples de um sistema de criptografia e descriptografia de textos. Ele permite que você criptografe uma frase utilizando um padrão específico de substituição de vogais e descriptografe uma frase que tenha sido previamente criptografada. Além disso, você pode copiar o texto resultante para a área de transferência com um botão dedicado.

## Funcionalidades

- **Criptografia:** Substitui as vogais da frase digitada por sequências de caracteres predefinidas.
- **Descriptografia:** Reverte a criptografia, retornando a frase original.
- **Cópia para área de transferência:** Copia o resultado criptografado ou descriptografado para a área de transferência.

## Tecnologias Utilizadas

- **HTML5:** Estrutura básica do projeto.
- **CSS3:** Estilização das páginas e elementos do projeto com um design Mobile First.
- **JavaScript:** Lógica de criptografia, descriptografia e funcionalidades adicionais, como a cópia do texto.

## Estrutura do Projeto

O projeto está organizado da seguinte forma:


### Arquivos Principais

- **index.html:** Estrutura da página web.
- **main.css:** Estilos principais para a interface do usuário.
- **main.js:** Lógica de controle do estado da criptografia/descriptografia e integração com a interface.
- **encrypt.js:** Função de criptografia que substitui vogais por sequências de caracteres.
- **descrypt.js:** Função de descriptografia que reverte as substituições feitas durante a criptografia.
- **copy.js:** Implementação do botão de copiar utilizando a `Clipboard API`.

## Como Usar

1. **Digite seu texto:** No campo de texto da página principal, insira a frase que deseja criptografar. Lembre-se de que apenas letras minúsculas e sem acento serão aceitas.
2. **Clique em "Criptografar":** O sistema aplicará a criptografia e exibirá o texto resultante na seção de saída.
3. **Descriptografar:** Se você criptografou um texto, pode inserir o texto criptografado novamente e clicar em "Descriptografar" para ver a frase original.
4. **Copiar:** Clique no botão "Copiar" para enviar o texto resultante para a área de transferência.

## Considerações

- O sistema foi desenvolvido com o conceito de "Mobile First" em mente, mas é responsivo para diferentes tamanhos de tela.
- Verifique se a frase está corretamente criptografada antes de tentar descriptografá-la para evitar erros.

## Contribuição

Se desejar contribuir para este projeto, sinta-se à vontade para fazer um fork e enviar um pull request com suas melhorias ou sugestões.

## Licença

Este projeto é de uso livre e aberto para a comunidade. Não há restrições de uso.

---

**Autor:** Pablo Leão Dias dos Santos