const VOWELS = ['a', 'e', 'i', 'o', 'u'];
const KEYS = ['ai', 'enter', 'imes', 'ober', 'ufat'];
let index;

function encrypter() {
    const removeTxt = document.querySelector('#non-message');
    removeTxt.classList.add('desactive');

    const btnCopy = document.querySelector('#copy');
    btnCopy.classList.add('active');

    const answer = document.querySelector('#answer-p');
    const txt = document.querySelector('#txt');
    const phrase = txt.value;
    const encryptTxt = encrypt(phrase);
    answer.innerHTML = encryptTxt;
}

function descrypter() {
    const removeTxt = document.querySelector('#non-message');
    removeTxt.classList.add('desactive');

    const btnCopy = document.querySelector('#copy');
    btnCopy.classList.add('active');

    const answer = document.querySelector('#answer-p');
    const txt = document.querySelector('#txt');
    const phrase = txt.value;
    const descryptTxt = descrypt(phrase);
    answer.innerHTML = descryptTxt;
}