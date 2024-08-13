const VOWELS = ['a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'];
const KEYS = ['ai', 'enter', 'imes', 'ober', 'ufat', 'AI', 'ENTER', 'IMES', 'OBER', 'UFAT'];
let index;

function encrypter() {
    const removeTxt = document.querySelector('#non-message');
    removeTxt.classList.add('desactive');

    const answer = document.querySelector('#answer-p');
    const txt = document.querySelector('#txt');
    const phrase = txt.value;
    const encryptTxt = encrypt(phrase);
    answer.innerHTML = encryptTxt;
}

function descrypter() {
    const removeTxt = document.querySelector('#non-message');
    removeTxt.classList.add('desactive');

    const answer = document.querySelector('#answer-p');
    const txt = document.querySelector('#txt');
    const phrase = txt.value;
    const descryptTxt = descrypt(phrase);
    answer.innerHTML = descryptTxt;
}