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