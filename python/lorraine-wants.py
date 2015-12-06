def unscramble(scramble):
    # your code here
    global word_list # It's unnecessary but to remember you that you were provided with a
                     #list of 2000 words (British English)
    scr_wrd = {}
    for word in word_list:
        key = ''.join(sorted(word))
        if scr_wrd.has_key(key):
            scr_wrd[key] = scr_wrd[key]+[word]
        else:
            scr_wrd[key] = [word]
    key = ''.join(sorted(scramble))
    return scr_wrd[key]
