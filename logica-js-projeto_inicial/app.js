alert('Boas vindas ao jogo do número secreto!');
const numeroMax = 1000;
let numeroSecreto = Math.floor(Math.random() * numeroMax + 1); 
let maior = numeroMax; 
let menor = 1; 
let tentativas = 0; 
let chute = prompt(`Escolha um número entre ${menor} e ${maior}:`); 

if (chute === null) {
    alert('Por que você desistiu do jogo? :(');
} else {
    while (true) {
        chute = parseInt(chute);
        if (isNaN(chute) || chute > maior || chute < menor) {
            alert('Esse valor não é válido!');
            chute = prompt(`Escolha um número entre ${menor} e ${maior}:`); 
            if (chute === null) {
                alert('Por que você desistiu do jogo? :(');
                break;
            }
            continue;
        } else {
            if (chute > numeroSecreto) {
                alert(`O número secreto é menor do que ${chute}, tente novamente!`);
                maior = chute;
            } else if (chute < numeroSecreto) {
                alert(`O número secreto é maior do que ${chute}, tente novamente!`);
                menor = chute;
            } else {
                if (chute === null) {
                    alert('Por que você desistiu do jogo? :(');
                    break;
                } else if (chute === numeroSecreto) {
                    let qtdTentativas = tentativas === 0 ? 'Você acertou de primeira!':`Você acertou em ${tentativas} tentativas!`;
                    alert(`O número secreto é ${numeroSecreto}! ${qtdTentativas}`);
                    break;
                } 
            }
        } 
        tentativas++;
        chute = prompt(`Escolha um número entre ${menor} e ${maior}:`); 
    }
}
