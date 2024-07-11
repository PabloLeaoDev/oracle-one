const VOWELS = ['a', 'e', 'i', 'o', 'u'];
const KEYS = ['ai', 'enter', 'imes', 'ober', 'ufat'];
let index;

function encrypt(phrase) {
    let encryptRes = '';
    let phraseArray = phrase.split('');
    phraseArray.map((letter) => {
        let isTrue = VOWELS.indexOf(letter) !== -1 ? true:false;
        if (isTrue) {
            if (letter === VOWELS[0]) {
                index = 0;
            } else if (letter === VOWELS[1]) {
                index = 1;
            } else if (letter === VOWELS[2]) {
                index = 2;
            } else if (letter === VOWELS[3]) {
                index = 3;
            } else if (letter === VOWELS[4]) {
                index = 4;
            }
            encryptRes += KEYS[index];
        } else {
            encryptRes += letter;
        }
    })
    return encryptRes;
}

function descrypt(phrase) {
    let count = 0;
    let phraseArray = phrase.split('');

    phraseArray.map((letter) => {
        let isTrue = VOWELS.indexOf(letter) !== -1 ? true:false;
        if (isTrue) {
            // o "+ 1" é para fazer o "splice" começar a remover os elementos depois da vogal que estará na frase descriptografada
            let spliceStart = phraseArray.indexOf(letter, count) + 1;
            // switch case para definir quantos elementos serão deletados pelo ".splice"
            switch (true) {
                case letter === VOWELS[0]:
                    index = 0;
                    break;
                case letter === VOWELS[1]:
                    index = 1;
                    break;
                case letter === VOWELS[2]:
                    index = 2;
                    break;
                case letter === VOWELS[3]:
                    index = 3;
                    break;
                case letter === VOWELS[4]:
                    index = 4;
                    break;
            }
            // o "- 1" é para não remover o elemento que faz parte da frase descriptografada, haja vista que todas as chaves começam com a respectiva vogal
            let spliceEnd = KEYS[index].length - 1;

            // método ".splice" para retirar os acréscimos da criptografia
            phraseArray.splice(spliceStart, spliceEnd);
        }
        count++;
    })
    return phraseArray.join('');
}