let numSorteados = [];
let numMax = 10;
let numSecreto = gerarNumAleatorio(numMax);
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
    console.log(numSorteados);
}

function gerarNumAleatorio(num) {
    let numEscolhido = Math.floor(Math.random() * (num + 1));
    if (numSorteados.includes(numEscolhido)) {
        return gerarNumAleatorio(num);
    } else {
        numSorteados.push(numEscolhido);
        return numEscolhido;
    }
}

function limparCampo() {
    let chute = document.querySelector('input');
    chute.value = '';
}

function reiniciarJogo() {
    numSecreto = gerarNumAleatorio(10);
    tentativas = 1;
    limparCampo();
    exibirMensagemInicial();
    document.getElementById('reiniciar').setAttribute('disabled', true);
}

function limparNumSorteados() {
    if (numSorteados.length === numMax) {
        while (numSorteados.length > 0) {
            numSorteados.pop();
        }
    }    
}
