class Solution:
    def reverseVowels(self, s: str) -> str:
        vowels = set("aeiouAEIOU")
        s = list(s)        # convert to list
        L, R = 0, len(s)-1

        while L < R:
            # move L until vowel
            while L < R and s[L] not in vowels:
                L += 1

            # move R until vowel
            while L < R and s[R] not in vowels:
                R -= 1

            # now both are vowels → swap
            s[L], s[R] = s[R], s[L]

            L += 1
            R -= 1

        return "".join(s)