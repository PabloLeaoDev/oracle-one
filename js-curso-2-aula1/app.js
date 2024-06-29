let numSorteados = [];
let numMax = 10;
let numSecreto = gerarNumAleatorio(numMax);
console.log(numSorteados);
let tentativas = 1;

function exibirTexto(tag, texto) {
    let varName = document.querySelector(tag);
    varName.innerHTML = texto;
}

function exibirMensagemInicial() {
    exibirTexto('h1', 'Jogo do número secreto');
    exibirTexto('p', 'Escolha um número entre 1 e 10');
}

exibirMensagemInicial();

function verificarChute() {
    let chute = parseInt(document.querySelector('input').value);
    if (chute === numSecreto) {
        exibirTexto('h1', 'Acertou!');
        exibirTexto('p', `Você descobriu o número secreto na ${tentativas}° tentativa!`);
        document.getElementById('reiniciar').removeAttribute('disabled');
    } else {
        if (chute > numSecreto) {
            exibirTexto('p', 'O número secreto é menor');
        } else if (chute < numSecreto) {
            exibirTexto('p', 'O número secreto é maior');
        }
        tentativas++;
        limparCampo();
    }
}

function gerarNumAleatorio(num) {
    let numEscolhido;
    do {
        numEscolhido = Math.floor(Math.random() * num + 1);
    } while (numSorteados.includes(numEscolhido));
    numSorteados.push(numEscolhido);
    return numEscolhido;
}

function limparCampo() {
    let chute = document.querySelector('input');
    chute.value = '';
}

function reiniciarJogo() {
    if (numSorteados.length >= numMax) {
        limparNumSorteados();
    }
    numSecreto = gerarNumAleatorio(10);
    tentativas = 1;
    console.log(numSorteados);
    limparCampo();
    exibirMensagemInicial();
    document.getElementById('reiniciar').setAttribute('disabled', true);
}

function limparNumSorteados() {
    numSorteados = [];
}
