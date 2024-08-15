function encrypt(phrase) {
    let encryptRes = '';
    let phraseArray = phrase.split('');
    phraseArray.map((letter) => {
        let isTrue = VOWELS.indexOf(letter) !== -1 ? true : false;
        if (isTrue) {
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
            encryptRes += KEYS[index];
        } else {
            encryptRes += letter;
        }
    })
    return encryptRes;
}