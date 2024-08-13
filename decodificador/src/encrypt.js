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
                case letter === VOWELS[5]:
                    index = 5;
                    break;
                case letter === VOWELS[6]:
                    index = 6;
                    break;
                case letter === VOWELS[7]:
                    index = 7;
                    break;
                case letter === VOWELS[8]:
                    index = 8;
                    break;
                case letter === VOWELS[9]:
                    index = 9;
                    break;
            }
            encryptRes += KEYS[index];
        } else {
            encryptRes += letter;
        }
    })
    return encryptRes;
}