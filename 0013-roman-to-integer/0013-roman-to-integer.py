class Solution(object):
    def romanToInt(self, s):
        rom_num = { 
            "I": 1, 
            "V": 5, 
            "X": 10, 
            "L": 50, 
            "C": 100, 
            "D": 500, 
            "M": 1000
        }

        total = 0
        for i in range(len(s)-1):  
            if  rom_num[s[i]] < rom_num[s[i+1]]:
                total -= rom_num[s[i]] 

            else:
                total += rom_num[s[i]]

        return total + rom_num[s[-1]]
