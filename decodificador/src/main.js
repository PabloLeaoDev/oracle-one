/*
"a" === "ai"
"e" === "enter"
"i" === "imes"
"o" === "ober"
"u" === "ufat"
*/
const VOWELS = ['a', 'e', 'i', 'o', 'u'];
const KEYS = ['i', 'nter', 'mes', 'ber', 'fat'];

function encrypt(phrase) {
    let encryptRes = '';
    let phraseToArray = phrase.split('');
    phraseToArray.map((letter) => {
        switch (letter in VOWELS) {
            case letter === 'a':
                encryptRes += 'ai';
                break;
            case letter === 'e':
                encryptRes += 'enter';
                break;
            case letter === 'i':
                encryptRes += 'imes';
                break;
            case letter === 'o':
                encryptRes += 'ober';
                break;
            case letter === 'u':
                encryptRes += 'ufat';
                break;
        }
        encryptRes += letter;
    })
    return encryptRes;
}

function descrypt(phrase) {
    let count = 0;
    let vwIndex = 0; 
    let phraseArray = phrase.split('');

    phraseArray.map((letter) => {
        let isTrue = VOWELS.indexOf(letter) !== -1 ? true:false;
        if (isTrue) {
            let count1 = 0;

            while (letter !== VOWELS[count1]) {
                count1++;
            }

            vwIndex = VOWELS.indexOf(VOWELS[count1]);

            // variável para encontrar o index que irá abrir o método ".slice"
            let firstSlice = phraseArray.indexOf(letter, count);
            
            // variável para encontrar o index que irá fechar o método ".slice"
            let lastSlice = phraseArray.indexOf(letter, count) + KEYS[vwIndex].length + 1;

            // método ".slice" para retirar os acréscimos da criptografia
            phraseArray.slice(firstSlice, lastSlice);
        }
        count++;
    })
    return phraseArray.join('');
}

console.log(descrypt("pairaibenterns poberr enterncairair enterssenter dentersaifimesober enter tenterr fimesnailimeszaidober enterlenter coberm sufatcenterssober!"));