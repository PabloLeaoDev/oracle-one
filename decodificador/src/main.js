const VOWELS = ['a', 'e', 'i', 'o', 'u'];
const KEYS = ['ai', 'enter', 'imes', 'ober', 'ufat'];
let index;
let flagEncrypt = false;
let valueText = '';

function encrypter() {
    if (!flagEncrypt) {
        const removeTxt = document.querySelector('#non-message');
        removeTxt.classList.add('desactive');

        const btnCopy = document.querySelector('#copy');
        btnCopy.classList.add('active');

        const answer = document.querySelector('#answer-p');
        const txt = document.querySelector('#txt');
        answer.classList.add('answer');

        const phrase = txt.value;
        const encryptTxt = encrypt(phrase);
        answer.innerHTML = encryptTxt;
        flagEncrypt = !flagEncrypt;
        valueText = txt.value;
    } else if (flagEncrypt && txt.value === valueText) {
        window.alert('O texto já foi criptografado!');
    } else {
        window.alert('Não posso criptografar um texto que já foi criptografado!');
    }
}

function descrypter() {
    const txt = document.querySelector('#txt');
    if (flagEncrypt && txt.value != valueText) {
        const removeTxt = document.querySelector('#non-message');
        removeTxt.classList.add('desactive');

        const btnCopy = document.querySelector('#copy');
        btnCopy.classList.add('active');

        const answer = document.querySelector('#answer-p');
        const phrase = txt.value;
        const descryptTxt = descrypt(phrase);
        answer.innerHTML = descryptTxt;
        flagEncrypt = !flagEncrypt;
    } else {
        window.alert('Por favor, criptografe a frase antes de descriptografar!');
    }
}